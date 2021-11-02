package HomePage;
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
        this.setVisible(true);
        JButton f = new JButton();
        f.setVisible(true);


        // Creating data set for table
        String[] columns = {"Crypto Name","Value","Statistics","Purchase"};
        Object[][] d = {
                { "Sam", "29" ," Twinkle House","buy"},
                { "Anna Sam", " 27 ", "Happy Villa","buy" },
                { "Iza Norah", " 4 ", "Happy house" ,"buy"},
                { "Sam", "29" ," Twinkle House","buy"}

        };

        // JTable initialization
         jt = new JTable(d,columns);
        // set custom renderer to teams colums
        jt.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer());

        //ser custom editor
        jt.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor(new JTextField()));
         //set bounds for JTable

        jt.setPreferredScrollableViewportSize(new Dimension(1170,570));
        jt.setFillsViewportHeight(true);
        // add it to the JScrollPane
        JScrollPane jsp = new JScrollPane(jt);
        this.add(jsp);

        // Adding jbutton to columns

    }

    class ButtonRenderer/* */ extends JButton implements TableCellRenderer
    {
        public ButtonRenderer() {
            //set button properties
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object obj,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            setText((obj == null) ? "buy" : obj.toString());
            return this;
        }
    }
    class ButtonEditor extends DefaultCellEditor
    {
        private String label;
        protected JButton btn;
        private boolean clicked;

        public ButtonEditor(JTextField txt)
        {

            super(txt);
            btn = new JButton();
            btn.setOpaque(true);

            //when button is clicked
            btn.addActionListener(new ActionListener(){


                @Override
                public void actionPerformed(ActionEvent e) {
                    fireEditingCanceled();
                }
            });

        }


        public Component getTableCellEditorComponent(JTable table, Object value,
                                                     boolean isSelected, int row, int column)
        {
            label = (value == null) ? "buy" : value.toString();
            btn.setText(label);
            clicked = true;
            return btn;
        }

        public Object getCellEditorValue()
        {
           if(clicked){
               //show some message
               JOptionPane.showMessageDialog(btn,label+"Clicked");
           }
           clicked = false;
           return new String(label);
        }


        public boolean stopCellEditing(){
            clicked=false;
            return super.stopCellEditing();
        }

        protected void fireEditingStopped(){
            super.fireEditingStopped();
        }
    }

}

