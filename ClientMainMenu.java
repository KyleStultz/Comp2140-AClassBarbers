import javax.swing.*; // JFrame, JMenuBar, JMenu, JMenuItem
import java.awt.event.*; // ActionListener, ActionEvent
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;

class ClientMainMenu extends JFrame implements ActionListener {
    private JPanel contentPane;

    public ClientMainMenu() {
        setBounds(100, 100, 650, 500);
        contentPane = new JPanel();
        contentPane.setForeground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel ClientMainMenupanel = new JPanel();
        ClientMainMenupanel.setBackground(Color.WHITE);
        ClientMainMenupanel.setForeground(Color.WHITE);
        contentPane.add(ClientMainMenupanel, BorderLayout.CENTER);
        ClientMainMenupanel.setLayout(null);

        JButton btnClientProfileButton = new JButton("Client Act Settings");
        btnClientProfileButton.setForeground(Color.BLACK);
        btnClientProfileButton.setBackground(Color.WHITE);
        btnClientProfileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ClientAccountTable cat = new ClientAccountTable();
                // cat.setVisible(true);

            }
        });
        btnClientProfileButton.setBounds(6, 43, 150, 29);
        ClientMainMenupanel.add(btnClientProfileButton);

        JButton btnNewButton = new JButton("Make an Appointment");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Appointment App = new Appointment();
            }
        });
        btnNewButton.setBounds(254, 43, 150, 29);
        ClientMainMenupanel.add(btnNewButton);

        JButton btnAutoRemindButton = new JButton("View Receipt");
        btnAutoRemindButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewReceipt ViewRec = new ViewReceipt();
            }
        });
        btnAutoRemindButton.setBounds(461, 43, 150, 29);
        ClientMainMenupanel.add(btnAutoRemindButton);

        JLabel lblMainHeader = new JLabel("A CLASS BARBERS CLIENT MAIN MENU");
        lblMainHeader.setHorizontalAlignment(SwingConstants.CENTER);
        lblMainHeader.setForeground(new Color(0, 51, 255));
        lblMainHeader.setBounds(6, 6, 628, 16);
        ClientMainMenupanel.add(lblMainHeader);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu SideMenu = new JMenu("Side Menu");
        menuBar.add(SideMenu);
        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(this);
        SideMenu.add(quit);
    }

    public void actionPerformed(ActionEvent ae) {
        String choice = ae.getActionCommand();
        if (choice.equals("Quit")) {
            System.exit(0);
        }

    }
}
