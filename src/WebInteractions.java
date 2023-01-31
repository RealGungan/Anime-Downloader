package src;

import src.GUI.GUI;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlHeading5;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlVideo;
import com.gargoylesoftware.htmlunit.util.WebConnectionWrapper;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;

public class WebInteractions implements Runnable {
    static GUI gui;

    @Override
    public void run() {
        try {
            searchAnimeNames();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchAnimeNames() throws IOException {

        JPanel panel = new JPanel();

        String result = null;
        ArrayList<String> names = new ArrayList<>();

        // Create the web client
        WebClient webClient = new WebClient();
        // Used to make the search faster
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setRedirectEnabled(true);

        // Prevents red text from appearing in the terminal
        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(Level.OFF);
        // used to ignore errors in html and js code
        webClient.getOptions().setThrowExceptionOnScriptError(false);

        // Load the page
        HtmlPage page = webClient.getPage("https://jkanime.net/buscar/" + GUI.getInfo.getAnimeName());

        // Find all h5 elements on the page
        List<HtmlHeading5> h5List = page.getByXPath("//h5[contains(.," + GUI.getInfo.getAnimeName().toLowerCase(Locale.ROOT) + ")]");

        // Iterate over the h5 elements
        for (HtmlHeading5 h5 : h5List) {
            // Get the text of the h5 element
            HtmlAnchor anchor = h5.getFirstByXPath(".//a");
            String href = anchor.getHrefAttribute();

            // Remove unwanted text from the url just to leave the name
            href = href.replace("https://jkanime.net/", "");
            href = href.substring(0, href.length() - 1);

            // Add the name to an array
            names.add(href);
        }

        // Close the web client
        webClient.close();

        // Show a pop-up with a selection of the different animes with the key word on them
        panel.add(new JLabel("Select the anime you want:"));
        DefaultComboBoxModel model = new DefaultComboBoxModel();

        for (String value : names) {
            model.addElement(value);
        }

        JComboBox comboBox = new JComboBox(model);
        panel.add(comboBox);

        int iResult = JOptionPane.showConfirmDialog(null, panel, "Animes", JOptionPane.OK_CANCEL_OPTION);

        if (iResult == JOptionPane.OK_OPTION) {
            result = (String) comboBox.getSelectedItem();

            GUI.getInfo.jTextArea2.setText(result);
        }
    }

    // function to get the src of the videos
    public void searchVideos() throws IOException {
        // Get the selected chapters
        ArrayList<String> chapters = Anime_info.getAllChapters();

        // Get the anime name with the spaces changed
        String anime_name = GUI.getInfo.replaceSpaceAnimeName();

        int i = 0;

        while (i < chapters.size()) {
            // create a new web client object to get the connection
            WebClient webClient = new WebClient();
            // Used to make the search faster
            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setUseInsecureSSL(true);
            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
            webClient.getOptions().setRedirectEnabled(true);
            // Prevents red text from appearing in the terminal
            java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
            java.util.logging.Logger.getLogger("org.apache.http").setLevel(Level.OFF);
            // used to ignore errors in html and js code
            webClient.getOptions().setThrowExceptionOnScriptError(false);

            List<String> list = new ArrayList<>();

            // object to load js
            new WebConnectionWrapper(webClient) {
                @Override
                public WebResponse getResponse(WebRequest request) throws IOException {
                    WebResponse response = super.getResponse(request);

                    // search for the src of the current chapter
                    if (request.getUrl().toString().startsWith("https://jkanime.net/gsplay/player.html"))
                        list.add(request.getUrl().toString());

                    return response;
                }
            };

            String chapter_url = "https://jkanime.net/" + anime_name + "/" + chapters.get(i) + "/";

            webClient.getPage(chapter_url);

            webClient.waitForBackgroundJavaScript(1_000);

            String page_url = list.get(0);
            HtmlPage page = webClient.getPage(page_url);
            webClient.waitForBackgroundJavaScriptStartingBefore(1_000);
            // create the video using the correspondant src
            HtmlVideo video = (HtmlVideo) page.getElementsByTagName("video").get(0);

            // call the function to download the video
            downloadVideo(video.getSrc(), chapters.get(i));

            // clear the list where the src is stored
            list.clear();
            i++;

            // MUST BE CLOSED because if not, it won't work
            webClient.close();
        }
    }

    // function to download the video
    public void downloadVideo(String video, String chapter) throws IOException {
        String anime_name = GUI.getInfo.replaceSpaceAnimeName();

        GUI.getInfo.actual_chapter.setText("Downloading " + anime_name + " " + chapter);

        URL url = new URL(video);
        InputStream in = url.openStream();
        OutputStream out = new BufferedOutputStream(new FileOutputStream(GUI.getInfo.getDestinationFolder() + "\\" + anime_name + " " + chapter + ".mp4"));

        GUI.getInfo.download_progress.setMaximum(in.available());

        for (int b; (b = in.read()) != -1; ) {
            out.write(b);
            GUI.getInfo.download_progress.setValue(b);
        }

        out.close();
        in.close();
    }
}
