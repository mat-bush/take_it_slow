// Things to do...
// 1) create buttons
//   a: play/pause 
//   b: hold
//   c: skip
// 2) create text fields
//   a: time stamp
// 3) drop down
//   a: songs
// 4) labels
//   a: song
//   b: song time stamp
//   




import javax.swing.*;
import java.awt.*;


public class mainscrn extends JFrame {

    public void init(){
        Container pane = this.getContentPane();
        pane.setLayout(null);

        // buttons
        JButton playbtn = new JButton("Play");
        playbtn.setBounds(12, 50, 80, 20);
        pane.add(playbtn);

        JButton holdbtn = new JButton("Hold");
        holdbtn.setBounds(12, 75, 80, 20);
        pane.add(holdbtn);

        JButton skipbtn = new JButton("Skip");
        skipbtn.setBounds(12, 100, 35, 20);
        pane.add(skipbtn);

        JButton backbtn = new JButton("Go Back");
        backbtn.setBounds(57, 100, 35, 20);
        pane.add(backbtn);

        // text fields/Areas
        JTextPane tmstmp = new JTextPane(); //timestamp
        tmstmp.setBounds(12,145,80,20);
        tmstmp.setEditable(false);
        pane.add(tmstmp);

        // drop down for songs
        String[] Songs = {"Song A", "Song B"}; // song choices

        JComboBox sngdrpdn = new JComboBox<String>(Songs);
        sngdrpdn.setBounds(6,195,160,30);
        pane.add(sngdrpdn);

        // labels
        JLabel tmlLabel = new JLabel("Time Stamp");
        tmlLabel.setBounds(12,125,80,20);
        pane.add(tmlLabel);

        JLabel sngJLabel = new JLabel("Songs");
        sngJLabel.setBounds(12,165,80,30);
        pane.add(sngJLabel);

        
    }
    public static void main(String[] args) {
        mainscrn GUI = new mainscrn();

        GUI.init();
        GUI.setSize(800, 450);
        GUI.setTitle("Take It Slow");
        GUI.setVisible(true);
        GUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
    
}