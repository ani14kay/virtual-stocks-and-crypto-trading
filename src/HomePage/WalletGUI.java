package HomePage;

import javax.swing.*;
import java.awt.*;

public class WalletGUI extends JPanel {
    JLabel jl; // Made global so all methods can use this
    // GUI representation of System.out.println();

    JButton jb;
    JButton jd;

    WalletGUI() {
        // this.setBounds(300, 150, 1200, 600);
        // this.setVisible(true);
        // this.setForeground(new Color(18, 30, 255));
        // setSize(300, 300);

        // jl = new JLabel("Wallet");

        // this.add(jl); // adding label to first panel

        // jb = new JButton("WithDraw Funds!");
        // jd = new JButton("Deposit Funds!");

        // this.add(jb);
        // this.add(jd);

        JLabel heading = new JLabel("<html><h1>Wallet</h1></html>");

        heading.setForeground(new Color(51, 51, 51));
        heading.setFont(new Font("Consolas", Font.BOLD, 20));
        // heading.setBounds(80, 30, 120, 40);
        heading.setLocation(530, 30);
        heading.setSize(200, 30);

        JLabel description1 = new JLabel("Current Balance: $9190");
        JLabel description2 = new JLabel("Last Transcation: $620");

        description1.setFont(new Font("Calibri", Font.PLAIN, 15));
        description1.setBounds(10, 70, 1200, 170);

        description2.setFont(new Font("Calibri", Font.PLAIN, 15));
        description2.setBounds(10, 150, 1200, 170);

        JButton b1 = new JButton("WithDraw Funds");
        JButton b2 = new JButton("Deposit Funds");

        b1.setBackground(new Color(18, 30, 255));
        // b1.setBounds(200,560,100,40);
        b1.setLocation(100, 560);
        b1.setSize(200, 30);
        b1.setBorder(null);
        // b1.setSize(300, 300);
        b1.setFont(new Font("Comic Sans", Font.BOLD, 20));
        b1.setFocusPainted(false);
        b1.setForeground(new Color(255, 255, 255));

        b2.setBackground(new Color(18, 30, 255));
        b2.setLocation(700, 560);
        b2.setSize(200, 30);
        b2.setBorder(null);
        b2.setFont(new Font("Comic Sans", Font.BOLD, 20));
        b2.setFocusPainted(false);
        b2.setForeground(new Color(255, 255, 255));
        // b2.setSize(300, 300);

        // this.add(suggestion);
        this.add(heading);
        this.add(description1);
        this.add(description2);
        this.add(b1);
        this.add(b2);
        this.setBackground(new Color(250, 250, 255));
        this.setBounds(300, 150, 1200, 600);
        this.setLayout(null);
        this.setVisible(true);

    }
}
