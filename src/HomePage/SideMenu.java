package HomePage;

import javax.swing.*;
import java.awt.*;


public class SideMenu extends JPanel {
    static JButton profile,helpAndSupport,portfolio,investing,wallet,intraday,newsAndArticles,portfolioCrypto,investingCrypto,newsAndArticlesCrypto;
    SideMenu(){
        this.setBackground(new Color(217,218,222));//side menu BG
        this.setBounds(0,0,275,1080);// side menu bounds set

        JLabel menuText = new JLabel("Menu");//Menu text
        menuText.setForeground(new Color(35,35,41));
        menuText.setFont(new Font("Times new Roman",Font.BOLD,20));
        menuText.setBounds(10,40,100,20);
        this.add(menuText);

        profile = new JButton();
        profile.setBackground(new Color(217,218,222));
        profile.setBounds(50,75,150,30);
        profile.setBorder(null);
        profile.setFont(new Font("MV Boli",Font.BOLD,15));
        profile.setFocusPainted(false);
        profile.setForeground(new Color(164, 164, 166));
        profile.setText("Profile");

        this.add(profile);

        helpAndSupport = new JButton();
        helpAndSupport.setBackground(new Color(217,218,222));
        helpAndSupport.setBounds(50,115,150,30);
        helpAndSupport.setBorder(null);
        helpAndSupport.setFont(new Font("MV Boli",Font.BOLD,15));
        helpAndSupport.setFocusPainted(false);
        helpAndSupport.setForeground(new Color(164, 164, 166));
        helpAndSupport.setText("Help and Support");
        this.add(helpAndSupport);

        JLabel stocks = new JLabel("Stocks");//Stocks text
        stocks.setForeground(new Color(100,101,105));
        stocks.setFont(new Font("Comic sans",Font.BOLD,15));
        stocks.setBounds(50,175,100,20);
        this.add(stocks);

        portfolio = new JButton();
        portfolio.setBackground(new Color(217,218,222));
        portfolio.setBounds(50,215,150,30);
        portfolio.setBorder(null);
        portfolio.setFont(new Font("MV Boli",Font.BOLD,15));
        portfolio.setFocusPainted(false);
        portfolio.setForeground(new Color(164, 164, 166));
        portfolio.setText("Portfolio");
        this.add(portfolio);

        investing = new JButton();
        investing.setBackground(new Color(217,218,222));
        investing.setBounds(50,255,150,30);
        investing.setBorder(null);
        investing.setFont(new Font("MV Boli",Font.BOLD,15));
        investing.setFocusPainted(false);
        investing.setForeground(new Color(164, 164, 166));
        investing.setText("Investing");
        this.add(investing);

        wallet = new JButton();
        wallet.setBackground(new Color(217,218,222));
        wallet.setBounds(50,295,150,30);
        wallet.setBorder(null);
        wallet.setFont(new Font("MV Boli",Font.BOLD,15));
        wallet.setFocusPainted(false);
        wallet.setForeground(new Color(164, 164, 166));
        wallet.setText("Wallet");
        this.add(wallet);

        intraday = new JButton();
        intraday.setBackground(new Color(217,218,222));
        intraday.setBounds(50,335,150,30);
        intraday.setBorder(null);
        intraday.setFont(new Font("MV Boli",Font.BOLD,15));
        intraday.setFocusPainted(false);
        intraday.setForeground(new Color(164, 164, 166));
        intraday.setText("Intraday");
        this.add(intraday);

        newsAndArticles = new JButton();
        newsAndArticles.setBackground(new Color(217,218,222));
        newsAndArticles.setBounds(50,375,150,30);
        newsAndArticles.setBorder(null);
        newsAndArticles.setFont(new Font("MV Boli",Font.BOLD,15));
        newsAndArticles.setFocusPainted(false);
        newsAndArticles.setForeground(new Color(164, 164, 166));
        newsAndArticles.setText("News And Articles");
        this.add(newsAndArticles);

        JLabel crypto = new JLabel("Crypto");//Crypto text
        crypto.setForeground(new Color(100,101,105));
        crypto.setFont(new Font("Comic sans",Font.BOLD,15));
        crypto.setBounds(50,435,100,20);
        this.add(crypto);

        portfolioCrypto = new JButton();
        portfolioCrypto.setBackground(new Color(217,218,222));
        portfolioCrypto.setBounds(50,475,150,30);
        portfolioCrypto.setBorder(null);
        portfolioCrypto.setFont(new Font("MV Boli",Font.BOLD,15));
        portfolioCrypto.setFocusPainted(false);
        portfolioCrypto.setForeground(new Color(164, 164, 166));
        portfolioCrypto.setText("Portfolio");
        this.add(portfolioCrypto);

        investingCrypto = new JButton();
        investingCrypto.setBackground(new Color(217,218,222));
        investingCrypto.setBounds(50,515,150,30);
        investingCrypto.setBorder(null);
        investingCrypto.setFont(new Font("MV Boli",Font.BOLD,15));
        investingCrypto.setFocusPainted(false);
        investingCrypto.setForeground(new Color(164, 164, 166));
        investingCrypto.setText("Investing");
        this.add(investingCrypto);

        newsAndArticlesCrypto = new JButton();
        newsAndArticlesCrypto.setBackground(new Color(217,218,222));
        newsAndArticlesCrypto.setBounds(50,555,150,30);
        newsAndArticlesCrypto.setBorder(null);
        newsAndArticlesCrypto.setFont(new Font("MV Boli",Font.BOLD,15));
        newsAndArticlesCrypto.setFocusPainted(false);
        newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
        newsAndArticlesCrypto.setText("News And Articles");
        this.add(newsAndArticlesCrypto);

        JButton logIn = new JButton();
        logIn.setBackground(new Color(18, 30, 255));
        logIn.setBounds(50,725,70,30);
        logIn.setBorder(null);
        logIn.setFont(new Font("Comic Sans",Font.BOLD,12));
        logIn.setFocusPainted(false);
        logIn.setForeground(new Color(255, 255, 255));
        logIn.setText("LogIn");
        this.add(logIn);

        JButton signUp = new JButton();
        signUp.setBackground(new Color(18, 30, 255));
        signUp.setBounds(140,725,70,30);
        signUp.setBorder(null);
        signUp.setFont(new Font("Comic Sans",Font.BOLD,12));
        signUp.setFocusPainted(false);
        signUp.setForeground(new Color(255, 255, 255));
        signUp.setText("SignUp");
        this.add(signUp);

        this.setLayout(null);// side menu layout is null
    }
}
