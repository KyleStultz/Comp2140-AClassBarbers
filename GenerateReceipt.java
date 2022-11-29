    import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.zip.Checksum;
import java.awt.event.ActionEvent;
import java.awt.Frame;


public class GenerateReceipt  extends JFrame{
 
    private JTextField  txtName;       
    private JTextField  ccode;      
    private JButton     cmdEnter;
    private JButton     cmdClose;
    private JButton     cmdClearAll;
    private  JCheckBox checkBox;
   

    private JPanel      pnlCommand;
    private JPanel      pnlDisplay;
    private JButton cmdGrades;
    private JButton cmdClassmates;
  
    private int Balance;
    private String Paymenttype;
  
   

public   GenerateReceipt() {
setPreferredSize(new Dimension (350, 200));
setTitle("View Classmates");
pnlCommand = new JPanel();
pnlDisplay = new JPanel();
JLabel label1 = new JLabel("Test");
label1.setText("Please enter the course code to view your classmates.");

pnlDisplay.add(label1);
pnlDisplay.add(new JLabel("Course Code:"));
ccode = new JTextField(8);
pnlDisplay.add(ccode);

pnlDisplay.setLayout(new GridLayout(3,4));

cmdEnter = new JButton("Enter");
cmdClose   = new JButton("Close");

cmdClose.addActionListener(new CloseButtonListener());

pnlCommand.add(cmdEnter);
pnlCommand.add(cmdClose);
add(pnlDisplay, BorderLayout.CENTER);
add(pnlCommand, BorderLayout.SOUTH);
pack();
setVisible(true);


}
//plan to make these functions actionlisteners to open up classses of their own to execute said actions

public int getBalance(){
  return Balance;
}

public String confirmPaymentType(){
  return Paymenttype ;
}

public int addPayment(){
  return Payment;
}

public String printReceipt(){
  return  receipt;
}

public String ValidateClientUsername(){
  
}




 private class CloseButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
          
           
            setVisible(false);
        }

    }
}