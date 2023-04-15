package src.GUI;

import src.Anime_info;
import src.WebInteractions;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;


public class GUI extends javax.swing.JFrame {

    public static GUI getInfo;

    public GUI() {
        initComponents();
    }

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
    }

    // Creation of object to interact with the web
    WebInteractions web_interactions = new WebInteractions();
    // Create object to get Anime info
    Anime_info anime_info = new Anime_info();

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!Objects.equals(jTextArea1.getText(), "") && !Objects.equals(jTextArea2.getText(), "") && jTextArea1.getText().charAt(jTextArea1.getText().length() - 1) != '-' && jTextArea1.getText().charAt(jTextArea1.getText().length() - 1) != ',') {
            setAnimeName();
            setChapters();
            Anime_info.getAllChapters();

            try {
                web_interactions.searchVideos();
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
        setAnimeName();
        anime_info.run();
        if (!Objects.equals(jTextArea2.getText(), "")) {
            web_interactions.searchAnimeNames();
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
                getInfo = new GUI();
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
    public javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextArea jTextArea2;
    public javax.swing.JLabel actual_chapter;
    public javax.swing.JProgressBar download_progress;

    private String name;
    private String chapters;
    private File file;

    // End of variables declaration//GEN-END:variables
    public static void runnable() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // function to get correct name format of the url
    public String replaceSpaceAnimeName() {
        return (getAnimeName().replace(" ", "-"));
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

    public String getAnimeName() {
        return this.name;
    }

    public String getChapters() {
        return this.chapters;
    }

    public File getDestinationFolder() {
        return file;
    }
}
