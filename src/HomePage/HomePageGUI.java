package HomePage;

import javax.swing.*;
import java.awt.*;

public class HomePageGUI extends JFrame {
    HomePageGUI(){
        this.setTitle("Virtual Stock an CryptoCurrency management System");// adding title
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// close by clicking exit
        this.setSize(1920,1080);// setting this.setVisible(true);// frame visibility
        ImageIcon logo = new ImageIcon("Assets/Icons/logo.png");//creating an ImageIcon
        this.setIconImage(logo.getImage());//icon set
        this.getContentPane().setBackground(new Color(245,245,255));//bg colour setting
        this.setVisible(true);
    }
}
