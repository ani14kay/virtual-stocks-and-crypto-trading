package HomePage;

import javax.swing.*;
import java.awt.*;

public class HelpAndSupportGUI extends JPanel {
    JButton Home, back, next, s1, s2, s3, s4;
    JButton i1, i2, i3, i4;
    JLabel heading, help,  cust_service;
    JPanel top, bottom, center, grid;
    JTable table;

    HelpAndSupportGUI() {

        // top heading

        heading = new JLabel("HELP AND SUPPORT", SwingConstants.CENTER);
        heading.setBounds(170, 0, 200, 200);
        heading.setForeground(Color.black);
        heading.setFont(new Font("Verdana", Font.BOLD, 25));
        heading.setBackground(Color.white);
        heading.setOpaque(true);

        help = new JLabel("NEED SOME HELP?", SwingConstants.CENTER);
        help.setBounds(250, 80, 500, 200);
        help.setForeground(Color.WHITE);
        help.setFont(new Font("Verdana", Font.BOLD, 25));
        help.setBackground(Color.BLACK);
        help.setOpaque(true);

        cust_service = new JLabel("Customer Service: +91 1234567890", SwingConstants.CENTER);
        cust_service.setBounds(400, 200, 500, 200);
        cust_service.setForeground(Color.WHITE);
        cust_service.setFont(new Font("Verdana", Font.BOLD, 25));
        cust_service.setBackground(Color.BLACK);
        cust_service.setOpaque(true);
        this.add(cust_service);

        back = new JButton();
        back.setBounds(10, 0, 50, 50);
        back.setFocusable(false);
        back.setBackground(Color.cyan);
        back.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon backi = new ImageIcon("back.png");
        back.setIcon(backi);

        next = new JButton();
        next.setBounds(80, 0, 50, 50);

        next.setFocusable(false);
        next.setBackground(Color.cyan);
        next.setBorder(BorderFactory.createEtchedBorder());
        ImageIcon nexti = new ImageIcon("Assets/Icons/next.png");
        next.setIcon(nexti);

        top = new JPanel();
        bottom = new JPanel();
        center = new JPanel();

        top.setBackground(Color.white);
        bottom.setBackground(Color.gray);
        center.setBackground(Color.black);

        top.setBounds(0, 0, 1200, 70);
        bottom.setPreferredSize(new Dimension(50, 50));
        center.setBounds(0, 70, 1200, 480);

        top.setLayout(new BorderLayout());
        center.setLayout(new BorderLayout());

        this.setLayout(new BorderLayout());

        this.add(help);

        this.add(back);
        this.add(next);

        top.add(heading);

        this.add(top);
        this.add(bottom, BorderLayout.SOUTH);
        this.add(center);

        bottom.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));
        this.setBackground(new Color(250, 250, 255));
        this.setBounds(300, 70, 1200, 700);
        this.setVisible(true);
    }
}
