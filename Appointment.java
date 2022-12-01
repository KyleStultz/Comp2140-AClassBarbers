import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Appointment extends JFrame {
    // variable declaration
    private static final int WIDTH = 500;
    private static final int HEIGHT = 800;

    private JComboBox<String> weekDays;
    private JComboBox<String> scheduleTime;
    private JComboBox<String> barberChoice;
    private JComboBox<String> ethRace;
    private JTextField textField;
    private JCheckBox Fade;
    private JCheckBox TrimandShave;
    private JCheckBox LineupandShave;
    private JCheckBox Shave;
    private JCheckBox Shampoo;
    private JCheckBox HotTowel;

    private JButton schedule; // Schedule the appointment

    private String[] dayOptions =

            { "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday" };
    private String[] timeOptions =

            { "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "1:00", "1:30", "2:00", "2:30", "3:00", "3:30",
                    "4:00", "4:30" };

    private String[] BarberOptions =

            { "Chris Reid", "Obrien Samuels" };

    private String[] Ethnicity = { "Chinese", "Caucasian/White", "Black", "Indian" };

    public Appointment() {

        setTitle("Making an Appointment");

        setSize(WIDTH, HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        createContents();

        setVisible(true);

    }

    private void createContents()

    {
        JPanel windowPanel = new JPanel(new BorderLayout(0, 10));

        windowPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // centerPanel holds all components
        GridLayout layout = new GridLayout(11, 1);
        layout.setVgap(10);
        layout.setHgap(20);
        JPanel centerPanel = new JPanel(layout);

        weekDays = new JComboBox<>(dayOptions);
        scheduleTime = new JComboBox<>(timeOptions);
        barberChoice = new JComboBox<>(BarberOptions);
        ethRace = new JComboBox<>(Ethnicity);

        textField = new JTextField();

        schedule = new JButton("Schedule");
        // adding component into panel
        centerPanel.add(new JLabel("Select day and time for you appointment"));
        centerPanel.add(weekDays);
        centerPanel.add(scheduleTime);
        centerPanel.add(new JLabel("Select the name of the barber for your appointment"));
        centerPanel.add(barberChoice);
        centerPanel.add(new JLabel("Select Ethnicity"));
        centerPanel.add(ethRace);
        centerPanel.add(schedule);
        centerPanel.add(new JLabel("Your appointment is scheduled for:"));
        centerPanel.add(textField);

        windowPanel.add(centerPanel, BorderLayout.CENTER);
        add(windowPanel);
        schedule.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (weekDays.getSelectedItem() != null && scheduleTime.getSelectedItem() != null
                        && barberChoice.getSelectedItem() != null) {
                    // setting value in textField
                    textField.setText(weekDays.getSelectedItem() + " at " + scheduleTime.getSelectedItem() + "with"
                            + barberChoice.getSelectedItem());
                }

            }
        });

    }

}
