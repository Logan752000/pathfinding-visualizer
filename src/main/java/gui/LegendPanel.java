package gui;

import javax.swing.*;
import java.awt.*;

public class LegendPanel extends JPanel {

    public LegendPanel(){
        this.setBackground(Color.blue);

        ImageIcon green = new ImageIcon("C:\\Users\\brian\\IdeaProjects\\pathfinding-visualizer\\src\\main\\resources\\green.png");
        ImageIcon red = new ImageIcon("C:\\Users\\brian\\IdeaProjects\\pathfinding-visualizer\\src\\main\\resources\\red.jpg");
        ImageIcon pink = new ImageIcon("C:\\Users\\brian\\IdeaProjects\\pathfinding-visualizer\\src\\main\\resources\\pink.jpg");
        ImageIcon cyan = new ImageIcon("C:\\Users\\brian\\IdeaProjects\\pathfinding-visualizer\\src\\main\\resources\\cyan.jpg");
        ImageIcon yellow = new ImageIcon("C:\\Users\\brian\\IdeaProjects\\pathfinding-visualizer\\src\\main\\resources\\yellow.png");
        ImageIcon black = new ImageIcon("C:\\Users\\brian\\IdeaProjects\\pathfinding-visualizer\\src\\main\\resources\\black.jpg");



        JLabel label = new JLabel(); //Starting Node
        JLabel target_label = new JLabel(); //Targeted Node
        JLabel current_label = new JLabel(); //Current Node
        JLabel visited_label = new JLabel(); //visited Node
        JLabel path_label = new JLabel(); //Path Node
        JLabel wall_label = new JLabel(); //Wall Node


        //setHorizontalTextPosition(JLabel.(center = center, LEFT, RIGHT, .....)
        //setVerticalTextPosition(JLabel.(CENTER,TOP, BOTTOm...))

        label.setIcon(green); //Add iamge to label
        label.setText("Starting Node"); //Add a text on the panel
        label.setForeground(Color.GREEN); //Change the color of label
        label.setHorizontalTextPosition(JLabel.RIGHT);//Put text on the right side of image

        //Font("Font style", "Font type (Bold, Plain, undrlined ...), "Font size)
        label.setFont(new Font("MV Boli", Font.PLAIN,20));

        label.setIconTextGap(15);//set the gap between image and text

        ///////////////////////////////////////////////////////////////////////////////////////

        target_label.setIcon(red); //Add iamge to label
        target_label.setText("Targeted Node"); //Add a text on the panel
        target_label.setForeground(Color.RED); //Change the color of label
        target_label.setHorizontalTextPosition(JLabel.RIGHT);//Put text on the right side of image

        //Font("Font style", "Font type (Bold, Plain, undrlined ...), "Font size)
        target_label.setFont(new Font("MV Boli", Font.PLAIN,20));

        target_label.setIconTextGap(9);//set the gap between image and text

        ///////////////////////////////////////////////////////////////////////////////////////

        current_label.setIcon(pink); //Add iamge to label
        current_label.setText("Current Node"); //Add a text on the panel
        current_label.setForeground(Color.PINK); //Change the color of label
        current_label.setHorizontalTextPosition(JLabel.RIGHT);//Put text on the right side of image

        //Font("Font style", "Font type (Bold, Plain, undrlined ...), "Font size)
        current_label.setFont(new Font("MV Boli", Font.PLAIN,20));

        current_label.setIconTextGap(19);//set the gap between image and text

        ///////////////////////////////////////////////////////////////////////////////////////

        visited_label.setIcon(cyan); //Add iamge to label
        visited_label.setText("Visited Node"); //Add a text on the panel
        visited_label.setForeground(Color.PINK); //Change the color of label
        visited_label.setHorizontalTextPosition(JLabel.RIGHT);//Put text on the right side of image

        //Font("Font style", "Font type (Bold, Plain, undrlined ...), "Font size)
        visited_label.setFont(new Font("MV Boli", Font.PLAIN,20));

        visited_label.setIconTextGap(30);//set the gap between image and text

        ///////////////////////////////////////////////////////////////////////////////////////

        path_label.setIcon(yellow); //Add iamge to label
        path_label.setText("Path Node"); //Add a text on the panel
        path_label.setForeground(Color.PINK); //Change the color of label
        path_label.setHorizontalTextPosition(JLabel.RIGHT);//Put text on the right side of image

        //Font("Font style", "Font type (Bold, Plain, undrlined ...), "Font size)
        path_label.setFont(new Font("MV Boli", Font.PLAIN,20));

        path_label.setIconTextGap(46);//set the gap between image and text

        ///////////////////////////////////////////////////////////////////////////////////////

        wall_label.setIcon(black); //Add iamge to label
        wall_label.setText("Wall Node"); //Add a text on the panel
        wall_label.setForeground(Color.PINK); //Change the color of label
        wall_label.setHorizontalTextPosition(JLabel.RIGHT);//Put text on the right side of image

        //Font("Font style", "Font type (Bold, Plain, undrlined ...), "Font size)
        wall_label.setFont(new Font("MV Boli", Font.PLAIN,20));

        wall_label.setIconTextGap(52);//set the gap between image and text


        this.setVisible(true);
        this.add(label);
        this.add(target_label);
        this.add(current_label);
        this.add(visited_label);
        this.add(path_label);
        this.add(wall_label);
    }
}
