package src;

import src.GUI.GUI;

import java.util.ArrayList;
import java.util.Objects;

public class Anime_info implements Runnable {
    @Override
    public void run() {

    }

    // Create gui object
    static GUI gui;

    // function get all the indicated chapters
    public static ArrayList<String> getAllChapters() {
        String chapters = gui.getChapters().replaceAll("\\s+", "");
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
            chapters_array.add(gui.jTextArea1.getText());
        }

        return chapters_array;
    }

    // function to divide the string of chapters in an ArrayList.
    private static ArrayList<String> separateChapters(String chapters) {
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
}
