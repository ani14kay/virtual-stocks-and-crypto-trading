package Data;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class purchase {
    final JFrame frame = new JFrame();
    final JLabel label = new JLabel("PURCHASE HISTORY");
    private JTable table = new JTable();

    public purchase() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        label.setBounds(150, 0, 300, 50);
        label.setFont(new Font("Verdana", Font.BOLD, 25));
        label.setForeground(Color.blue);
        frame.add(label);

        // Column Names
        Object[] columns = {"Purchase Date ", "Stock Purchased", "Quantity Purchased", "Amount Invested"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        Object[][] d = {

                {"12/12/2021", "SUZUKI", "6", "42768.00"},
                {"22/11/2021", "NIFTY 50", "2", "34070.60"}, {"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},
                {"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},{"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},
                {"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},{"  ", " ", "  ", "  ", " ", " "}, {"  ", " ", "  ", "  ", " ", " "},

        };
        table.setBackground(new Color(0x643580));
        table.setForeground(Color.black);
        Font font = new Font("Verdana", 1, 22);
        table.setFont(font);
        table.setRowHeight(30);
        // Initializing the JTable
        table = new JTable(d, columns) {
        };
        //frame.add(table);
        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 70, 880, 420);

        frame.setLayout(null);

        frame.add(pane);
    }

}


