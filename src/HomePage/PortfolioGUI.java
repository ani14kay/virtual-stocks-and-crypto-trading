package HomePage;

import javax.swing.*;
import java.awt.*;


  public class PortfolioGUI extends JPanel {
        JButton wishlist,market,Home,deposit,withdraw,back,next,s1,s2,s3,s4;
        JButton i1,i2,i3,i4;
        JLabel heading;
        JPanel top,bottom,center,grid;
//
        PortfolioGUI() {
            //top heading
            heading = new JLabel("WELCOME TO STOCKS PORTFOLIO!", SwingConstants.CENTER);
            heading.setBounds(230,0,1200,30);
            heading.setForeground(Color.black);
            heading.setFont(new Font("Verdana", Font.BOLD, 25));


            //BUTTON 1
            wishlist = new JButton();
            wishlist.setBounds( 300, 640, 300, 120);
            // wishlist.addActionListener((ActionListener) this);
            wishlist.setText("Wishlist");
            wishlist.setFocusable(false);
            wishlist.setFont(new Font("Comic Sans", Font.BOLD, 25));

            wishlist.setForeground(Color.black);
            wishlist.setBackground(Color.cyan);
            wishlist.setBorder(BorderFactory.createEtchedBorder());
            ImageIcon wish = new ImageIcon("Assets/Icons/wishlist.png");//image icon
            wishlist.setIcon(wish);
            wishlist.setHorizontalTextPosition(JButton.RIGHT);

            //button 2
            market = new JButton();
            market.setBounds(450, 640, 300, 120);
            // market.addActionListener((ActionListener) this);
            market.setText("Market");
            market.setFocusable(false);
            market.setFont(new Font("Comic Sans", Font.BOLD, 25));
            market.setForeground(Color.black);
            market.setBackground(Color.cyan);
            market.setBorder(BorderFactory.createEtchedBorder());
            ImageIcon mkt = new ImageIcon("Assets/Icons/Market1.png");
            market.setIcon(mkt);
            market.setHorizontalTextPosition(JButton.RIGHT);



            //button 3

            Home = new JButton();
            Home.setBounds(630, 640, 300, 120);
            //    Home.addActionListener((ActionListener) this);
            Home.setText("Home");
            Home.setFocusable(false);
            Home.setFont(new Font("Comic Sans", Font.BOLD, 25));
            Home.setForeground(Color.black);
            Home.setBackground(Color.cyan);
            Home.setBorder(BorderFactory.createEtchedBorder());
            ImageIcon ho = new ImageIcon("Assets/Icons/Home.png");
            Home.setIcon(ho);
            Home.setHorizontalTextPosition(JButton.RIGHT);


             //button 4
             deposit = new JButton();
             deposit.setBounds(280, 100, 180, 70);
             //deposit.addActionListener((ActionListener) this);
             deposit.setText("Deposit INR");
             deposit.setFocusable(false);
             deposit.setFont(new Font("Comic Sans", Font.BOLD, 25));
             deposit.setForeground(Color.white);
             deposit.setBackground(Color.blue);
             deposit.setBorder(BorderFactory.createEtchedBorder());

             //button 4
             withdraw = new JButton();
             withdraw.setBounds(800, 100, 180, 70);
             // withdraw.addActionListener((ActionListener) this);
             withdraw.setText("Withdraw INR");
             withdraw.setFocusable(false);
             withdraw.setFont(new Font("Comic Sans", Font.BOLD, 25));
             withdraw.setForeground(Color.black);
             withdraw.setBackground(Color.white);
             withdraw.setBorder(BorderFactory.createEtchedBorder());

            //button 5
            back = new JButton();
            back.setBounds(10, 0, 50, 50);
            //  back.addActionListener((ActionListener) this);
//            back.setText("Back");
            back.setFocusable(false);
            back.setBackground(Color.cyan);
            back.setBorder(BorderFactory.createEtchedBorder());
            ImageIcon backi = new ImageIcon("back.png");
            back.setIcon(backi);
            s1.setHorizontalTextPosition(JButton.RIGHT);

            //button 6
            next = new JButton();
            next.setBounds(80, 0, 50, 50);
            //  next.addActionListener((ActionListener) this);
            next.setText("Next");
//            next.setFocusable(false);
            next.setBackground(Color.cyan);
            next.setBorder(BorderFactory.createEtchedBorder());
            ImageIcon nexti = new ImageIcon("Assets/Icons/next.png");
            next.setIcon(nexti);

            //button 7
            s1 = new JButton();
            s1.setBounds(20, 230, 500, 70);
            s1.setText("  Nifty 50           -1.04%");
            s1.setFocusable(false);
            s1.setFont(new Font("Comic Sans", Font.BOLD, 25));
            s1.setForeground(Color.black);
            s1.setBackground(Color.lightGray);
            s1.setBorder(BorderFactory.createEtchedBorder());
            ImageIcon nifty = new ImageIcon("Assets/Icons/nifty50.png");
            s1.setIcon(nifty);
           s1.setHorizontalTextPosition(JButton.RIGHT);



            //button 8
            s2 = new JButton();
            s2.setBounds(20, 310, 500, 70);
            s2.setText("  Tata Motors        +0.70%");
            s2.setFocusable(false);
            s2.setFont(new Font("Comic Sans", Font.BOLD, 25));
            s2.setForeground(Color.black);
            s2.setBackground(Color.lightGray);
            s2.setBorder(BorderFactory.createEtchedBorder());
            ImageIcon tata = new ImageIcon("Assets/Icons/tata.png");
            s2.setIcon(tata);
            s2.setHorizontalTextPosition(JButton.RIGHT);


            //button 9
            s3 = new JButton();
            s3.setBounds(20, 390, 500, 70);
            // withdraw.addActionListener((ActionListener) this);
            s3.setText("          Suzuki                +1.14%");
            s3.setFocusable(false);
            s3.setFont(new Font("Comic Sans", Font.BOLD, 25));
            s3.setForeground(Color.black);
            s3.setBackground(Color.lightGray);
            s3.setBorder(BorderFactory.createEtchedBorder());
            ImageIcon suzuki = new ImageIcon("Assets/Icons/Suzuki1.png");
            s3.setIcon(suzuki);
            s3.setHorizontalTextPosition(JButton.RIGHT);

            //button 10
            s4 = new JButton();
            s4.setBounds(20, 470, 500, 70);
            // withdraw.addActionListener((ActionListener) this);
            s4.setText("      ITC                      +1.24%");
            s4.setFocusable(false);
            s4.setFont(new Font("Comic Sans", Font.BOLD, 25));

            s4.setForeground(Color.black);
            s4.setBackground(Color.lightGray);
            s4.setBorder(BorderFactory.createEtchedBorder());
            ImageIcon mrf = new ImageIcon("Assets/Icons/itc.jpg");
            s4.setIcon(mrf);
            s4.setHorizontalTextPosition(JButton.RIGHT);


            //button 11
            i1= new JButton();
            i1.setBounds(770, 225, 150, 70);
            i1.setText("INVEST");
            i1.setFocusable(false);
            i1.setFont(new Font("Comic Sans", Font.BOLD, 25));
            i1.setForeground(Color.white);
            i1.setBackground(Color.blue);
            i1.setBorder(BorderFactory.createEtchedBorder());

            //button 12
            i2= new JButton();
            i2.setBounds(770, 305, 150, 70);
            i2.setText("INVEST");
            i2.setFocusable(false);
            i2.setFont(new Font("Comic Sans", Font.BOLD, 25));
            i2.setForeground(Color.white);
            i2.setBackground(Color.blue);
            i2.setBorder(BorderFactory.createEtchedBorder());

            //button 13
            i3= new JButton();
            i3.setBounds(770, 385, 150, 70);
            i3.setText("INVEST");
            i3.setFocusable(false);
            i3.setFont(new Font("Comic Sans", Font.BOLD, 25));
            i3.setForeground(Color.white);
            i3.setBackground(Color.blue);
            i3.setBorder(BorderFactory.createEtchedBorder());

            //button 14
            i4= new JButton();
            i4.setBounds(770, 465, 150, 70);
            i4.setText("INVEST");
            i4.setFocusable(false);
            i4.setFont(new Font("Comic Sans", Font.BOLD, 25));
            i4.setForeground(Color.white);
            i4.setBackground(Color.blue);
            i4.setBorder(BorderFactory.createEtchedBorder());



             //panels
            top = new JPanel();bottom = new JPanel(); center= new JPanel();

            top.setBackground(Color.white);
            bottom.setBackground(Color.gray);
            center.setBackground(Color.black);

            top.setBounds(0,0,1200,70);
            bottom.setPreferredSize(new Dimension(50, 50));
            center.setBounds(0,70,1200,480);

            top.setLayout(new BorderLayout());
            center.setLayout(new BorderLayout());

            this.setLayout(new BorderLayout());


            this.add(wishlist);
            this.add(market);
            this.add(Home);
            this.add(back);
            this.add(next);
             this.add(deposit);
             this.add(withdraw);
            this.add(s1);
            this.add(s2);
            this.add(s3);
            this.add(s4);this.add(i1);this.add(i2);this.add(i3);this.add(i4);
            top.add(heading);
            bottom.add(wishlist);
            bottom.add(market);
             bottom.add(Home);



           this.add(top);
           this.add(bottom);
           this.add(center);

            bottom.setLayout(null);
            this.setBackground(new Color(250,250,255));
            this.setBounds(300,70,1200,700);
            this.setVisible(true);
        }
  }
