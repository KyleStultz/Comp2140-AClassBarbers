import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel {
    private static JFrame frame;

    private JPanel pnlCommand;
    private JPanel pnlDisplay;
    private JButton cmdAddBarber;
    private JButton cmdEditBarber;
    private JButton cmdViewAppointmentSchedule;
    private JButton cmdAutomatedReminder;
    private JButton cmdClose;
    private MainMenu thisMainMenu;
    private AutomatedReminder autoremind;
    private ViewAppointmentSchedule viewappsch;

    public MainMenu() {
        super(new GridLayout(2, 1));
        thisMainMenu = this;

        pnlCommand = new JPanel();
        pnlDisplay = new JPanel();
        pnlCommand.setPreferredSize(new Dimension(700, 300));
        BoxLayout menuLayout = new BoxLayout(pnlCommand, BoxLayout.PAGE_AXIS);
        pnlCommand.setLayout(menuLayout);

        cmdAddBarber = new JButton("Add New Barber");
        cmdEditBarber = new JButton("Edit Barber Profile");
        cmdViewAppointmentSchedule = new JButton("View Appointment Schedule");
        cmdAutomatedReminder = new JButton("Open Automated Reminder");
        cmdClose = new JButton("Close");

        // button commands
        cmdAddBarber.addActionListener(new AddBarberButtonListener());
        cmdEditBarber.addActionListener(new EditBarberButtonListener());
        cmdViewAppointmentSchedule.addActionListener(new ViewAppointmentScheduleButtonListener());
        cmdAutomatedReminder.addActionListener(new AutomatedReminderButtonListener());
        cmdClose.addActionListener(new CloseButtonListener());

        cmdEditBarber.setBackground(Color.white);
        cmdViewAppointmentSchedule.setBackground(Color.white);
        cmdAutomatedReminder.setBackground(Color.white);
        cmdClose.setBackground(Color.red);
        pnlCommand.setBackground(Color.white);
        pnlDisplay.setBackground(Color.white);

        pnlCommand.add(cmdEditBarber);
        pnlCommand.add(cmdViewAppointmentSchedule);
        pnlCommand.add(cmdAutomatedReminder);
        pnlCommand.add(cmdClose);

        ////

        ImageIcon logo = new ImageIcon("icons/logo.png");
        JLabel label = new JLabel("", logo, JLabel.NORTH_EAST);
        add(label);
        add(pnlCommand);
        add(pnlDisplay);
    }

    public static void createAndShowGUI() {
        // Create and set up the window.
        frame = new JFrame("A CLASS BARBERS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set up the content pane.
        MainMenu newContentPane = new MainMenu();
        newContentPane.setOpaque(true); // content panes must be opaque
        frame.setContentPane(newContentPane);

        // Display the window.
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        // new OpeningScreen();
        // AddProduct ap = new AddProduct();
        // Product p = AddProduct.A
    }

    public class AddBarberButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) { // listener for AddBarber button, initiates when button is clicked
            new AddBarber();
            frame.setVisible(false);
        }
    }

    public class EditBarberButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {// listener for EditBarber button, initiates when button is clicked
            // function_call();
            EditBarberProfile();
        }
    }

    public class ViewAppointmentScheduleButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {// listener for ViewAppointmentSchedule button, initiates when
                                                    // button is clicked
            // function_call();
            ViewAppointmentSchedule.createandShowGUI();
        }
    }

    public class AutomatedReminderButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {// listener for AutomatedReminder button, initiates when button is
                                                    // clicked

            AutomatedReminder.createAndShowGUI();
            frame.setVisible(false);
        }
    }

    public class CloseButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e)// listener for Close button, initiates when button is clicked
        {
            System.exit(0);

        }

    }

}