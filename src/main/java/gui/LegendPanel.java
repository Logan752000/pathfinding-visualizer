package gui;

import javax.swing.*;
import java.awt.*;

public class LegendPanel extends JPanel {

    public LegendPanel(){
        this.setBackground(Color.blue);

        ImageIcon image = new ImageIcon("C:\\Users\\brian\\IdeaProjects\\pathfinding-visualizer\\src\\main\\resources\\green.png");
        JLabel label = new JLabel();

        //setHorizontalTextPosition(JLabel.(center = center, LEFT, RIGHT, .....)
        //setVerticalTextPosition(JLabel.(CENTER,TOP, BOTTOm...))
        label.setHorizontalTextPosition(JLabel.RIGHT);

        label.setText("Lost ark"); //Add a text on the panel
        label.setForeground(Color.GREEN); //Change the color of label
        label.setHorizontalTextPosition(JLabel.RIGHT);
        //Font("Font style", "Font type (Bold, Plain, undrlined ...), "Font size)
        label.setFont(new Font("MV Boli", Font.PLAIN,20));
        label.setIcon(image);

        this.setVisible(true);
        this.add(label);
    }
}
