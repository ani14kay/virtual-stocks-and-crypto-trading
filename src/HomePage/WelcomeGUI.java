package HomePage;

import javax.swing.*;
import java.awt.*;

public class WelcomeGUI extends JPanel {
    WelcomeGUI(){
        this.setBackground(new Color(250,250,255));
        this.setBounds(300,150,1200,600);

        JLabel welcomeText = new JLabel("Welcome to the World of Stock and crypto");
        JLabel tagLine = new JLabel("A platform where you can invest some money on stock market or on crypto currency");
        JLabel description1 = new JLabel("<html><br/><br/>A stock market, equity market, or share market is the aggregation of buyers and sellers of stocks (also called shares) which represent ownership claims on businesses; these may include<br/> " +
                                                                "securities listed on a public stock exchange, as well as stock that is only traded privately,such as shares of private companies which are sold to investors through equity crowdfunding<br/>" +
                                                                "in the stock market is most often done via stockbrokerages and electronic trading platforms. Investment is usually made with an investment strategy in mind.<br/><br/>" +
                                                                "platforms. Investment Stocks can be categorized by the country where the company is domiciled. For example, Nestlé and Novartis are domiciled in Switzerland and traded on the SIX Swiss<br/>" +
                                                                 "Exchange, so they may be considered as part of the Swiss stock market, although the stocks may also be traded on exchanges in other countries, for example, as American depositary<br/> " +
                                                                "receipts (ADRs) on U.S. stock markets.</html>");

        welcomeText.setFont(new Font("Copperplate Gothic Bold",Font.ROMAN_BASELINE,30));
        tagLine.setForeground(new Color(164, 164, 166));
        description1.setFont(new Font("Calibri",Font.PLAIN,15));

        this.add(description1);
        this.add(welcomeText);
        this.add(tagLine);
        this.add(description1);
        this.setVisible(true);
    }
}
