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
        this.getContentPane().setBackground(new Color(250,250,255));//bg colour setting
        this.setLayout(null);//null layout is set

        JLabel name = new JLabel("Stock and Cryptocurrency Management System");//name label is created
        name.setForeground(new Color(100,100,255));//name label color
        name.setFont(new Font("Verdana",Font.BOLD,30));//name label font and style
        name.setVerticalAlignment(JLabel.TOP);//set vertical alignment to top
        name.setBounds(40,30,1200,100);//layout bonds for name is set

        this.add(name);//logo label added to the HomePageGUI
        this.setVisible(true);// HomePageGUI visibility

    }
}
