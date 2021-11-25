package GUI;

import javax.swing.*;
import java.awt.*;

public class NewsAndArticlesCryptoGUI extends JPanel {
    NewsAndArticlesCryptoGUI() {
        this.setBackground(new Color(255, 255, 255));
        this.setBounds(300, 150, 1200, 600);
        this.setVisible(true);

        JLabel heading1 = new JLabel("Heading1", SwingConstants.CENTER);

        heading1.setPreferredSize(new Dimension(1200, 100));
        JTextArea article1 = new JTextArea(
                "A cryptocurrency (or “crypto”) is a digital currency that can be used to buy goods and services", 1,
                1);
        article1.setEditable(false);
        article1.setLineWrap(true);
        article1.setMargin(new Insets(10, 10, 10, 10));

        JLabel heading2 = new JLabel("Heading2", SwingConstants.CENTER);
        JTextArea article2 = new JTextArea(
                "A cryptocurrency (or “crypto”) is a digital currency that can be used to buy goods and services", 1,
                1);
        article2.setEditable(false);
        article2.setLineWrap(true);
        article2.setMargin(new Insets(10, 10, 10, 10));

        JLabel heading3 = new JLabel("Heading3", SwingConstants.CENTER);
        JTextArea article3 = new JTextArea(
                "A cryptocurrency (or “crypto”) is a digital currency that can be used to buy goods and services", 1,
                1);
        article3.setEditable(false);
        article3.setLineWrap(true);
        article3.setMargin(new Insets(10, 10, 10, 10));

        JPanel p = new JPanel(new GridLayout(10, 1));
        p.add(heading1);
        p.add(article1);
        p.add(heading2);
        p.add(article2);
        p.add(heading3);
        p.add(article3);

        this.add(p);
    }
}
