package za.ui;

import crecheapp.Kiddy;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CrecheUi implements ActionListener {

    private JFrame frame;
    private JButton btnSubmit;
    JTextField txtName, txtAge;
    JRadioButton btnFemale, btnMale;
     JTextArea txtDisplay ;

    public CrecheUi() {
        frame = new JFrame("Kiddy's Creche");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 480);
        frame.setLocationRelativeTo(null);

        JPanel p1 = new JPanel(new GridLayout(6, 1));
        p1.setBorder(BorderFactory.createTitledBorder("Kidd Info"));

        JLabel lblName = new JLabel("Kid's Name: ");
        JLabel lblAge = new JLabel("Kid's Age:");
        JLabel lblGender = new JLabel("Kid's Gender: ");
        JLabel lblInformation = new JLabel("Information: ");

        txtName = new JTextField(10);
        txtAge = new JTextField(2);

        ButtonGroup grp = new ButtonGroup();
        btnMale = new JRadioButton("Male");
        btnFemale = new JRadioButton("Female");
        grp.add(btnMale);
        grp.add(btnFemale);
       

        JPanel pnlData = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlData.add(lblName);
        pnlData.add(txtName);
        p1.add(pnlData);

        pnlData = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlData.add(lblAge);
        pnlData.add(txtAge);
        p1.add(pnlData);

        pnlData = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlData.add(lblGender);
        pnlData.add(btnMale);
        pnlData.add(btnFemale);
        p1.add(pnlData);

        btnSubmit = new JButton("Submit");
        pnlData = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlData.add(btnSubmit);
        btnSubmit.addActionListener(this);
        p1.add(pnlData);

         txtDisplay = new JTextArea("output", 100, 100);
        pnlData = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnlData.add(lblInformation);
        pnlData.add(txtDisplay);
        p1.add(pnlData);
        txtDisplay.setEditable(false);

        frame.add(p1);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnSubmit) {
            String aName = txtName.getText();
            int aAge = Integer.parseInt(txtAge.getText());
            char gender='M';
            if(btnFemale.isSelected()){
                gender='F';
            }

            Kiddy kid = new Kiddy();
            kid.setName(aName);
            kid.setAge(aAge);
            kid.setGender(gender);
          

            String allInfo="Kid's name: " + aName+"\n" + "Kid's age: " + aAge+"\n" + "Gender: "+gender;
            System.out.println(allInfo);
            txtDisplay.setText(allInfo);
            
        }
    }

}
