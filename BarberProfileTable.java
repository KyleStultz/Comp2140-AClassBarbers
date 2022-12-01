import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.io.*;

public class BarberProfileTable extends JFrame {
    private JButton add;
    private JButton edit;
    private JButton delete;
    private JButton close;
    private JPanel display;
    private BarberProfileTable thisForm;
    private ArrayList<BarberProfile> BarberProfile = new ArrayList<BarberProfile>();
    private JScrollPane scrollPane;
    private JTable ctable;
    private DefaultTableModel model;
    File f = new File("BarberProfile.txt");



    public BarberProfileTable() {
        new GridLayout(2, 1);
        setBounds(100, 100, 650, 500);
        BarberProfile = new ArrayList<BarberProfile>();
        display = new JPanel();
        String[] columnNames = { "ID", "Name", "Phone Number", "Email" };
        model = new DefaultTableModel(columnNames, 0);
        ctable = new JTable(model);
        showTable(BarberProfile);
        ctable.setEnabled(false);
        ctable.setPreferredScrollableViewportSize(new Dimension(500, BarberProfile.size() * 15 + 50));
        ctable.setFillsViewportHeight(true);
        scrollPane = new JScrollPane(ctable);

        add(scrollPane);
        add = new JButton("Add");
        edit = new JButton("Edit");
        delete = new JButton("Delete");
        close = new JButton("Close");

        add.addActionListener(new AddBarberProfileListener());
        delete.addActionListener(new DeleteBarberProfileListener());
        edit.addActionListener(new EditBarberProfileListener());
        close.addActionListener(new CloseButtonListener());

        display.add(add);
        display.add(edit);
        display.add(delete);
        display.add(close);

        add(display);

    }

    public void addBarberProfile(String BarberName, String BarberAvailability, String BarberEmail, int BarberNumber,
            int BarberID) {
        BarberProfile.add(new BarberProfile(BarberName, BarberAvailability, BarberEmail, BarberNumber, BarberID));
    }

    public void addBarber(BarberProfile b) {
        BarberProfile.add(b);
        addToTable(b);
        addToFile(b);
    }

    public void deleteBarber(int cdx) {
        try {
            BarberProfile.remove(cdx);
            f.delete();
            for (BarberProfile b : BarberProfile) {
                addToFile(b);
            }
            model.removeRow(cdx);
        } catch (IndexOutOfBoundsException e) {
        }

    }

    public void editBarber(int cdx, BarberProfile b) {
        BarberProfile.set(cdx, b);
        f.delete();
        for (BarberProfile ba : BarberProfile) {
            addToFile(b);
        }
        model.removeRow(cdx);
        String[] parts = b.toString().split(";");
        String[] item = { String.valueOf(cdx), parts[0], "" + parts[1], "" + parts[2], "" + parts[3] };
        model.insertRow(cdx, item);
    }

    public void removeBarberProfile(int BID) {
        for (int i = 0; i < BarberProfile.size(); i++) {
            if (BarberProfile.get(i).getBarberID() == BID) {
                BarberProfile.remove(i);
            }
        }
    }

    public void updateBarberProfile(int BarberProfileID, String newUsername, String newPhoneNumber, String newEmail,
            int newAge) {
        for (int i = 0; i < BarberProfile.size(); i++) {
            if (BarberProfile.get(i).getBarberID() == BarberProfileID) {
                BarberProfile.get(i).updateBarbername(newUsername);
                BarberProfile.get(i).updateCAge(newAge);
                BarberProfile.get(i).updateEmail(newEmail);
                BarberProfile.get(i).updatePhoneNumber(newPhoneNumber);
            }
        }
    }

    private void addToFile(BarberProfile b) {
        String[] parts = b.toString().split(";");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(f, true));
            writer.append(parts[0]);
            writer.append(' ');
            writer.append(parts[1]);
            writer.append(' ');
            writer.append(parts[2]);
            writer.append(' ');
            writer.append(parts[3]);
            writer.append("\n");
            writer.close();
        } catch (IOException e) {

        }

    }

    private void showTable(ArrayList<BarberProfile> BarberProfile) {
        for (BarberProfile b : BarberProfile) {
            addToTable(b);
        }

    }

    private void addToTable(BarberProfile b) {
        String[] parts = b.toString().split(";");
        String[] item = { parts[0], parts[1], "" + parts[2], "" + parts[3] };
        model.addRow(item);
    }

    private class AddBarberProfileListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            EditBarberProfile addcl = new EditBarberProfile(thisForm);
            System.out.println(addcl);
        }
    }

    private class DeleteBarberProfileListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            DeleteBarberProfile delcl = new DeleteBarberProfile(thisForm, BarberProfile);
            System.out.println(delcl);
        }
    }

    private class EditBarberProfileListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            EditBarberProfile edcl = new EditBarberProfile(thisForm, BarberProfile);
            System.out.println(edcl);
        }
    }

    private class CloseButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

    }

}
