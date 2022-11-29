
/**
 * This class provides functions that allow the Barber to make changes to his public profile.
 *
 * @author - Kyle Stultz
 * 
 */
import java.util.*;
import java.util.List;
import java.io.File;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class EditCustomer extends JFrame implements ActionListener {
    private Scanner scan = new Scanner(System.in);
    String input;
    private static String firstname, lastname, BarEmail, phone, BarLiNum, BarAvail;

    private Container container;
    private JLabel title;

    private JLabel BarberFNameLabel;
    private JTextField BarberFNameField;
    private JLabel BarberLNameLabel;
    private JTextField BarberLNameField;
    private JLabel BarberEmailLabel;
    private JTextField BarberEmailField;
    private JLabel BarberNumLabel;
    private JTextField BarberNumField;
    private JLabel BarberAvailableLabel;
    private JTextField BarberAvailableField;
    private JLabel BarberLicenseNumLabel;
    private JTextField BarberLicenseNumField;
    private JLabel idLabel;
    private JTextField idField;
    private JTextField searchbar;

    private JButton submitBtn;
    private JButton resetBtn;
    private JButton removeBtn;
    private JButton searchBtn;
    private JButton backBtn;
    private Icon backIcon;
    private JTextArea notify;

    Color lpink = (new Color(250, 200, 250));
    Color dblue = (new Color(10, 10, 15));
    Color dblue2 = (new Color(21, 21, 31));
    Color dpink = (new Color(255, 30, 75));

    public void findCustomer() {

        setTitle("A Class Barbers");
        setBounds(300, 90, 900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setBackground(dblue);
        container.setLayout(null);

        title = new JLabel("Edit Barber Details");
        title.setFont(new Font("Arial", Font.BOLD, 35));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        title.setForeground(dpink);
        container.add(title);

        BarberFNameLabel = new JLabel("First Name");
        BarberFNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        BarberFNameLabel.setSize(150, 20);
        BarberFNameLabel.setLocation(100, 100);
        BarberFNameLabel.setForeground(lpink);
        container.add(BarberFNameLabel);

        BarberFNameField = new JTextField();
        BarberFNameField.setFont(new Font("Arial", Font.PLAIN, 15));
        BarberFNameField.setBackground(Color.white);
        BarberFNameField.setSize(190, 20);
        BarberFNameField.setLocation(250, 100);
        container.add(BarberFNameField);

        BarberLNameLabel = new JLabel("Last Name");
        BarberLNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
        BarberLNameLabel.setSize(100, 20);
        BarberLNameLabel.setLocation(100, 150);
        BarberLNameLabel.setForeground(lpink);
        container.add(BarberLNameLabel);

        BarberLNameField = new JTextField();
        BarberLNameField.setFont(new Font("Arial", Font.PLAIN, 15));
        BarberLNameField.setBackground(Color.white);
        BarberLNameField.setSize(190, 20);
        BarberLNameField.setLocation(250, 150);
        container.add(BarberLNameField);

        BarberEmailLabel = new JLabel("BarberEmail");
        BarberEmailLabel.setFont(new Font("Arial", Font.BOLD, 20));
        BarberEmailLabel.setSize(100, 20);
        BarberEmailLabel.setLocation(100, 200);
        BarberEmailLabel.setForeground(lpink);
        container.add(BarberEmailLabel);

        BarberEmailField = new JTextField();
        BarberEmailField.setFont(new Font("Arial", Font.PLAIN, 15));
        BarberEmailField.setBackground(Color.white);
        BarberEmailField.setSize(190, 20);
        BarberEmailField.setLocation(250, 200);
        container.add(BarberEmailField);

        BarberNumLabel = new JLabel("Phone Number");
        BarberNumLabel.setFont(new Font("Arial", Font.BOLD, 20));
        BarberNumLabel.setSize(100, 20);
        BarberNumLabel.setLocation(100, 250);
        BarberNumLabel.setForeground(lpink);
        container.add(BarberNumLabel);

        BarberNumField = new JTextField();
        BarberNumField.setFont(new Font("Arial", Font.PLAIN, 15));
        BarberNumField.setBackground(Color.white);
        BarberNumField.setSize(190, 20);
        BarberNumField.setLocation(250, 250);
        container.add(BarberNumField);

        BarberAvailableLabel = new JLabel("BarberAvailable");
        BarberAvailableLabel.setFont(new Font("Arial", Font.BOLD, 20));
        BarberAvailableLabel.setSize(100, 20);
        BarberAvailableLabel.setLocation(100, 300);
        BarberAvailableLabel.setForeground(lpink);
        container.add(BarberAvailableLabel);

        BarberAvailableField = new JTextField();
        BarberAvailableField.setFont(new Font("Arial", Font.PLAIN, 15));
        BarberAvailableField.setBackground(Color.white);
        BarberAvailableField.setSize(190, 20);
        BarberAvailableField.setLocation(250, 300);
        container.add(BarberAvailableField);

        BarberLicenseNumLabel = new JLabel("BarberLicenseNum");
        BarberLicenseNumLabel.setFont(new Font("Arial", Font.BOLD, 20));
        BarberLicenseNumLabel.setSize(100, 25);
        BarberLicenseNumLabel.setLocation(100, 350);
        BarberLicenseNumLabel.setForeground(lpink);
        container.add(BarberLicenseNumLabel);

        BarberLicenseNumField = new JTextField(3);
        BarberLicenseNumField.setFont(new Font("Arial", Font.PLAIN, 15));
        BarberLicenseNumField.setBackground(Color.white);
        BarberLicenseNumField.setSize(190, 20);
        BarberLicenseNumField.setLocation(250, 350);
        container.add(BarberLicenseNumField);

        idLabel = new JLabel("Assign ID");
        idLabel.setFont(new Font("Arial", Font.BOLD, 20));
        idLabel.setSize(100, 25);
        idLabel.setLocation(100, 400);
        idLabel.setForeground(lpink);
        container.add(idLabel);

        idField = new JTextField();
        idField.setFont(new Font("Arial", Font.PLAIN, 15));
        idField.setBackground(Color.white);
        idField.setSize(190, 20);
        idField.setLocation(250, 400);
        container.add(idField);

        submitBtn = new JButton("Submit");
        submitBtn.setFont(new Font("Arial", Font.BOLD, 25));
        submitBtn.setForeground(dpink);
        submitBtn.setBackground(lpink);
        submitBtn.setSize(340, 50);
        submitBtn.setLocation(100, 450);
        submitBtn.addActionListener(this);
        container.add(submitBtn);

        resetBtn = new JButton("Reset");
        resetBtn.setFont(new Font("Arial", Font.BOLD, 25));
        resetBtn.setForeground(Color.white);
        resetBtn.setBackground(dpink);
        resetBtn.setSize(340, 50);
        resetBtn.setLocation(100, 520);
        resetBtn.addActionListener(this);
        container.add(resetBtn);

        removeBtn = new JButton("Remove Barber");
        removeBtn.setFont(new Font("Arial", Font.BOLD, 25));
        removeBtn.setForeground(Color.white);
        removeBtn.setBackground(dpink);
        removeBtn.setSize(340, 50);
        removeBtn.setLocation(100, 550);
        removeBtn.addActionListener(this);
        container.add(removeBtn);

        notify = new JTextArea();
        notify.setFont(new Font("Arial", Font.PLAIN, 20));
        notify.setSize(300, 320);
        notify.setForeground(Color.white);
        notify.setBackground(dblue2);
        notify.setLocation(500, 100);
        notify.setLineWrap(true);
        notify.setEditable(false);
        notify.setBorder(BorderFactory.createLineBorder(lpink));
        container.add(notify);

        searchBtn = new JButton("Search Barber ID");
        searchBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        searchBtn.setBackground(new Color(179, 179, 252));
        searchBtn.setSize(100, 30);
        searchBtn.setLocation(700, 440);
        searchBtn.addActionListener(this);
        container.add(searchBtn);
        searchbar = new JTextField();
        searchbar.setFont(new Font("Arial", Font.PLAIN, 15));
        searchbar.setBackground(Color.white);
        searchbar.setSize(190, 30);
        searchbar.setLocation(500, 440);
        container.add(searchbar);
        backIcon = new ImBarberLicenseNumIcon("icons/exit.png");
        backBtn = new JButton("", backIcon);
        backBtn.addActionListener(new CloseButtonListener());
        backBtn.setSize(100, 70);
        backBtn.setBackground(lpink);
        backBtn.setLocation(700, 500);
        container.add(backBtn);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == searchBtn) {

            String id = searchbar.getText();

            if (id.isEmpty()) {
                notify.setText("Please enter the ID of the barber you would like to edit.");
            }

            else {
                notify.setText(SearchCustomer(id));
                String blank = "";
                BarberFNameField.setText(blank);
                BarberLNameField.setText(blank);
                BarberEmailField.setText(blank);
                BarberNumField.setText(blank);
                BarberAvailableField.setText(blank);
                BarberLicenseNumField.setText(blank);
                idField.setText(id);

            }

            if (event.getSource() == removeBtn) {
                try {

                    String old = "";
                    BufferedReader reader1 = new BufferedReader(new FileReader("Customers.txt"));

                    String line1 = reader1.readLine();

                    while (line1 != null) {
                        old = old + line1 + System.lineSeparator();
                        line1 = reader1.readLine();
                    }
                    String new1 = old
                            .replaceAll("" + firstname + lastname + BarEmail + phone + BarAvail + BarLiNum + id, "");
                    FileWriter writer1 = new FileWriter("Customers.txt");
                    writer1.write(new1);
                    reader1.close();
                    writer1.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }

            }

            if (event.getSource() == submitBtn) {
                String BarberFName;
                String BarberLName;
                String BarberEmail;
                String BarberNum;
                String BarberAvailable;
                String BarberLicenseNum;

                if (((BarberFNameField.getText()).isEmpty()) != true) {
                    BarberFName = BarberFNameField.getText();
                } else {
                    BarberFName = firstname;
                }
                if (((BarberLNameField.getText()).isEmpty()) != true) {
                    BarberLName = BarberLNameField.getText();
                } else {
                    BarberLName = lastname;
                }
                if (((BarberEmailField.getText()).isEmpty()) != true) {
                    BarberEmail = BarberEmailField.getText();
                } else {
                    BarberEmail = BarEmail;
                }
                if (((BarberNumField.getText()).isEmpty()) != true) {
                    BarberNum = BarberNumField.getText();
                } else {
                    BarberNum = phone;
                }
                if (((BarberAvailableField.getText()).isEmpty()) != true) {
                    BarberAvailable = BarberAvailableField.getText();
                } else {
                    BarberAvailable = BarAvail;
                }
                if (((BarberLicenseNumField.getText()).isEmpty()) != true) {
                    BarberLicenseNum = BarberLicenseNumField.getText();
                } else {
                    BarberLicenseNum = BarLiNum;
                }

                notify.setText("");

                if (BarberNum.length() == 7) {
                    BarberNum = "876" + BarberNum;
                }

                if (validateName(BarberFName) == false) {
                    notify.setText(
                            "The submitted first name is not valid. Only letters and certain symbols are permitted.");
                    BarberFNameField.setBackground(lpink);
                } else if (validateName(BarberLName) == false) {
                    notify.setText(
                            "The submitted last name is not valid. Only letters and certain symbols are permitted.");
                    BarberLNameField.setBackground(lpink);
                } else if (validateBarberEmail(BarberEmail) == false) {
                    notify.setText("The submitted email is not valid. Please ensure you added the domain.");
                    BarberEmailField.setBackground(lpink);
                } else if (validatePhone(BarberNum) == false) {
                    notify.setText(
                            "The submitted phone number is not valid. Must be 7 or 10 digits and begin with valid digits.");
                    BarberNumField.setBackground(lpink);
                } else if (validateBarberAvailable(BarberAvailable) == false) {
                    notify.setText("The submitted date and time is not valid. Only letters and numbers are permitted.");
                    BarberAvailableField.setBackground(lpink);
                } else if (validateBarberLicenseNum(Integer.valueOf(BarberLicenseNum)) == false) {
                    notify.setText(
                            "The submitted Barber License Number is not valid. Please ensure ther correct Numbers and Letters are entered.");
                    BarberLicenseNumField.setBackground(lpink);
                } else if (validateID(id) == false) {
                    notify.setText(
                            "The submitted ID name is not valid. Please ensure it includes a letter or a number.");
                    idField.setBackground(lpink);
                } else {
                    String blank = "";
                    BarberFNameField.setText(blank);
                    BarberLNameField.setText(blank);
                    BarberEmailField.setText(blank);
                    BarberNumField.setText(blank);
                    BarberAvailableField.setText(blank);
                    BarberLicenseNumField.setText(blank);
                    idField.setText(blank);

                    Customer c = new Customer(BarberFName, BarberLName, BarberEmail, BarberNum, BarberAvailable,
                            Integer.valueOf(BarberLicenseNum), id);
                    System.out.println(c);

                    try {

                        String oldContent = "";
                        BufferedReader reader = new BufferedReader(new FileReader("BarberProfile.txt"));
                        String line = reader.readLine();

                        while (line != null) {
                            oldContent = oldContent + line + System.lineSeparator();
                            line = reader.readLine();
                        }
                        String newContent = oldContent.replaceAll(
                                "" + firstname + lastname + BarEmail + phone + BarAvail + BarLiNum + id,
                                c.getBarberFName() + "!" + c.getBarberLName() + "!" + c.getBarberEmail() + "!"
                                        + c.getPhone() + "!" + c.getBarberAvailable() + "!" + c.getBarberLicenseNum()
                                        + "!" + c.getID() + "\n");
                        FileWriter writer = new FileWriter("BarberProfile.txt");
                        writer.write(newContent);
                        reader.close();
                        writer.close();

                    } catch (Exception e) {
                        return;
                    }
                }
            } else if (event.getSource() == resetBtn) {
                String blank = "";
                BarberFNameField.setText(blank);
                BarberLNameField.setText(blank);
                BarberEmailField.setText(blank);
                BarberNumField.setText(blank);
                BarberAvailableField.setText(blank);
                BarberLicenseNumField.setText(blank);
                idField.setText(blank);
                notify.setText(blank);
                searchbar.setText(blank);
                BarberFNameField.setBackground(Color.white);
                BarberLNameField.setBackground(Color.white);
                BarberEmailField.setBackground(Color.white);
                BarberNumField.setBackground(Color.white);
                BarberAvailableField.setBackground(Color.white);
                BarberLicenseNumField.setBackground(Color.white);
                idField.setBackground(Color.white);
            }
        }

    }

    public static String SearchCustomer(String input) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Customer.txt"));
            String line;
            int i = 0;
            List<String> rdata = new ArrayList<String>();

            Scanner scan = new Scanner(System.in);

            while ((line = reader.readLine()) != null) {

                rdata.add(line);

                String[] dataFound = rdata.get(i).split("!");
                if (input.equals(dataFound[6])) {

                    firstname = dataFound[0];
                    lastname = dataFound[1];
                    BarLiNum = dataFound[5];
                    BarEmail = dataFound[2];
                    phone = dataFound[3];
                    BarAvail = dataFound[4];

                    return ("Customer ID(" + dataFound[6] + ") Found\n----------------------------\n["
                            + dataFound[0] + " " + dataFound[1] +
                            "]\nBarberEmail:\n-" + dataFound[2] +
                            "\nTelephone:\n-" + dataFound[3] +
                            "\nBarberAvailable:\n-" + dataFound[4] +
                            "\nBarberLicenseNum:\n-" + Integer.valueOf(dataFound[5]));

                }
                i = i + 1;
            }
            return ("No customer with this ID was found.");
        } catch (Exception e) {
            return ("No customer with this ID was found.");
        }
    }

    public boolean validateName(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if ((!Character.isLetter(c) && !(c == '-') && !(c == ' '))) {
                // if the name contains characters aside from letters, "-" or a space, it is
                // invalid
                System.out.println("Invalid Name");
                return false;
            }
        }
        return true;
    }

    public boolean validateBarberEmail(String BarberEmail) {
        int atCount = 0;
        int dotCount = 0;
        char[] chars = BarberEmail.toCharArray();

        if (!Character.isLetter(BarberEmail.charAt(0)) && !Character.isDigit(BarberEmail.charAt(0))) {
            // if the BarberEmail does not begin with a letter or number, it is invalid
            System.out.println("Invalid BarberEmail");
            return false;
        } else {
            for (char c : chars) {
                if ((!Character.isLetter(c) && !(Character.isDigit(c)) && !(c == '@') && !(c == '.'))) {
                    // if the BarberEmail contains characters that are not letters, numbers, '@' or
                    // '.', it is invalid
                    System.out.println("Invalid BarberEmail");
                    return false;
                }
                if (c == '@') {
                    // counting the number of '@' in the BarberEmail
                    atCount = atCount + 1;
                }
                if (c == '.') {
                    // counting the number of '.' in the BarberEmail
                    dotCount = dotCount + 1;
                }
            }
            if ((atCount != 1) || (dotCount < 1)) {
                // if the BarberEmail does not include only 1 '@' and at least 1 '.', it is
                // invalid
                System.out.println("Invalid BarberEmail");
                return false;
            }

            return true;
        }
    }

    public boolean validateBarberAvailable(String BarberAvailable) {
        boolean hasLetter = false;
        boolean hasNum = false;

        char[] chars = BarberAvailable.toCharArray();
        for (char c : chars) {
            if (Character.isLetter(c)) {
                // checks if the BarberAvailable has letters

                hasLetter = true;
            }
            if (Character.isDigit(c)) {
                // checks if the BarberAvailable has numbers
                hasNum = true;
            }
        }
        if ((hasLetter == true) && (hasNum == true)) {
            // if the BarberAvailable does not have both a number and letters, it is invalid
            return true;
        } else {
            System.out.println("Invalid BarberAvailable");
            return false;
        }
    }

    public boolean validateBarberLicenseNum(int BarberLicenseNum) {
        // returns true if the BarberLicenseNum is a valid human BarberLicenseNum
        // between 0 and 130
        if ((BarberLicenseNum >= 0) && (BarberLicenseNum <= 130)) {
            return true;
        } else {
            System.out.println("Invalid BarberLicenseNum");
            return false;
        }
    }

    public boolean validatePhone(String BarberNum) {
        if (BarberNum.length() == 7) {
            BarberNum = "876" + BarberNum;
        }
        if (BarberNum.length() != 10) {
            // a phone number must be 10 digits including its area code to be valid
            System.out.println("Invalid Phone Number");
            return false;
        } else {
            if ((BarberNum.charAt(3) == '0') || (BarberNum.charAt(3) == '1')) {
                // if the number after the area code begins with 0 or 1, it is invalid
                System.out.println("Invalid Phone Number");
                return false;
            } else {
                char[] num = BarberNum.toCharArray();
                for (char n : num) {
                    if (!(Character.isDigit(n))) {
                        // if any character is not a digit, the number is invalid
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean validateID(String id) {
        boolean hasLetter = false;
        boolean hasNum = false;

        char[] chars = id.toCharArray();
        for (char c : chars) {
            // if the id has neither a letter nor number, it is invalid
            if (Character.isLetter(c)) {
                hasLetter = true;
            }
            if (Character.isDigit(c)) {
                hasNum = true;
            }
            if (c == '!') {
                return false;
            }
        }
        if ((hasLetter == true) || (hasNum == true)) {
            return true;
        } else {
            System.out.println("Invalid ID");
            return false;
        }

    }

    public class CloseButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e)// listener for Close button, initiates when button is clicked
        {
            MainMenu.createAndShowGUI();
            container.setVisible(false);
            dispose();
        }

    }
}

// @Override
// public void actionPerformed(ActionEvent e) {
// // TODO Auto-generated method stub

// }