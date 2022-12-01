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

public class ClientMainMenu extends JPanel {
    private static JFrame frame;

    private JPanel pnlCommand;
    private JPanel pnlDisplay;
    private JButton cmdEditClient;
    private JButton cmdMakeAppointment;
    private JButton cmdGenerateReceipt;
    private JButton cmdClose;
    private ClientMainMenu thisMainMenu;
    private GenerateReceipt genReceipt;

    public ClientMainMenu() {
        super(new GridLayout(2, 1));
        thisMainMenu = this;

        pnlCommand = new JPanel();
        pnlDisplay = new JPanel();
        pnlCommand.setPreferredSize(new Dimension(720, 280));
        BoxLayout menuLayout = new BoxLayout(pnlCommand, BoxLayout.PAGE_AXIS);
        pnlCommand.setLayout(menuLayout);

        cmdEditClient = new JButton("Edit Client Account");
        cmdMakeAppointment = new JButton("Make an Appointment");
        cmdGenerateReceipt = new JButton("View Generated Receipt");
        cmdClose = new JButton("Close");

        // button commands
        cmdEditClient.addActionListener(new EditClientButtonListener());
        cmdMakeAppointment.addActionListener(new MakeAppointmentButtonListener());
        cmdGenerateReceipt.addActionListener(new GenerateReceiptButtonListener());
        cmdClose.addActionListener(new CloseButtonListener());

        cmdEditClient.setBackground(Color.white);
        cmdMakeAppointment.setBackground(Color.white);
        cmdGenerateReceipt.setBackground(Color.white);
        cmdClose.setBackground(Color.red);
        pnlCommand.setBackground(Color.white);
        pnlDisplay.setBackground(Color.white);

        pnlCommand.add(cmdEditClient);
        pnlCommand.add(cmdMakeAppointment);
        pnlCommand.add(cmdGenerateReceipt);
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
        ClientMainMenu newContentPane = new ClientMainMenu();
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

    public class EditClientButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {// listener for EditClient button, initiates when button is clicked
            // function_call();
        }
    }

    public class MakeAppointmentButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {// listener for MakeAppointment button, initiates when button is
                                                    // clicked
            // function_call();
            // new MakeAppointment();
            // frame.setVisibile(true)
        }
    }

    public class GenerateReceiptButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {// listener for GenerateReceipt button, initiates when button is
                                                    // clicked
            new GenerateReceipt();
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