import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
import ClientAccount;

class LoginForm extends JFrame implements ActionListener {
    // initialize button, panel, label, and text field
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField textField1, textField2;

    // calling constructor
    LoginForm() {
        userLabel = new JLabel();
        userLabel.setText("Username");

        textField1 = new JTextField(15);

        passLabel = new JLabel();
        passLabel.setText("Password");

        textField2 = new JPasswordField(15);

        b1 = new JButton("SUBMIT");

        // create panel to put form elements
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(userLabel); // set username label to panel
        newPanel.add(textField1); // set text field to panel
        newPanel.add(passLabel); // set password label to panel
        newPanel.add(textField2); // set text field to panel
        newPanel.add(b1); // set button to panel

        // set border to panel
        add(newPanel, BorderLayout.CENTER);

        // perform action on button click
        b1.addActionListener(this);
        setTitle("LOGIN FORM");
    }

    public void actionPerformed(ActionEvent ae) {
        String userValue = textField1.getText();
        String passValue = textField2.getText();

        // check whether the credentials are authentic or not
        // if authentic, navigate user to the main menu, else invalid username and
        // password
        if (userValue.equals("admin") && passValue.equals("password123")) {
            BarberMainMenu bmenu = new BarberMainMenu();
            bmenu.setVisible(false);
        } else if (userValue.equals(ClientAccount.getUsername()) && (passValue.equals(ClientAccount.getPassword()))) {
            ClientMainMenu cmenu = new ClientMainMenu();
            cmenu.setVisible(false);
        } else {
            // show error message
            System.out.println("Please enter valid username and password");
        }
    }
}