import javax.swing.*;
import java.awt.*;


public class mainscrn extends JFrame {

    public void init(){
        Container pane = this.getContentPane();
        pane.setLayout(null);

        
    }
    public static void main(String[] args) {
        mainscrn GUI = new mainscrn();


        GUI.setSize(800, 450);
        GUI.setTitle("Title");
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
}