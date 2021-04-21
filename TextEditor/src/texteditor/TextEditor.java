package texteditor;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Hassan Yosuf
 */
public class TextEditor {

   
    public static void main(String[] args) {
        // TODO code application logic here
        TextEditorGUI obj = new TextEditorGUI();
        obj.setBounds(0,0,700,700);
        obj.setTitle("TextEditor");
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Documents\\NetBeansProjects\\TextEditor\\src\\TextEditorIcon.png");
        obj.setIconImage(icon);  
        
        
        
        
    }
    
}
