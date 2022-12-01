import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.io.*;

public class ClientAccountTable extends JFrame {
    private JButton add;
    private JButton edit;
    private JButton delete;
    private JButton close;
    private JPanel display;
    private ClientAccountTable thisForm;
    private ArrayList<ClientAccount> ClientAccount = new ArrayList<ClientAccount>();
    private JScrollPane scrollPane;
    private JTable ctable;
    private DefaultTableModel model;
    File f = new File("ClientAccount.txt");

    public ClientAccountTable() {
        new GridLayout(2, 1);
        setBounds(100, 100, 650, 500);
        ClientAccount = new ArrayList<ClientAccount>();
        display = new JPanel();
        String[] columnNames = { "ID", "Name", "Age", "Email" };
        model = new DefaultTableModel(columnNames, 0);
        ctable = new JTable(model);
        showTable(ClientAccount);
        ctable.setEnabled(false);
        ctable.setPreferredScrollableViewportSize(new Dimension(500, ClientAccount.size() * 15 + 50));
        ctable.setFillsViewportHeight(true);
        scrollPane = new JScrollPane(ctable);

        add(scrollPane);
        add = new JButton("Add");
        edit = new JButton("Edit");
        delete = new JButton("Delete");
        close = new JButton("Close");

        add.addActionListener(new AddClientAccountListener());
        delete.addActionListener(new DeleteClientAccountListener());
        edit.addActionListener(new EditClientAccountListener());
        close.addActionListener(new CloseButtonListener());

        display.add(add);
        display.add(edit);
        display.add(delete);
        display.add(close);

        add(display);

    }

    public void addClientAccount(String ClientAccountName, String ClientAccountAge, String email, int age,
            int ClientAccountID) {
        ClientAccount
                .add(new ClientAccount(ClientAccountName, ClientAccountAge, email, age, ClientAccountID));
    }

    public void addClient(ClientAccount c) {
        ClientAccount.add(c);
        addToTable(c);
        addToFile(c);
    }

    public void deleteClient(int cdx) {
        try {
            ClientAccount.remove(cdx);
            f.delete();
            for (ClientAccount c : ClientAccount) {
                addToFile(c);
            }
            model.removeRow(cdx);
        } catch (IndexOutOfBoundsException e) {
        }

    }

    public void editClient(int cdx, ClientAccount c) {
        ClientAccount.set(cdx, c);
        f.delete();
        for (ClientAccount ca : ClientAccount) {
            addToFile(ca);
        }
        model.removeRow(cdx);
        String[] parts = c.toString().split(";");
        String[] item = { String.valueOf(cdx), parts[0], "" + parts[1], "" + parts[2], "" + parts[3] };
        model.insertRow(cdx, item);
    }

    public void removeClientAccount(int ClientAccountID) {
        for (int i = 0; i < ClientAccount.size(); i++) {
            if (ClientAccount.get(i).getID() == ClientAccountID) {
                ClientAccount.remove(i);
            }
        }
    }

    public void updateClientAccount(int ClientAccountID, String newUsername, String newPhoneNumber, String newEmail,
            int newAge) {
        for (int i = 0; i < ClientAccount.size(); i++) {
            if (ClientAccount.get(i).getID() == ClientAccountID) {
                ClientAccount.get(i).updateCname(newUsername);
                ClientAccount.get(i).updateCAge(newAge);
                ClientAccount.get(i).updateEmail(newEmail);
                ClientAccount.get(i).updatePhoneNumber(newPhoneNumber);
            }
        }
    }

    private void addToFile(ClientAccount c) {
        String[] parts = c.toString().split(";");

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

    private void showTable(ArrayList<ClientAccount> ClientAccount) {
        for (ClientAccount c : ClientAccount) {
            addToTable(c);
        }

    }

    private void addToTable(ClientAccount c) {
        String[] parts = c.toString().split(";");
        String[] item = { parts[0], parts[1], "" + parts[2], "" + parts[3] };
        model.addRow(item);
    }

    private class AddClientAccountListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            AddClientAccount addcl = new AddClientAccount(thisForm);
            System.out.println(addcl);
        }
    }

    private class DeleteClientAccountListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            DeleteClientAccount delcl = new DeleteClientAccount(thisForm, ClientAccount);
            System.out.println(delcl);
        }
    }

    private class EditClientAccountListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            EditClientAccount edcl = new EditClientAccount(thisForm, ClientAccount);
            System.out.println(edcl);
        }
    }

    private class CloseButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

    }

}
