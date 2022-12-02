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
import java.text.DecimalFormat;
import javax.swing.border.EmptyBorder;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.KeyEvent;

public class Appointment extends JFrame {
    // variable declaration
    private static final int WIDTH = 600;
    private static final int HEIGHT = 910;

    private JComboBox<String> weekDays;
    private JComboBox<String> scheduleTime;
    private JComboBox<String> barberChoice;
    private JComboBox<String> ethRace;
    private JComboBox<String> Style;
    private JTextField textField;
    private JCheckBox Shampoo;
    private JCheckBox HotTowel;
    // Named constants for rates
    private final double FADE_LINEUP = 1200.00;
    private final double LINEUP_SHAVE = 600.00;
    private final double TRIM_SHAVE = 1200.00;
    private final double SHAMPOO = 1200.00;
    private final double HOT_TOWEL = 500.00;

    private JButton schedule; // Schedule the appointment

    private String[] dayOptions =

            { "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday" };
    private String[] timeOptions =

            { "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "1:00", "1:30", "2:00", "2:30", "3:00", "3:30",
                    "4:00", "4:30" };

    private String[] BarberOptions =

            { "Chris Reid", "Obrien Samuels" };

    private String[] Ethnicity = { "Chinese", "Caucasian/White", "Black", "Indian" };

    private String[] HairStyle = { "Fade for $1200.00", "Lineup Alone and Shave for $600.00",
            "Trim and Shave for $1200" };

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

        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        // centerPanel holds all components
        GridLayout layout = new GridLayout(11, 1);
        layout.setVgap(10);
        layout.setHgap(20);

        JPanel centerPanel = new JPanel(layout);

        weekDays = new JComboBox<>(dayOptions);
        scheduleTime = new JComboBox<>(timeOptions);
        barberChoice = new JComboBox<>(BarberOptions);
        ethRace = new JComboBox<>(Ethnicity);
        Style = new JComboBox<>(HairStyle);

        textField = new JTextField();

        schedule = new JButton("Schedule");
        // adding component into panel
        centerPanel.add(new JLabel("Select day and time for you appointment"));
        centerPanel.add(weekDays);
        centerPanel.add(scheduleTime);
        centerPanel.add(new JLabel("Select the name of the barber for your appointment"));
        centerPanel.add(barberChoice);
        centerPanel.add(new JLabel("Select Ethnicity/HairType"));
        centerPanel.add(ethRace);
        centerPanel.add(new JLabel("Select Type of Haircut"));
        centerPanel.add(Style);

        Shampoo = new JCheckBox("Shampoo ($" + dollar.format(SHAMPOO) + " per bottle)");
        HotTowel = new JCheckBox("Hot Towel ($" + dollar.format(HOT_TOWEL) + " per towel)");

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
                    textField.setText(weekDays.getSelectedItem() + " at " + scheduleTime.getSelectedItem() + " with "
                            + barberChoice.getSelectedItem() + " for a " + Style.getSelectedItem() + " . Ethnicity: "
                            + ethRace.getSelectedItem());

                    String filename = "ViewAppointment";;
                    try (FileWriter writer = new FileWriter(filename)) {
                        try {
                            textField.write(writer);
                        } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                        try {
                            writer.close();
                        } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    }


            }
        });

    }

    public double getRate() {
        double rate = 0.0;

        if (Shampoo.isSelected())
            rate += SHAMPOO;
        if (HotTowel.isSelected())
            rate += HOT_TOWEL;
        rate += rate;

        return rate;
    }

}