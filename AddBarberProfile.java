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

public class AddBarberProfile extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JTextField txtUName;
    private JTextField txtEmail;
    private JTextField txtpNum;
    private JTextField txtBLN;
    private JTextField txtId;
    private ArrayList<BarberProfile> BarberProfile = new ArrayList<BarberProfile>(); // array list to store clients when
                                                                                     // they sign up. AddBarberProfile
                                                                                     // is the name of the array
    private JTextField txtPassword;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            AddBarberProfile dialog = new AddBarberProfile();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public AddBarberProfile() {
        setForeground(Color.WHITE);
        setVisible(true);
        setBounds(100, 100, 627, 410);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(new BorderLayout(0, 0));

        JLabel lblAddBarberProfileLabel = new JLabel("Create your Barber Profile");
        lblAddBarberProfileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPanel.add(lblAddBarberProfileLabel, BorderLayout.NORTH);

        JPanel AddBarberProfilePanel = new JPanel();
        contentPanel.add(AddBarberProfilePanel, BorderLayout.CENTER);
        AddBarberProfilePanel.setLayout(null);

        JLabel lblUName = new JLabel("BarberUsername");
        lblUName.setForeground(Color.BLACK);
        lblUName.setBounds(6, 20, 86, 16);
        AddBarberProfilePanel.add(lblUName);

        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(6, 60, 86, 16);
        AddBarberProfilePanel.add(lblemail);

        JLabel lblpNum = new JLabel("Phone Number");
        lblpNum.setBounds(6, 100, 86, 16);
        AddBarberProfilePanel.add(lblpNum);

        JLabel lblBLN = new JLabel("Barber Lic. Num.");
        lblBLN.setBounds(6, 140, 86, 16);
        AddBarberProfilePanel.add(lblBLN);

        JLabel lblId = new JLabel("Id");
        lblId.setBounds(6, 180, 86, 16);
        AddBarberProfilePanel.add(lblId);

        txtUName = new JTextField();
        txtUName.setBounds(120, 10, 400, 26);
        AddBarberProfilePanel.add(txtUName);
        txtUName.setColumns(10);

        txtEmail = new JTextField();
        txtEmail.setColumns(10);
        txtEmail.setBounds(120, 55, 400, 26);
        AddBarberProfilePanel.add(txtEmail);

        txtpNum = new JTextField();
        txtpNum.setColumns(10);
        txtpNum.setBounds(120, 93, 400, 26);
        AddBarberProfilePanel.add(txtpNum);

        txtBLN = new JTextField();
        txtBLN.setColumns(10);
        txtBLN.setBounds(120, 131, 400, 26);
        AddBarberProfilePanel.add(txtBLN);

        txtId = new JTextField();
        txtId.setBounds(120, 169, 400, 26);
        AddBarberProfilePanel.add(txtId);
        txtId.setColumns(10);

        txtPassword = new JTextField();
        txtPassword.setBounds(120, 220, 400, 26);
        AddBarberProfilePanel.add(txtPassword);
        txtPassword.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(6, 220, 86, 16);
        AddBarberProfilePanel.add(lblPassword);
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
            {
                JButton btnAddBarberProfile = new JButton("Add Barber Profile");
                btnAddBarberProfile.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        String u = txtUName.getText();
                        if (txtUName.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(txtUName, "Please Enter Barber Username", "Input Error",
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
                        int a = Integer.parseInt(txtBLN.getText());
                        if (txtBLN.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(txtBLN, "Please Enter BLN", "Input Error",
                                    JOptionPane.WARNING_MESSAGE);
                        }

                        String i = txtId.getText();
                        if (txtId.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(txtId, "Please Enter Id", "Input Error",
                                    JOptionPane.WARNING_MESSAGE);
                        }

                        String p = txtPassword.getText();
                        if (txtPassword.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(txtId, "Please Enter Id", "Input Error",
                                    JOptionPane.WARNING_MESSAGE);
                        }

                        BarberMainMenu bmenu = new BarberMainMenu();
                        bmenu.setVisible(true);

                        BarberProfile C = new BarberProfile(u, em, pn, a, i, p);

                        BarberProfile.add(C);
                        txtUName.setText("");
                        txtEmail.setText("");
                        txtpNum.setText("");
                        txtBLN.setText("");
                        txtPassword.setText("");

                        JOptionPane.showMessageDialog(btnAddBarberProfile,
                                "Username: " + u + "\n" + "Email: " + em + "\n" + "Phone Number: " + pn + "\n" + "BLN: "
                                        + a + "\n" + "\n" + "Password: " + p + "\n");
                    }
                });
                btnAddBarberProfile.setActionCommand("OK");
                buttonPane.add(btnAddBarberProfile);
                getRootPane().setDefaultButton(btnAddBarberProfile);
            }
            {
                JButton cancelButton = new JButton("Cancel");
                cancelButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        dispose();
                    }
                });

                JButton btnLogin = new JButton(" Back to Log In");
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


