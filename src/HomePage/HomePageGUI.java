package HomePage;

import javax.swing.*;
import java.awt.*;

public class HomePageGUI extends JFrame {
    static  ImageIcon logo = new ImageIcon("Assets/Icons/logo.png");//creating an ImageIcon
    HomePageGUI(){
        this.setTitle("Virtual Stock an CryptoCurrency management System");// adding title
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// close by clicking exit
        this.setSize(1920,1080);// setting this.setVisible(true);// frame visibility

        this.setIconImage(logo.getImage());//icon set
        this.getContentPane().setBackground(new Color(250,250,255));//bg colour setting
        this.setLayout(null);//null layout is set

        Header header = new Header();//name label is created
        this.add(header);//logo label added to the HomePageGUI

        SideMenu sideMenu = new SideMenu();//side menu panel is called
        this.add(sideMenu);//side menu is added to HomePageGUI

        this.setVisible(true);// HomePageGUI visibility

    }
}
