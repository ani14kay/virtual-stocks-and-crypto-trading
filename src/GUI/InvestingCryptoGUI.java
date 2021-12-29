package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.table.*;


public class InvestingCryptoGUI extends JPanel {
    JTable jt;
    JButton Button;

    InvestingCryptoGUI() {
        this.setBackground(new Color(250, 250, 255));
        this.setBounds(300, 150, 1200, 600);


        // Creating data set for table
        String[] columns = {"Crypto Name", "Value", "Statistics"};
        Object[][] d = {
                {"Sam", "29", " Twinkle House"},
                {"Anna Sam", " 27 ", "Happy Villa"},
                {"Iza Norah", " 4 ", "Happy house"},
                {"Sam", "29", " Twinkle House"}

        };
        // JTable initialization
        jt = new JTable(d, columns){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jt.setBounds(0, 0, 1200, 500);


        JScrollPane scrollPane = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(null);
        scrollPane.setBounds(0, 0, 1200, 500);
        scrollPane.setBackground(new Color(250, 250, 255));

        JLabel name = new JLabel("Name");
        name.setBounds(50,520,200,20);

        JTextArea nametxt = new JTextArea();
        nametxt.setBounds(50,540,200,20);
        nametxt.setEditable(false);
        nametxt.setBorder(BorderFactory.createLineBorder(Color.black));

        JLabel value = new JLabel("Value");
        value.setBounds(320,520,200,20);

        JTextArea valuetxt = new JTextArea();
        valuetxt.setBounds(320,540,200,20);
        valuetxt.setEditable(false);
        valuetxt.setBorder(BorderFactory.createLineBorder(Color.black));

        JLabel changeInValue = new JLabel("Change in value");
        changeInValue.setBounds(590,520,200,20);

        JTextArea changeInValuetxt = new JTextArea();
        changeInValuetxt.setBounds(590,540,200,20);
        changeInValuetxt.setEditable(false);
        changeInValuetxt.setBorder(BorderFactory.createLineBorder(Color.black));

        JButton buy = new JButton("Buy");
        buy.setBounds(860,530,130,30);
        buy.setBackground(new Color(18, 30, 255));
        buy.setForeground(new Color(255,255,255));
        buy.setFocusable(false);

        this.add(buy);
        this.add(changeInValue);
        this.add(changeInValuetxt);
        this.add(valuetxt);
        this.add(value);
        this.add(name);
        this.add(nametxt);
        this.add(scrollPane);
        this.setVisible(true);
        this.setLayout(null);
    }
}

