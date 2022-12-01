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

public class AddClientAccount extends JFrame implements ActionListener{
    private Scanner scan = new Scanner(System.in);
    static File file = new File("ClientAccounts.txt");
    String input;

    private Container container;
    private JLabel title;
        
    private JLabel UsernameLabel;
    private JTextField UsernameField;
    private JLabel passwordLabel;
    private JTextField passwordField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel pNumLabel;
    private JTextField pNumField;
    private JLabel addressLabel;
    private JTextField addressField;
    private JLabel ageLabel;
    private JTextField ageField;
    private JLabel idLabel;
    private JTextField idField;
    private JTextField searchbar;
    

    private JButton submitBtn;
    private JButton resetBtn;
    private JButton searchBtn;
    private JButton backBtn;
    private Icon backIcon;
    private JTextArea notify;

    public void RegisterClientAccount(){
        
        setTitle("A CLASS BARBERS");
        setBounds(300, 90, 900, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setBackground(Color.blue);
        container.setLayout(null);

          title = new JLabel("New ClientAccount");
          title.setFont(new Font("Arial", Font.BOLD, 35));
          title.setSize(300, 30);
          title.setLocation(300, 30);
          title.setForeground(Color.red);
          container.add(title);

          UsernameLabel = new JLabel("Username");
          UsernameLabel.setFont(new Font("Arial", Font.BOLD, 20));
          UsernameLabel.setSize(150, 20);
          UsernameLabel.setLocation(100, 100);
          UsernameLabel.setForeground(Color.red);
          container.add(UsernameLabel);
 
          UsernameField = new JTextField();
          UsernameField.setFont(new Font("Arial", Font.PLAIN, 15));
          UsernameField.setBackground(Color.white);
          UsernameField.setSize(190, 20);
          UsernameField.setLocation(250, 100);
          container.add(UsernameField);

          emailLabel = new JLabel("Email");
          emailLabel.setFont(new Font("Arial", Font.BOLD, 20));
          emailLabel.setSize(100, 20);
          emailLabel.setLocation(100, 200);
          emailLabel.setForeground(Color.red);
          container.add(emailLabel);
 
          emailField = new JTextField();
          emailField.setFont(new Font("Arial", Font.PLAIN, 15));
          emailField.setBackground(Color.white);
          emailField.setSize(190, 20);
          emailField.setLocation(250, 200);
          container.add(emailField);

          pNumLabel = new JLabel("Phone #");
          pNumLabel.setFont(new Font("Arial", Font.BOLD, 20));
          pNumLabel.setSize(100, 20);
          pNumLabel.setLocation(100, 250);
          pNumLabel.setForeground(Color.red);
          container.add(pNumLabel);
 
          pNumField = new JTextField();
          pNumField.setFont(new Font("Arial", Font.PLAIN, 15));
          pNumField.setBackground(Color.white);
          pNumField.setSize(190, 20);
          pNumField.setLocation(250, 250);
          container.add(pNumField);
          
          addressLabel = new JLabel("Address");
          addressLabel.setFont(new Font("Arial", Font.BOLD, 20));
          addressLabel.setSize(100, 20);
          addressLabel.setLocation(100, 300);
          addressLabel.setForeground(Color.red);
          container.add(addressLabel);
 
          addressField = new JTextField();
          addressField.setFont(new Font("Arial", Font.PLAIN, 15));
          addressField.setBackground(Color.white);
          addressField.setSize(190, 20);
          addressField.setLocation(250, 300);
          container.add(addressField);

          ageLabel = new JLabel("Age");
          ageLabel.setFont(new Font("Arial", Font.BOLD, 20));
          ageLabel.setSize(100, 25);
          ageLabel.setLocation(100, 350);
          ageLabel.setForeground(Color.red);
          container.add(ageLabel);
 
          ageField = new JTextField(3);
          ageField.setFont(new Font("Arial", Font.PLAIN, 15));
          ageField.setBackground(Color.white);
          ageField.setSize(190, 20);
          ageField.setLocation(250, 350);
          container.add(ageField);

          idLabel = new JLabel("Assign ID");
          idLabel.setFont(new Font("Arial", Font.BOLD, 20));
          idLabel.setSize(100, 25);
          idLabel.setLocation(100, 400);
          idLabel.setForeground(Color.red);
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
          submitBtn.setBackground(Color.red);
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
          
          notify = new JTextArea();
          notify.setFont(new Font("Arial", Font.PLAIN, 20));
          notify.setSize(300, 320);
          notify.setForeground(Color.white);
          notify.setBackground(dblue2);
          notify.setLocation(500, 100);
          notify.setLineWrap(true);
          notify.setEditable(false);
          notify.setBorder(BorderFactory.createLineBorder(Color.red));
          container.add(notify);

          searchBtn = new JButton("Search ID");
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
          backIcon = new ImageIcon("icons/exit.png");
          backBtn= new JButton   ("", backIcon);
          backBtn.addActionListener(new CloseButtonListener());
          backBtn.setSize(100, 70);
          backBtn.setBackground(Color.red);
          backBtn.setLocation(700, 500);
          container.add(backBtn);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        	  
            File file = new File("ClientAccount.txt");

    
            if (event.getSource() == submitBtn){

                String Username = UsernameField.getText();
                String email = emailField.getText();
                String pNum = pNumField.getText();
                String age = ageField.getText();
                String id = idField.getText();
                notify.setText("");

                if(pNum.length() == 7){
                    pNum = "876" + pNum;
                }
                
                if (validateUsername(Username) == false){
                    notify.setText("The submitted username is not valid. Only letters are valiv.");
                    UsernameField.setBackground(Color.red);
                }else if (validateEmail(email) == false){
                    notify.setText("The submitted email is not valid. Please ensure you added the domain.");
                    emailField.setBackground(Color.red);
                }else if (validateEmail(password) == false){
                    notify.setText("The submitted password is not valid.");
                    emailField.setBackground(Color.red);   
                }else if (validatePhoneNumber(pNum) == false){
                    notify.setText("The submitted phone number is not valid. Must be 7 or 10 digits and begin with valid digits.");
                    pNumField.setBackground(Color.red);
                }else if (validateAge(Integer.valueOf(age)) == false){
                    notify.setText("The submitted age name is not valid. Please ensure it is an integer between 0 and 130.");
                    ageField.setBackground(Color.red);
                }else if (validateID(id) == false){
                    notify.setText("The submitted ID name is not valid. Please ensure it includes a letter or a number.");
                    idField.setBackground(Color.red);
                }else{
                    String blank ="";
                    UsernameField.setText(blank);
                    emailField.setText(blank);
                    pNumField.setText(blank);
                    ageField.setText(blank);
                    idField.setText(blank);
    
                    ClientAccount cl = new ClientAccount(Username, password, char, pNum, Integer.valueOf(age), id);
                    System.out.println(cl);
                    
                    try{
                        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
                        writer.write(cl.getUsername()+"!"+"!"+cl.getEmail()+"!"+cl.getPhoneNumber()+"!"+"!"+cl.getAge()+"!"+cl.getID()+"\n");
            
                        writer.close();
                    }catch(Exception e){return;}
                }
            }else if (event.getSource() == resetBtn){
                String blank ="";
                UsernameField.setText(blank);
                passwordField.setText(blank);
                emailField.setText(blank);
                pNumField.setText(blank);
                addressField.setText(blank);
                ageField.setText(blank);
                idField.setText(blank);
                notify.setText(blank);
                searchbar.setText(blank);
                UsernameField.setBackground(Color.white);
                passwordField.setBackground(Color.white);
                emailField.setBackground(Color.white);
                pNumField.setBackground(Color.white);
                addressField.setBackground(Color.white);
                ageField.setBackground(Color.white);
                idField.setBackground(Color.white);
            }else if(event.getSource() == searchBtn) {
              
                String id = searchbar.getText();
        
                if (id.isEmpty()){
                    notify.setText("Please enter the ID you would like to search.");
                }
                
                else {
                  
                    String blank ="";
                    UsernameField.setText(blank);
                    passwordField.setText(blank);
                    emailField.setText(blank);
                    pNumField.setText(blank);
                    addressField.setText(blank);
                    ageField.setText(blank);
                    idField.setText(blank);
                    
                    notify.setText(SearchClientAccount(id));
                  
                }
            }
        
            
        }

        


    public static String SearchClientAccount(String input){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            int i = 0;
            List<String> rdata = new ArrayList<String>();
            
            Scanner scan = new Scanner(System.in);

            while((line = reader.readLine()) != null){
                
                rdata.add(line);
                
                String[] dataFound = rdata.get(i).split("!");
                if(input.equals(dataFound[6])){
                    return ("ClientAccount ID("+dataFound[6]+") Found\n----------------------------\n["
                    +dataFound[0]+" "+dataFound[1]+
                    "]\nEmail:\n-"+dataFound[2]+
                    "\nTelephone:\n-"+dataFound[3]+
                    "\nAddress:\n-"+dataFound[4]+
                    "\nAge:\n-"+Integer.valueOf(dataFound[5]));
                }
                i = i + 1;
            }
            return ("No ClientAccount with this ID was found.");
        }catch(Exception e){return ("No ClientAccount with this ID was found.");}
    }

    public boolean validateUsername(String Username) {
        char[] chars =Username.toCharArray();
        for (char c : chars) {
            if((!Character.isLetter(c) && !(c=='-') && !(c==' '))) {
            //if the name contains characters aside from letters, "-" or a space, it is invalid
                System.out.println("Invalid UserName");
                return false;
            }
        }
        return true;
    }

    public boolean validateEmail(String email) {
        int atCount = 0;
        int dotCount = 0;
        char[] chars = email.toCharArray();

        if (!Character.isLetter(email.charAt(0)) && !Character.isDigit(email.charAt(0))){
        //if the email does not begin with a letter or number, it is invalid
            System.out.println("Invalid Email");
            return false;
        }else{
            for (char c : chars){
                if((!Character.isLetter(c) && !(Character.isDigit(c)) && !(c=='@') && !(c=='.'))) {
                //if the email contains characters that are not letters, numbers, '@' or '.', it is invalid
                    System.out.println("Invalid Email");
                    return false;
                }
                if(c == '@'){
                //counting the number of '@' in the email
                    atCount = atCount + 1;
                }
                if(c == '.'){
                //counting the number of '.' in the email
                    dotCount = dotCount + 1;
                }
            }
            if((atCount != 1) || (dotCount < 1)){
            //if the email does not include only 1 '@' and at least 1 '.', it is invalid
                System.out.println("Invalid Email");
                return false;
            }

            return true;
        }
    }
    
    public boolean validatePassword (char password){
        char[] chars =password.toCharArray;
        for (char c : chars) {
            if((!Character.isLetter(c) && !(c=='-') && !(c==' '))) {
                //if the password contains characters aside from numbers and letters, "-" or a space, it is invalid
                System.out.println("Passowrd invalid");
                return false;
            }
        }
        return true;
    }
    

    public boolean validateAge(int age){
        if((age >= 0) && (age <= 99)){
            return true;
        }else{
            System.out.println("Invalid Age");
            return false;
        }
    }

    public boolean validatePhoneNumber(String pNum) {
        if (pNum.length() == 7){
            pNum = "876"+pNum;
        }
        if (pNum.length() != 10){
            //a phone number must be 10 digits including its area code to be valid
            System.out.println("Invalid Phone Number");
            return false;
        }else{
            if ((pNum.charAt(3) == '0') || (pNum.charAt(3) == '1')){
            //if the number after the area code begins with 0 or 1, it is invalid
                System.out.println("Invalid Phone Number");
                return false;
            }else{
                char[] num = pNum.toCharArray();
                for (char n : num) {
                    if(!(Character.isDigit(n))){
                    //if any character is not a digit, the number is invalid
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
        //if the id has neither a letter nor number, it is invalid
            if(Character.isLetter(c)){
                hasLetter = true;
            }
            if(Character.isDigit(c)){
                hasNum = true;
            }
            if(c == '!'){
                return false;
            }
        }
        if((hasLetter == true) || (hasNum == true)){
            return true;
        }else{
            System.out.println("Invalid ID");
            return false;
        }

        

    }
    public class CloseButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)//listener for Close button, initiates when button is clicked
        {
        	MainMenu.createAndShowGUI();
            container.setVisible(false);
            dispose();
        }

    }




    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     // TODO Auto-generated method stub
        
    // }

}
