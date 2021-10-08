package HomePage;

import javax.swing.*;
import java.awt.*;

public class SideMenu extends JPanel {
    SideMenu(){
        this.setBackground(new Color(217,218,222));
        this.setBounds(0,0,275,1080);

        JLabel menuText = new JLabel("Menu");
        menuText.setForeground(new Color(35,35,41));
        menuText.setFont(new Font("Times new roman",Font.BOLD,20));
        menuText.setBounds(10,40,100,20);
        this.add(menuText);

        JLabel stocks = new JLabel("Stocks");
        stocks.setForeground(new Color(100,101,105));
        stocks.setFont(new Font("MV Boli",Font.BOLD,15));
        stocks.setBounds(50,175,100,20);
        this.add(stocks);

        JLabel crypto = new JLabel("Crypto");
        crypto.setForeground(new Color(100,101,105));
        crypto.setFont(new Font("MV Boli",Font.BOLD,15));
        crypto.setBounds(50,475,100,20);
        this.add(crypto);

        this.setLayout(null);
    }
}
