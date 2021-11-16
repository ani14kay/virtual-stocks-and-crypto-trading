package HomePage;

import javax.swing.*;
import java.awt.*;

public class ProfileGUI extends JPanel {
    ProfileGUI(){
        JLabel welcome = new JLabel("Welcome User!!");
        JLabel userName = new JLabel("                UserName");
        JLabel about = new JLabel("About");
        JLabel description = new JLabel("<html>Description : Here user will define himself in a brief description</html>");
        JLabel divider = new JLabel("");
        JLabel contact = new JLabel("Contact Info");
        JLabel phoneNo = new JLabel("Phone no. : +918976543210");
        JLabel email = new JLabel("E-mail : ");
        JLabel subDivider = new JLabel("");
        JLabel activity = new JLabel("Last 5 Activities : ");

        welcome.setBounds(0,0,500,40);
        welcome.setFont(new Font("Copperplate Gothic Bold",Font.ROMAN_BASELINE,30));
        welcome.setForeground(new Color(0,0,0));

        userName.setFont(new Font("Calibri",Font.BOLD,20));
        userName.setBounds(0,70,400,160);
        userName.setForeground(new Color(134, 134, 135));
            ImageIcon userImage = new ImageIcon("Assets/Icons/UserImage.png");
            Image i = userImage.getImage();
            Image resideImage = i.getScaledInstance(150,150,Image.SCALE_SMOOTH);
            userImage = new ImageIcon(resideImage);
        userName.setIcon(userImage);
        userName.setHorizontalTextPosition(JLabel.RIGHT);
        userName.setVerticalTextPosition(JLabel.TOP);

        about.setBounds(232,70,200,70);
        about.setFont(new Font("Calibri",Font.BOLD,15));
        about.setForeground(new Color(189, 189, 189));

        description.setBounds(232,150,800,120);
        description.setFont(new Font("Calibri",Font.BOLD,15));
        description.setVerticalAlignment(JLabel.TOP);
        description.setForeground(new Color(134, 134, 135));

        divider.setBounds(0,275,1200,3);
        divider.setBackground(new Color(77, 77, 77));
        divider.setOpaque(true);

        contact.setBounds(20,280,200,40);
        contact.setFont(new Font("Calibri",Font.BOLD,15));

        phoneNo.setBounds(100,310,200,40);
        phoneNo.setFont(new Font("Calibri",Font.BOLD,15));
        phoneNo.setForeground(new Color(189, 189, 189));

        email.setBounds(100,330,200,40);
        email.setFont(new Font("Calibri",Font.BOLD,15));
        email.setForeground(new Color(189, 189, 189));

        subDivider.setBounds(30,380,1140,1);
        subDivider.setBackground(new Color(134, 134, 135));
        subDivider.setOpaque(true);

        activity.setBounds(20,400,200,20);
        activity.setFont(new Font("Calibri",Font.BOLD,15));
        activity.setVerticalAlignment(JLabel.TOP);

        this.add(activity);
        this.add(subDivider);
        this.add(email);
        this.add(phoneNo);
        this.add(contact);
        this.add(divider);
        this.add(description);
        this.add(about);
        this.add(userName);
        this.add(welcome);
        this.setBounds(300,150,1200,600);
        this.setBackground(new Color(250, 250, 255));
        this.setVisible(true);
        this.setLayout(null);
    }
}
