import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Login in to either the barber menu or client menu based on password
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//create CreateLoginForm class to create login form
//class extends JFrame to create a window where our component add
//class implements ActionListener to perform an action on button click
class LoginForm extends JFrame implements ActionListener {
    // initialize button, panel, label, and text field
    JButton b1;
    JPanel newPanel;
    JLabel userLabel, passLabel;
    final JTextField textField1, textField2;
    JFrame error;
    JLabel msg;

    // calling constructor
    LoginForm() {

        setSize(1000, 500); // set size of the frame

        // create label for username
        userLabel = new JLabel();
        userLabel.setText("Username"); // set label value for textField1

        // create text field to get username from the user
        textField1 = new JTextField(20); // set length of the text

        // create label for password
        passLabel = new JLabel();
        passLabel.setText("Password"); // set label value for textField2

        // create text field to get password from the user
        textField2 = new JPasswordField(20); // set length for the password

        // create submit button
        b1 = new JButton("SUBMIT"); // set label to button

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
        b1.addActionListener(this); // add action listener to button
        setTitle("LOGIN FORM"); // set title to the login form
    }

    // define abstract method actionPerformed() which will be called on button click
    public void actionPerformed(ActionEvent ae) // pass action listener as a parameter
    {
        String userValue = textField1.getText(); // get user entered username from the textField1
        String passValue = textField2.getText(); // get user entered pasword from the textField2

        // check whether the credentials are authentic or not
        if (userValue.equals("admin") && passValue.equals("password")) { // if authentic, navigate user to a new page

            // create instance for the Barber Menu Page
            BarberMainMenu bmenu = new BarberMainMenu();
            // make page visible to the user
            bmenu.setVisible(true);

        } else if (userValue.equals("JohnBrown") && passValue.equals("password")) {
            ClientMainMenu cmenu = new ClientMainMenu();
            cmenu.setVisible(true);
        } else {
            // show error message
            error = new JFrame("Error");
            msg = new JLabel();
            msg.setText("Wrong username and/or password entered. Please, try again.");
            JPanel p = new JPanel();
            p.add(msg);
            error.add(p);
            error.setSize(500, 500);
            error.setVisible(true);
        }
    }
}
