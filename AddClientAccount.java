
/*
 * Adding a new Client account allows users toregister before making an appointment
 * 
 * 
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class AddClientAccount extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JTextField txtUName;
    private JTextField txtEmail;
    private JTextField txtpNum;
    private JTextField txtAge;
    private JTextField txtId;
    private ArrayList<ClientAccount> ClientAccount = new ArrayList<ClientAccount>(); // array list to store clients when
                                                                                     // they sign up. AddClientAccount
                                                                                     // is the name of the array
    private JTextField txtPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            AddClientAccount dialog = new AddClientAccount();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public AddClientAccount() {
        setForeground(Color.WHITE);
        setVisible(true);
        setBounds(100, 100, 627, 410);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(new BorderLayout(0, 0));

        JLabel lblAddClientAccountLabel = new JLabel("Create your Client Account");
        lblAddClientAccountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPanel.add(lblAddClientAccountLabel, BorderLayout.NORTH);

        JPanel AddClientAccountPanel = new JPanel();
        contentPanel.add(AddClientAccountPanel, BorderLayout.CENTER);
        AddClientAccountPanel.setLayout(null);

        JLabel lblUName = new JLabel("Username");
        lblUName.setForeground(Color.BLACK);
        lblUName.setBounds(6, 20, 86, 16);
        AddClientAccountPanel.add(lblUName);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(6, 60, 86, 16);
        AddClientAccountPanel.add(lblemail);

        JLabel lblpNum = new JLabel("Phone Number");
        lblpNum.setBounds(6, 100, 86, 16);
        AddClientAccountPanel.add(lblpNum);

        JLabel lblAge = new JLabel("Age");
        lblAge.setBounds(6, 140, 86, 16);
        AddClientAccountPanel.add(lblAge);

        JLabel lblId = new JLabel("Id");
        lblId.setBounds(6, 180, 86, 16);
        AddClientAccountPanel.add(lblId);

        txtUName = new JTextField();
        txtUName.setBounds(120, 10, 400, 26);
        AddClientAccountPanel.add(txtUName);
        txtUName.setColumns(10);

        txtEmail = new JTextField();
        txtEmail.setColumns(10);
        txtEmail.setBounds(120, 55, 400, 26);
        AddClientAccountPanel.add(txtEmail);

        txtpNum = new JTextField();
        txtpNum.setColumns(10);
        txtpNum.setBounds(120, 93, 400, 26);
        AddClientAccountPanel.add(txtpNum);

        txtAge = new JTextField();
        txtAge.setColumns(10);
        txtAge.setBounds(120, 131, 400, 26);
        AddClientAccountPanel.add(txtAge);

        txtId = new JTextField();
        txtId.setBounds(120, 169, 400, 26);
        AddClientAccountPanel.add(txtId);
        txtId.setColumns(10);

        txtPassword = new JTextField();
        txtPassword.setBounds(120, 220, 400, 26);
        AddClientAccountPanel.add(txtPassword);
        txtPassword.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(6, 220, 86, 16);
        AddClientAccountPanel.add(lblPassword);
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton btnAddClientAccount = new JButton("Add Client Account");
                btnAddClientAccount.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        String u = txtUName.getText();
                        if (txtUName.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(txtUName, "Please Enter Username", "Input Error",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                        String em = txtEmail.getText();
                        if (txtEmail.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(txtEmail, "Please Enter Email", "Input Error",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                        String pn = txtpNum.getText();
                        if (txtpNum.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(txtpNum, "Please Enter Phone Number", "Input Error",
                                    JOptionPane.WARNING_MESSAGE);
                        }
                        int a = Integer.parseInt(txtAge.getText());
                        if (txtAge.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(txtAge, "Please Enter Age", "Input Error",
                                    JOptionPane.WARNING_MESSAGE);
                        }

                        String i = txtId.getText();
                        if (txtId.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(txtId, "Please Enter Id", "Input Error",
                                    JOptionPane.WARNING_MESSAGE);
                        }

                        String p = txtPassword.getText();

                        ClientAccount C = new ClientAccount(u, em, pn, a, i, p);

                        ClientAccount.add(C);
                        txtUName.setText("");
                        txtEmail.setText("");
                        txtpNum.setText("");
                        txtAge.setText("");
                        txtPassword.setText("");

                        JOptionPane.showMessageDialog(btnAddClientAccount,
                                "Username: " + u + "\n" + "Email: " + em + "\n" + "Phone Number: " + pn + "\n" + "Age: "
                                        + a + "\n" + "\n" + "Password: " + p + "\n");
                    }
                });
                btnAddClientAccount.setActionCommand("OK");
                buttonPane.add(btnAddClientAccount);
                getRootPane().setDefaultButton(btnAddClientAccount);
            }
            {
                JButton cancelButton = new JButton("Cancel");
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        dispose();
                    }
                });

                JButton btnLogin = new JButton("Log In");
                btnLogin.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        LoginForm lf = new LoginForm();
                        lf.setVisible(true);
                    }
                });
                buttonPane.add(btnLogin);
                cancelButton.setActionCommand("Cancel");
                buttonPane.add(cancelButton);
            }
        }
    }
}