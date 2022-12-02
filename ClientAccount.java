/*The Client account allows a new user to create an account using the personal information
 * which is entered into a form where they will be saved to the system.
 * 
 * @author - Rashiv Clarke
 */

import java.awt.*;
import java.util.*;
import java.util.Scanner;

public class ClientAccount {

    private String Username,pNum,id;
    private int age;
    private char email, password;
    private Scanner scanner = new Scanner(System.in);

    public ClientAccount(String empty) {
        this.id = empty;
    }

    public ClientAccount(String Username, char password, char email, String phone, int age, String id) {
        this.Username = Username;
        this.password = password;
        this.email = email;
        this.pNum = phone;
        this.age = age;
        this.id = id;
    }

    public ClientAccount(String u, String em, String pn, int a, String i, String p) {
    }

    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public char getPassword() {
        return this.password;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public char getEmail() {
        return this.email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.pNum;
    }

    public void setPhone_number(String pNum) {
        this.pNum = pNum;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return this.id;
    }

}