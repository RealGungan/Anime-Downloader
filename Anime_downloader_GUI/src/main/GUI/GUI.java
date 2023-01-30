package Anime_downloader_GUI.src.main.GUI;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.html.*;
import com.gargoylesoftware.htmlunit.util.WebConnectionWrapper;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        download_progress = new javax.swing.JProgressBar();
        actual_chapter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[]{0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[]{0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Anime downlader");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Anime name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 20);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Chapters");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 14, 0, 14);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Example: 1,3,8,11,222)");
        jLabel4.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 36;
        gridBagConstraints.gridwidth = 5;
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("(To download multiple chapters");
        jLabel5.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.gridwidth = 5;
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("use '-'. Example: 1-5. In order to");
        jLabel6.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setText("download individual files use ','.");
        jLabel7.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        getContentPane().add(jLabel7, gridBagConstraints);

        jButton1.setText("Download");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 22;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Destination folder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        getContentPane().add(jButton2, gridBagConstraints);

        jTextArea1.setColumns(10);
        jTextArea1.setRows(1);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setLineWrap(true);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jTextArea2.setColumns(10);
        jTextArea2.setRows(1);
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setLineWrap(true);
        jScrollPane2.setViewportView(jTextArea2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jScrollPane2, gridBagConstraints);

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton3ActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 22;
        getContentPane().add(jButton3, gridBagConstraints);

        download_progress.setBackground(new java.awt.Color(255, 255, 255));
        download_progress.setForeground(new java.awt.Color(102, 255, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 7;
        getContentPane().add(download_progress, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 7;
        getContentPane().add(actual_chapter, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!Objects.equals(jTextArea1.getText(), "") && !Objects.equals(jTextArea2.getText(), "") && jTextArea1.getText().charAt(jTextArea1.getText().length() - 1) != '-' && jTextArea1.getText().charAt(jTextArea1.getText().length() - 1) != ',') {
            setAnimeName();
            setChapters();
            setDownload();

            getAllChapters();

            try {
                searchVideos();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must fill the fields in a correct way");
        }

        if (getDestinationFolder() == null) {
            JOptionPane.showMessageDialog(null, "Select destination folder");
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // Downloads Directory as default
        JFileChooser fc = new JFileChooser(new File(System.getProperty("user.home") + "\\Downloads"));
        fc.setDialogTitle("Select Location");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setAcceptAllFileFilterUsed(false);

        int response = fc.showOpenDialog(null);

        if (response == JFileChooser.APPROVE_OPTION) {
            File file = new File(fc.getSelectedFile().getAbsolutePath());

            setFileDestination(file);
        }
    }

    // When 'search' button is pressed, the introduced name will be searched.
    // This is done if there are multiple animes with the same name.
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
        if (!Objects.equals(jTextArea2.getText(), "")) {
            setAnimeName();

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
            HtmlPage page = webClient.getPage("https://jkanime.net/buscar/" + getAnimeName());

            // Find all h5 elements on the page
            List<HtmlHeading5> h5List = page.getByXPath("//h5[contains(.," + getAnimeName().toLowerCase(Locale.ROOT) + ")]");

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

                jTextArea2.setText(result);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You must introduce an anime name");
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel actual_chapter;
    private javax.swing.JProgressBar download_progress;

    private String name;
    private String chapters;
    private File file;
    private boolean download;

    // End of variables declaration//GEN-END:variables
    public static void runnable() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // function to get correct name fot the url
    public String replaceSpaceAnimeName() {
        String name = getAnimeName();

        return (name.replace(" ", "-"));
    }

    // function get all the indicated chapters
    public ArrayList<String> getAllChapters() {
        String chapters = getChapters().replaceAll("\\s+", "");
        ArrayList<String> separated_chapters = new ArrayList<String>();
        ArrayList<String> chapters_array = new ArrayList<String>();
        int start = 0; // variable for the start the interval between chapters
        int end = 0; // variable for the end the interval between chapters
        boolean multiple_chapters = false; // boolean to check if char is '-'
        boolean individual_chapter = false; // boolean to check if char is ','

        // if the string contains multiple chapters enter the 'if'
        if (chapters.contains(",") || chapters.contains("-")) {
            // call the function to separate the chapters
            separated_chapters = separateChapters(chapters);

            for (int i = 0; i < separated_chapters.size(); i++) {
                // check if the actual chapter is a number and the variable 'start' is 0
                if (!Objects.equals(separated_chapters.get(i), "-") && !Objects.equals(separated_chapters.get(i), ",") && start == 0) {
                    // set the variable start to actual number
                    start = Integer.parseInt(separated_chapters.get(i));
                }

                // get interval of chapters
                if (multiple_chapters) {
                    end = Integer.parseInt(separated_chapters.get(i));

                    while (start <= end) {
                        chapters_array.add(String.valueOf(start));

                        start++;
                    }

                    start = 0;
                    multiple_chapters = false;
                }

                // get individual chapter
                if (individual_chapter) {
                    if (i + 3 < separated_chapters.size()) {
                        // check if 3 positions ahead, there's a '-' and if actual char isn't ','
                        if (Objects.equals(separated_chapters.get(i + 3), "-") && !Objects.equals(separated_chapters.get(i), ",")) {
                            // add number to array
                            chapters_array.add(separated_chapters.get(i));
                            // set start to number two positions ahead
                            start = Integer.parseInt(separated_chapters.get(i + 2));
                            // set individual to false
                            individual_chapter = false;
                        } else if (i + 1 < separated_chapters.size()) {
                            // check if 1 position ahead there's a '-' and if actual char isn't '-'
                            if (!Objects.equals(separated_chapters.get(i + 1), "-") && !Objects.equals(separated_chapters.get(i), "-")) {
                                chapters_array.add(separated_chapters.get(i));
                                individual_chapter = false;
                            }
                            // if not, check if actual char isn't '-'
                        } else if (!Objects.equals(separated_chapters.get(i), "-")) {
                            start = Integer.parseInt(separated_chapters.get(i));
                        }
                    } else if (i + 1 < separated_chapters.size()) {
                        // check if 1 position ahead there's a '-' and if actual char isn't '-'
                        if (!Objects.equals(separated_chapters.get(i + 1), "-") && !Objects.equals(separated_chapters.get(i), "-")) {
                            chapters_array.add(separated_chapters.get(i));
                            individual_chapter = false;
                        }
                        // check if actual char isn't '-'
                    } else if (!Objects.equals(separated_chapters.get(i), "-")) {
                        chapters_array.add(separated_chapters.get(i));
                    }
                }

                // check if actual char is '-'
                if (Objects.equals(separated_chapters.get(i), "-")) {
                    multiple_chapters = true;
                }

                if (i + 1 < separated_chapters.size()) {
                    // check if 1 position ahead, there's a ',' and 'i' isn't 0
                    if (Objects.equals(separated_chapters.get(i + 1), ",") && i == 0) {
                        chapters_array.add(separated_chapters.get(i));
                    }
                }

                // check if actual char is ','
                if (Objects.equals(separated_chapters.get(i), ",")) {
                    individual_chapter = true;
                }
            }
            // if it is only one chapter, add it
        } else {
            chapters_array.add(jTextArea1.getText());
        }

        return chapters_array;
    }

    // function to divide the string of chapters in an ArrayList.
    private ArrayList<String> separateChapters(String chapters) {
        ArrayList<String> separated_chapters = new ArrayList<String>();
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < chapters.length(); i++) {
            if (chapters.charAt(i) != '-' && chapters.charAt(i) != ',') {
                number.append(chapters.charAt(i));
            } else {
                separated_chapters.add(number.toString());
                separated_chapters.add(String.valueOf(chapters.charAt(i)));
                number = new StringBuilder();
            }
        }

        separated_chapters.add(number.toString());

        return separated_chapters;
    }

    // function to get the src of the videos
    public void searchVideos() throws IOException {
        // Get the selected chapters
        ArrayList<String> chapters = getAllChapters();

        // Get the anime name with the spaces changed
        String anime_name = replaceSpaceAnimeName();

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
        URL url = new URL(video);
        String anime_name = replaceSpaceAnimeName();
        InputStream in = url.openStream();
        OutputStream out = new BufferedOutputStream(new FileOutputStream(getDestinationFolder() + "\\" + anime_name + " " + chapter + ".mp4"));

        for (int b; (b = in.read()) != -1; ) {
            out.write(b);
        }

        out.close();
        in.close();
    }

    public void setAnimeName() {
        this.name = jTextArea2.getText();
    }

    public void setChapters() {
        this.chapters = jTextArea1.getText();
    }

    public void setFileDestination(File file) {
        this.file = file;
    }

    public void setDownload() {
        this.download = true;
    }

    public String getAnimeName() {
        return this.name;
    }

    public String getChapters() {
        return this.chapters;
    }

    public File getDestinationFolder() {
        return file;
    }

    public boolean getDownload() {
        return download;
    }
}
