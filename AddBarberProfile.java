import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddBarberProfile extends JFrame {
    private JTextField  txtName;      
    private JTextField  txtEmail;    
    private JTextField  txtAvailability; 
    private JTextField  txtID; 
    private JTextField  txtpNum; 
    private JButton     cmdSave;
    private JButton     cmdClose;
    private BarberTable bTable;
    private JPanel      pnlCommand;
    private JPanel      pnlDisplay;

    public AddBarberProfile (BarberTable bTable){
        this.bTable = bTable;
        setTitle("Entering a new Barber");
        pnlCommand = new JPanel();
        pnlDisplay = new JPanel();
        pnlDisplay.add(new JLabel("Name:"));
        txtName = new JTextField(20);
        pnlDisplay.add(txtName);
        pnlDisplay.add(new JLabel("Availability:"));
        txtAvailability = new JTextField(30);
        pnlDisplay.add(txtAvailability);
        pnlDisplay.add(new JLabel("Email:"));
        txtEmail = new JTextField(30);
        pnlDisplay.add(txtEmail);
        pnlDisplay.add(new JLabel("ID:"));
        txtID = new JTextField(30);
        pnlDisplay.add(txtID);
        pnlDisplay.add(new JLabel("Phone Number:"));
        txtpNum = new JTextField(30);
        pnlDisplay.add(txtpNum);

        pnlDisplay.setLayout(new GridLayout(4,4));
        cmdSave      = new JButton("Save");
        cmdClose   = new JButton("Close");

        cmdClose.addActionListener(new VisibleListener());
        cmdSave.addActionListener(new AddToListListener());

        pnlCommand.add(cmdSave);
        pnlCommand.add(cmdClose);
        add(pnlDisplay, BorderLayout.CENTER);
        add(pnlCommand, BorderLayout.SOUTH);
        pack();
        setVisible(true);

    }

    private class VisibleListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            dispose();
        }
    }

    private class AddToListListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            try
            {
                
                String name = txtName.getText();
                String ava = txtAvailability.getText();
                String msg = txtEmail.getText();
                String phone = txtpNum.getText();
                String id = txtID.getText();
                int id1 = Integer.parseInt(id);
                int phone1 = Integer.parseInt(phone);
                bTable.addBarber(new Barber(name, ava, msg, phone1, id1));
                setVisible(false);


            } catch (NumberFormatException e){
            }
            

        }
    }

}



