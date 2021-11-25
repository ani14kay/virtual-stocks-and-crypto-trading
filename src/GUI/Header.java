package GUI;

import javax.swing.*;
import java.awt.*;

public class Header extends JLabel{
    Header(){
        this.setText("Stock and cryptocurrency management system.");
        this.setForeground(new Color(18, 30, 255));//name label color
        this.setFont(new Font("Verdana",Font.BOLD,30));//name label font and style
        this.setVerticalAlignment(JLabel.TOP);
        this.setBounds(305,30,1200,100);//layout bonds for name is set

    }
}
