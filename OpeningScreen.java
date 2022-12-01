import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.io.File;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
// import java.awt.Insets;
// import java.awt.BorderLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class OpeningScreen extends JFrame {

    private static final long serialVersionUID = 1L;
    private JButton registerbutton;
    private JButton loginbutton;
    private JButton exitbutton;
    private JPanel pnlCover;
    private JPanel pnlButtons;

    private JFrame frame;

    // private JLabel imageLabel;
    private int top = 1, left = 1, bottom = 1, right = 1;
    // private TheMainMenu thisMainU;
    // private EntryScreen enter;

    public OpeningScreen() {

        setTitle("A CLASS BARBERS");
        /// defining the layout initially
        setLayout(new GridLayout(2, 1));
        setSize(1000, 1000);

        // creating panels and their colours
        GridBagConstraints gbc = new GridBagConstraints();

        /// top half
        pnlCover = new JPanel();

        pnlCover.setBackground(Color.blue);

        JLabel title = new JLabel("", JLabel.SOUTH_EAST);
        pnlCover.add(title, BorderLayout.NORTH);

        ImageIcon logo = new ImageIcon("images/logo.png");
        JLabel label = new JLabel("", logo, JLabel.NORTH_EAST);
        pnlCover.add(label, BorderLayout.NORTH);
        pnlCover.setBorder(new EmptyBorder(new Insets(20, 100, 0, 100)));

        /// bottom half
        pnlButtons = new JPanel();
        pnlButtons.setLayout(new GridBagLayout());
        pnlButtons.setBackground(Color.white);
        pnlButtons.setBorder(new EmptyBorder(new Insets(10, 100, 10, 100))); // Move around buttons ///[t l b r] border?

        // Create Buttons
        gbc.weighty = 0.25; /// button spacing
        gbc.gridx = 0; /// sets button positions
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(2, 20, 2, 20);/// padding or gaps
        Icon registericon = new ImageIcon("images/profilepic.png");
        registerbutton = new JButton("  Register User", registericon);
        registerbutton.setSize(new Dimension(340, 100));
        registerbutton.addActionListener(new RegisterButtonListener());

        registerbutton.setFont(new Font("Arial", Font.BOLD, 32));/// set button font
        registerbutton.setBackground(Color.white);/// set button bg colour
        registerbutton.setForeground(Color.black);/// set button text colour
        pnlButtons.add(registerbutton, gbc);
        gbc.insets = new Insets(2, 20, 2, 20);/// padding or gaps

        gbc.weighty = 0.25; /// button spacing
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        Icon loginicon = new ImageIcon("images/profilepic.png");
        loginbutton = new JButton(" Login", loginicon);
        loginbutton.addActionListener(new LoginButtonListener());
        // loginbutton.setSize(new Dimension(340, 100));

        loginbutton.setFont(new Font("Arial", Font.BOLD, 32));/// set button font
        loginbutton.setBackground(Color.white);/// set button bg colour
        loginbutton.setForeground(Color.black);/// set button text colour
        pnlButtons.add(loginbutton, gbc);

        gbc.weighty = 1;
        // gbc.insets = new Insets(top, left, bottom, right);
        gbc.insets = new Insets(10, left, 40, right);/// padding or gaps

        gbc.gridx = 0; /// determines the horizontal position of exit button
        gbc.gridy = 2; /// determines the vertical position of exit button
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        Icon exiticon = new ImageIcon("images/exit.png");
        exitbutton = new JButton("  Close Program", exiticon);
        exitbutton.addActionListener(new ExitButtonListener());

        exitbutton.setPreferredSize(new Dimension(400, 100)); /// set button size dimensions
        exitbutton.setFont(new Font("Arial", Font.BOLD, 32));/// set button font
        exitbutton.setBackground(Color.blue);/// set button bg colour
        exitbutton.setForeground(Color.white);/// set button text colour
        pnlButtons.add(exitbutton, gbc);

        // frames
        add(pnlCover);
        add(pnlButtons);
        // add(frame);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        pack();
        setResizable(true);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setMenuOff() {
        this.dispose();
    }

    // opens registration and login
    private class RegisterButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new AddClientAccount();
            setVisible(true);
        }
    }

    private class LoginButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new LoginForm();
            setSize(300, 100);
            setVisible(true);
        }
    }

    private class ExitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new OpeningScreen();

    }
}