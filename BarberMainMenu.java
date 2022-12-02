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

class BarberMainMenu extends JFrame implements ActionListener {
    private JPanel contentPane;

    public BarberMainMenu() {
        setBounds(100, 100, 650, 500);
        contentPane = new JPanel();
        contentPane.setForeground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel BarberMainMenupanel = new JPanel();
        BarberMainMenupanel.setBackground(Color.WHITE);
        BarberMainMenupanel.setForeground(Color.WHITE);
        contentPane.add(BarberMainMenupanel, BorderLayout.CENTER);
        BarberMainMenupanel.setLayout(null);

        JButton btnBarberProfileButton = new JButton("Barber Profile");
        btnBarberProfileButton.setForeground(Color.BLACK);
        btnBarberProfileButton.setBackground(Color.WHITE);
        btnBarberProfileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AddBarberProfile abf = new AddBarberProfile();

            }
        });
        btnBarberProfileButton.setBounds(6, 43, 150, 29);
        BarberMainMenupanel.add(btnBarberProfileButton);

        JButton btnNewButton = new JButton("View Appointment Schedule");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewAppointment ViewApp = new ViewAppointment();

            }
        });
        btnNewButton.setBounds(254, 43, 150, 29);
        BarberMainMenupanel.add(btnNewButton);

        JButton btnAutoRemindButton = new JButton("Automated Reminder");
        btnAutoRemindButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AutomatedReminder aurem = new AutomatedReminder();
            }
        });
        btnAutoRemindButton.setBounds(461, 43, 150, 29);
        BarberMainMenupanel.add(btnAutoRemindButton);

        JLabel lblMainHeader = new JLabel("A CLASS BARBERS ADMIN SECTION");
        lblMainHeader.setHorizontalAlignment(SwingConstants.CENTER);
        lblMainHeader.setForeground(new Color(0, 51, 255));
        lblMainHeader.setBounds(6, 6, 628, 16);
        BarberMainMenupanel.add(lblMainHeader);

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
