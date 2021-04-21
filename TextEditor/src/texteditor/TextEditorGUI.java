package texteditor;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

public class TextEditorGUI extends javax.swing.JFrame {

    String filename;
    Clipboard clipboard = getToolkit().getSystemClipboard();

    public TextEditorGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Searchbutton = new javax.swing.JButton();
        searchfield = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newfile = new javax.swing.JMenuItem();
        openfile = new javax.swing.JMenuItem();
        savefile = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cuttext = new javax.swing.JMenuItem();
        copytext = new javax.swing.JMenuItem();
        pastetext = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Searchbutton.setBackground(new java.awt.Color(255, 255, 255));
        Searchbutton.setFont(new java.awt.Font("Yu Gothic", 1, 13)); // NOI18N
        Searchbutton.setForeground(new java.awt.Color(240, 240, 240));
        Searchbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/SearchIcon.png"))); // NOI18N
        Searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbuttonActionPerformed(evt);
            }
        });

        searchfield.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        searchfield.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        textarea.setColumns(20);
        textarea.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        textarea.setLineWrap(true);
        textarea.setRows(5);
        textarea.setWrapStyleWord(true);
        textarea.setBorder(null);
        jScrollPane2.setViewportView(textarea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Searchbutton)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Searchbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/fileIcon.png"))); // NOI18N
        jMenu1.setText("File");

        newfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/newIcon.png"))); // NOI18N
        newfile.setText("New");
        newfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newfileActionPerformed(evt);
            }
        });
        jMenu1.add(newfile);

        openfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/openIcon.png"))); // NOI18N
        openfile.setText("Open");
        openfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openfileActionPerformed(evt);
            }
        });
        jMenu1.add(openfile);

        savefile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/SaveIcon.png"))); // NOI18N
        savefile.setText("Save");
        savefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefileActionPerformed(evt);
            }
        });
        jMenu1.add(savefile);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/closeIcon.png"))); // NOI18N
        exit.setText("Close");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/editIcon.png"))); // NOI18N
        jMenu2.setText("Edit");

        cuttext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/cutIcon.png"))); // NOI18N
        cuttext.setText("Cut");
        cuttext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuttextActionPerformed(evt);
            }
        });
        jMenu2.add(cuttext);

        copytext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/copyIcon.png"))); // NOI18N
        copytext.setText("Copy");
        copytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copytextActionPerformed(evt);
            }
        });
        jMenu2.add(copytext);

        pastetext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/pasteIcon.png"))); // NOI18N
        pastetext.setText("Paste");
        pastetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastetextActionPerformed(evt);
            }
        });
        jMenu2.add(pastetext);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbuttonActionPerformed
        // TODO add your handling code here:
        searchTextArea(textarea, searchfield.getText());

    }//GEN-LAST:event_SearchbuttonActionPerformed
    class wordHighlighter extends DefaultHighlighter.DefaultHighlightPainter {

        public wordHighlighter(Color color) {
            super(color);
        }
    }
    DefaultHighlighter.HighlightPainter highlighter = new wordHighlighter(Color.YELLOW);

    public void removeHighlighter(JTextComponent textComp) {
        Highlighter removeHighlighter = textComp.getHighlighter();
        Highlighter.Highlight[] remove = removeHighlighter.getHighlights();

        for (int i = 0; i < remove.length; i++) {
            if (remove[i].getPainter() instanceof wordHighlighter) {
                removeHighlighter.removeHighlight(remove[i]);
            }
        }
    }

    @SuppressWarnings("empty-statement")
    public void searchTextArea(JTextComponent textComp, String textString) {
        System.out.println("---Search Button Pressed---");
        removeHighlighter(textComp);
        try {
            Highlighter hilight = textComp.getHighlighter();
            Document doc = textComp.getDocument();
            String text = doc.getText(0, doc.getLength());

            int pos = 0;
            while ((pos = text.toUpperCase().indexOf(textString.toUpperCase(), pos)) >= 0);
            {
                hilight.addHighlight(pos, pos + textString.length(), highlighter);
                pos += textString.length();
            }
        } catch (Exception e) {
        System.out.println("---Search Button Pressed(Error)---");
        }
    }

    private void newfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newfileActionPerformed
        // TODO add your handling code here:
        textarea.setText("");
        setTitle(filename);
    }//GEN-LAST:event_newfileActionPerformed

    private void openfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openfileActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog = new FileDialog(TextEditorGUI.this, "Open File", FileDialog.LOAD);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();

            String line = null;

            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
                textarea.setText(sb.toString());
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("File Not Found(open File Error)");
        }
    }//GEN-LAST:event_openfileActionPerformed

    private void savefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefileActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog = new FileDialog(TextEditorGUI.this, "Save File", FileDialog.SAVE);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            filename = fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(textarea.getText());
            setTitle(filename);
            fileWriter.close();

        } catch (Exception e) {
            System.out.println("File Not Found(Save File Error)");
        }
    }//GEN-LAST:event_savefileActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void cuttextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuttextActionPerformed
        // TODO add your handling code here:
        String cutString = textarea.getSelectedText();
        StringSelection cutSelection = new StringSelection(cutString);
        clipboard.setContents(cutSelection, cutSelection);
        textarea.replaceRange("", textarea.getSelectionStart(), textarea.getSelectionEnd());

    }//GEN-LAST:event_cuttextActionPerformed

    private void copytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copytextActionPerformed
        // TODO add your handling code here:
        String copytext = textarea.getSelectedText();
        StringSelection copySelection = new StringSelection(copytext);
        clipboard.setContents(copySelection, copySelection);
    }//GEN-LAST:event_copytextActionPerformed

    private void pastetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastetextActionPerformed
        // TODO add your handling code here:
        try {
            Transferable pasteText = clipboard.getContents(TextEditorGUI.this);
            String sel = (String) pasteText.getTransferData(DataFlavor.stringFlavor);
            textarea.replaceRange(sel, textarea.getSelectionStart(), textarea.getSelectionEnd());

        } catch (Exception e) {
            System.out.println("Not File Found(Paste Error)");
        }
    }//GEN-LAST:event_pastetextActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TextEditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextEditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextEditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextEditorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Searchbutton;
    private javax.swing.JMenuItem copytext;
    private javax.swing.JMenuItem cuttext;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem newfile;
    private javax.swing.JMenuItem openfile;
    private javax.swing.JMenuItem pastetext;
    private javax.swing.JMenuItem savefile;
    private javax.swing.JTextField searchfield;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}
