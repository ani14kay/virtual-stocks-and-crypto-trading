package HomePage;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class IntradayGUI extends JPanel {
    IntradayGUI(){
        int numberOfStocks = 0;
        JPanel rightHalf;
        JPanel leftHalf = new JPanel();
        if(numberOfStocks==0){
            rightHalf = new JPanel();
            JLabel nothing = new JLabel("You haven't purchased or sold any Stock today!!");
            JLabel suggestion = new JLabel("Please go to Investing section");
            ImageIcon emptyError = new ImageIcon("Assets/Images/wheelbarrow.png");
            Image i = emptyError.getImage();
            Image resideImage = i.getScaledInstance(70,70,Image.SCALE_SMOOTH);
            emptyError = new ImageIcon(resideImage);

            suggestion.setForeground(new Color(189, 189, 189));
            suggestion.setFont(new Font("Consolas",Font.BOLD,15));
            suggestion.setBounds(0,180,550,200);
            suggestion.setHorizontalAlignment(JLabel.CENTER);
            suggestion.setIcon(emptyError);
            suggestion.setHorizontalTextPosition(JLabel.CENTER);
            suggestion.setVerticalTextPosition(JLabel.TOP);

            nothing.setForeground(new Color(164, 164, 166));
            nothing.setFont(new Font("Consolas",Font.BOLD,15));
            nothing.setBounds(0,170,550,25);
            nothing.setHorizontalAlignment(JLabel.CENTER);

            rightHalf.add(suggestion);
            rightHalf.add(nothing);
            rightHalf.setBorder(BorderFactory.createLineBorder(Color.black));
        }else{
            rightHalf = new JPanel();
            String[] header = {"Stock","Price","Today's Shift","Sell"};
            String [][] cellData = {{"Tata","521.2","+3.2%","buy"},
                                    {"Tata","521.2","+3.2%","buy"},
                                    {"Tata","521.2","+3.2%","buy"}};
            JTable dataTable = new JTable(cellData,header){
                @Override
                public boolean isCellEditable(int header,int dataTable){
                    return false;
                }
                public Component prepareRenderer(TableCellRenderer renderer,int data,int columns){
                    Component component = super.prepareRenderer(renderer, data, columns);

                    if(data%2==0) component.setBackground(Color.white);
                    else component.setBackground(new Color(200, 200, 200));
                    return component;
                }
            };

            dataTable.setPreferredScrollableViewportSize(new Dimension(550,600));
            dataTable.setFillsViewportHeight(true);
            dataTable.setCellSelectionEnabled(false);
            dataTable.setFocusable(false);
            dataTable.setRowHeight(30);
            dataTable.setBackground(new Color(250, 250, 255));

            JScrollPane interaDayPane = new JScrollPane(dataTable);
            interaDayPane.setBounds(0,0,550,600);
            interaDayPane.setBackground(new Color(250, 250, 255));

            rightHalf.add(interaDayPane);
        }
        rightHalf.setBackground(new Color(250, 250, 255));
        rightHalf.setBounds(650,0,550,600);
        rightHalf.setLayout(null);
        rightHalf.setVisible(true);

        leftHalf.setBackground(new Color(250, 250, 255));
        leftHalf.setBounds(0,0,550,600);
        leftHalf.setLayout(null);
        leftHalf.setVisible(true);

        String[] header = {"Stock","Price","Today's Shift","Sell"};
        String [][] cellData = {{"Tata","521.2","+3.2%","buy"},
                {"Tata","521.2","+3.2%","buy"},
                {"Tata","521.2","+3.2%","buy"}};
        JTable dataTable = new JTable(cellData,header){
            @Override
            public boolean isCellEditable(int header,int dataTable){
                return false;
            }
            public Component prepareRenderer(TableCellRenderer renderer,int data,int columns){
                Component component = super.prepareRenderer(renderer, data, columns);

                if(data%2==0) component.setBackground(Color.white);
                else component.setBackground(new Color(200, 200, 200));
                return component;
            }
        };

        dataTable.setPreferredScrollableViewportSize(new Dimension(550,600));
        dataTable.setFillsViewportHeight(true);
        dataTable.setCellSelectionEnabled(false);
        dataTable.setFocusable(false);
        dataTable.setRowHeight(30);
        dataTable.setBackground(new Color(250, 250, 255));

        JScrollPane interaDayPane = new JScrollPane(dataTable);
        interaDayPane.setBounds(0,0,550,600);
        interaDayPane.setBackground(new Color(250, 250, 255));

        leftHalf.add(interaDayPane);

        this.add(leftHalf);
        this.add(rightHalf);
        this.setBounds(300,150,1200,600);
        this.setBackground(new Color(250, 250, 255));
        this.setVisible(true);
        this.setLayout(null);
    }
}
