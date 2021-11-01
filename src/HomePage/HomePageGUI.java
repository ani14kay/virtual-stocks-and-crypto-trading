package HomePage;

import javax.swing.*;
import java.awt.*;

public class HomePageGUI extends JFrame {
    static  ImageIcon logo = new ImageIcon("Assets/Icons/logo.png");//creating an ImageIcon
    public ProfileGUI profileGUI = new ProfileGUI();
    public HelpAndSupportGUI helpAndSupportGUI = new HelpAndSupportGUI();
    public PortfolioGUI portfolioGUI = new PortfolioGUI();
    public InvestingGUI investingGUI = new InvestingGUI();
    public WalletGUI walletGUI = new WalletGUI();
    IntradayGUI intradayGUI = new IntradayGUI();
    public NewsAndArticlesGUI newsAndArticlesGUI = new NewsAndArticlesGUI();
    public PortfolioCryptoGUI portfolioCryptoGUI = new PortfolioCryptoGUI();
    public InvestingCryptoGUI investingCryptoGUI = new InvestingCryptoGUI();
    NewsAndArticlesCryptoGUI newsAndArticlesCryptoGUI = new NewsAndArticlesCryptoGUI();


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

        WelcomeGUI welcomeGUI = new WelcomeGUI();//welcome page gui is called
        this.add(welcomeGUI);//welcome page gui is added

        this.add(profileGUI);
        SideMenu.profile.addActionListener(e -> {
            profileGUI.setBackground(new Color(255, 00, 00));
            SideMenu.profile.setForeground(new Color(18, 30, 255));
            SideMenu.helpAndSupport.setForeground(new Color(164, 164, 166));
            SideMenu.portfolio.setForeground(new Color(164, 164, 166));
            SideMenu.investing.setForeground(new Color(164, 164, 166));
            SideMenu.wallet.setForeground(new Color(164, 164, 166));
            SideMenu.intraday.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticles.setForeground(new Color(164, 164, 166));
            SideMenu.portfolioCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.investingCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
            welcomeGUI.setVisible(false);
            profileGUI.setVisible(true);
            helpAndSupportGUI.setVisible(false);
            portfolioGUI.setVisible(false);
            investingGUI.setVisible(false);
            walletGUI.setVisible(false);
            intradayGUI.setVisible(false);
            newsAndArticlesGUI.setVisible(false);
            portfolioCryptoGUI.setVisible(false);
            investingCryptoGUI.setVisible(false);
            newsAndArticlesCryptoGUI.setVisible(false);

        });

        this.add(helpAndSupportGUI);
        SideMenu.helpAndSupport.addActionListener(e -> {
            helpAndSupportGUI.setBackground(new Color(255, 00, 00));
            SideMenu.profile.setForeground(new Color(164, 164, 166));
            SideMenu.helpAndSupport.setForeground(new Color(18, 30, 255));
            SideMenu.portfolio.setForeground(new Color(164, 164, 166));
            SideMenu.investing.setForeground(new Color(164, 164, 166));
            SideMenu.wallet.setForeground(new Color(164, 164, 166));
            SideMenu.intraday.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticles.setForeground(new Color(164, 164, 166));
            SideMenu.portfolioCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.investingCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
            welcomeGUI.setVisible(false);
            profileGUI.setVisible(false);
            helpAndSupportGUI.setVisible(true);
            portfolioGUI.setVisible(false);
            investingGUI.setVisible(false);
            walletGUI.setVisible(false);
            intradayGUI.setVisible(false);
            newsAndArticlesGUI.setVisible(false);
            portfolioCryptoGUI.setVisible(false);
            investingCryptoGUI.setVisible(false);
            newsAndArticlesCryptoGUI.setVisible(false);

        });

        this.add(portfolioGUI);
        SideMenu.portfolio.addActionListener(e -> {
            portfolioGUI.setBackground(new Color(255,166,00));
            SideMenu.profile.setForeground(new Color(164, 164, 166));
            SideMenu.helpAndSupport.setForeground(new Color(164, 164, 166));
            SideMenu.portfolio.setForeground(new Color(18, 30, 255));
            SideMenu.investing.setForeground(new Color(164, 164, 166));
            SideMenu.wallet.setForeground(new Color(164, 164, 166));
            SideMenu.intraday.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticles.setForeground(new Color(164, 164, 166));
            SideMenu.portfolioCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.investingCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
            welcomeGUI.setVisible(false);
            profileGUI.setVisible(false);
            helpAndSupportGUI.setVisible(false);
            portfolioGUI.setVisible(true);
            investingGUI.setVisible(false);
            walletGUI.setVisible(false);
            intradayGUI.setVisible(false);
            newsAndArticlesGUI.setVisible(false);
            portfolioCryptoGUI.setVisible(false);
            investingCryptoGUI.setVisible(false);
            newsAndArticlesCryptoGUI.setVisible(false);

        });

        this.add(investingGUI);
        SideMenu.investing.addActionListener(e -> {
            investingGUI.setBackground(new Color(255,00,165));
            SideMenu.profile.setForeground(new Color(164, 164, 166));
            SideMenu.helpAndSupport.setForeground(new Color(164, 164, 166));
            SideMenu.portfolio.setForeground(new Color(164, 164, 166));
            SideMenu.investing.setForeground(new Color(18, 30, 255));
            SideMenu.wallet.setForeground(new Color(164, 164, 166));
            SideMenu.intraday.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticles.setForeground(new Color(164, 164, 166));
            SideMenu.portfolioCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.investingCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
            welcomeGUI.setVisible(false);
            profileGUI.setVisible(false);
            helpAndSupportGUI.setVisible(false);
            portfolioGUI.setVisible(false);
            investingGUI.setVisible(true);
            walletGUI.setVisible(false);
            intradayGUI.setVisible(false);
            newsAndArticlesGUI.setVisible(false);
            portfolioCryptoGUI.setVisible(false);
            investingCryptoGUI.setVisible(false);
            newsAndArticlesCryptoGUI.setVisible(false);

        });

        this.add(walletGUI);
        SideMenu.wallet.addActionListener(e -> {
            
            SideMenu.profile.setForeground(new Color(164, 164, 166));
            SideMenu.helpAndSupport.setForeground(new Color(164, 164, 166));
            SideMenu.portfolio.setForeground(new Color(164, 164, 166));
            SideMenu.investing.setForeground(new Color(164, 164, 166));
            SideMenu.wallet.setForeground(new Color(18, 30, 255));
            SideMenu.intraday.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticles.setForeground(new Color(164, 164, 166));
            SideMenu.portfolioCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.investingCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
            welcomeGUI.setVisible(false);
            profileGUI.setVisible(false);
            helpAndSupportGUI.setVisible(false);
            portfolioGUI.setVisible(false);
            investingGUI.setVisible(false);
            walletGUI.setVisible(true);
            intradayGUI.setVisible(false);
            newsAndArticlesGUI.setVisible(false);
            portfolioCryptoGUI.setVisible(false);
            investingCryptoGUI.setVisible(false);
            newsAndArticlesCryptoGUI.setVisible(false);

        });

        this.add(intradayGUI);
        SideMenu.intraday.addActionListener(e -> {

            SideMenu.profile.setForeground(new Color(164, 164, 166));
            SideMenu.helpAndSupport.setForeground(new Color(164, 164, 166));
            SideMenu.portfolio.setForeground(new Color(164, 164, 166));
            SideMenu.investing.setForeground(new Color(164, 164, 166));
            SideMenu.wallet.setForeground(new Color(164, 164, 166));
            SideMenu.intraday.setForeground(new Color(18, 30, 255));
            SideMenu.newsAndArticles.setForeground(new Color(164, 164, 166));
            SideMenu.portfolioCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.investingCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
            welcomeGUI.setVisible(false);
            profileGUI.setVisible(false);
            helpAndSupportGUI.setVisible(false);
            portfolioGUI.setVisible(false);
            investingGUI.setVisible(false);
            walletGUI.setVisible(false);
            intradayGUI.setVisible(true);
            newsAndArticlesGUI.setVisible(false);
            portfolioCryptoGUI.setVisible(false);
            investingCryptoGUI.setVisible(false);
            newsAndArticlesCryptoGUI.setVisible(false);

        });

        
        this.add(newsAndArticlesGUI);
        SideMenu.newsAndArticles.addActionListener(e -> {
            newsAndArticlesGUI.setBackground(new Color(255,255,255));
            SideMenu.profile.setForeground(new Color(164, 164, 166));
            SideMenu.helpAndSupport.setForeground(new Color(164, 164, 166));
            SideMenu.portfolio.setForeground(new Color(164, 164, 166));
            SideMenu.investing.setForeground(new Color(164, 164, 166));
            SideMenu.wallet.setForeground(new Color(164, 164, 166));
            SideMenu.intraday.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticles.setForeground(new Color(18, 30, 255));
            SideMenu.portfolioCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.investingCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
            welcomeGUI.setVisible(false);
            profileGUI.setVisible(false);
            helpAndSupportGUI.setVisible(false);
            portfolioGUI.setVisible(false);
            investingGUI.setVisible(false);
            walletGUI.setVisible(false);
            intradayGUI.setVisible(false);
            newsAndArticlesGUI.setVisible(true);
            portfolioCryptoGUI.setVisible(false);
            investingCryptoGUI.setVisible(false);
            newsAndArticlesCryptoGUI.setVisible(false);

        });

        this.add(portfolioCryptoGUI);
        SideMenu.portfolioCrypto.addActionListener(e -> {
            SideMenu.profile.setForeground(new Color(164, 164, 166));
            SideMenu.helpAndSupport.setForeground(new Color(164, 164, 166));
            SideMenu.portfolio.setForeground(new Color(164, 164, 166));
            SideMenu.investing.setForeground(new Color(164, 164, 166));
            SideMenu.wallet.setForeground(new Color(164, 164, 166));
            SideMenu.intraday.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticles.setForeground(new Color(164, 164, 166));
            SideMenu.portfolioCrypto.setForeground(new Color(18, 30, 255));
            SideMenu.investingCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
            welcomeGUI.setVisible(false);
            profileGUI.setVisible(false);
            helpAndSupportGUI.setVisible(false);
            portfolioGUI.setVisible(false);
            investingGUI.setVisible(false);
            walletGUI.setVisible(false);
            intradayGUI.setVisible(false);
            newsAndArticlesGUI.setVisible(false);
            portfolioCryptoGUI.setVisible(true);
            investingCryptoGUI.setVisible(false);
            newsAndArticlesCryptoGUI.setVisible(false);

        });

        this.add(investingCryptoGUI);
        SideMenu.investingCrypto.addActionListener(e -> {
            investingCryptoGUI.setBackground(new Color(255, 247, 0));
            SideMenu.profile.setForeground(new Color(164, 164, 166));
            SideMenu.helpAndSupport.setForeground(new Color(164, 164, 166));
            SideMenu.portfolio.setForeground(new Color(164, 164, 166));
            SideMenu.investing.setForeground(new Color(164, 164, 166));
            SideMenu.wallet.setForeground(new Color(164, 164, 166));
            SideMenu.intraday.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticles.setForeground(new Color(164, 164, 166));
            SideMenu.portfolioCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.investingCrypto.setForeground(new Color(18, 30, 255));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(164, 164, 166));
            welcomeGUI.setVisible(false);
            profileGUI.setVisible(false);
            helpAndSupportGUI.setVisible(false);
            portfolioGUI.setVisible(false);
            investingGUI.setVisible(false);
            walletGUI.setVisible(false);
            intradayGUI.setVisible(false);
            newsAndArticlesGUI.setVisible(false);
            portfolioCryptoGUI.setVisible(false);
            investingCryptoGUI.setVisible(true);
            newsAndArticlesCryptoGUI.setVisible(false);

        });

        this.add(newsAndArticlesCryptoGUI);
        SideMenu.newsAndArticlesCrypto.addActionListener(e -> {
            newsAndArticlesCryptoGUI.setBackground(new Color(0, 255, 166));
            SideMenu.profile.setForeground(new Color(164, 164, 166));
            SideMenu.helpAndSupport.setForeground(new Color(164, 164, 166));
            SideMenu.portfolio.setForeground(new Color(164, 164, 166));
            SideMenu.investing.setForeground(new Color(164, 164, 166));
            SideMenu.wallet.setForeground(new Color(164, 164, 166));
            SideMenu.intraday.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticles.setForeground(new Color(164, 164, 166));
            SideMenu.portfolioCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.investingCrypto.setForeground(new Color(164, 164, 166));
            SideMenu.newsAndArticlesCrypto.setForeground(new Color(18, 30, 255));
            welcomeGUI.setVisible(false);
            profileGUI.setVisible(false);
            helpAndSupportGUI.setVisible(false);
            portfolioGUI.setVisible(false);
            investingGUI.setVisible(false);
            walletGUI.setVisible(false);
            intradayGUI.setVisible(false);
            newsAndArticlesGUI.setVisible(false);
            portfolioCryptoGUI.setVisible(false);
            investingCryptoGUI.setVisible(false);
            newsAndArticlesCryptoGUI.setVisible(true);
        });

        this.setVisible(true);// HomePageGUI visibility

    }
}
