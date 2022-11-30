import java.awt.*;
import java.util.*;
import java.util.Scanner;

public class ClientAccount {

    private String Username, id;
    private int age, pNum;
    private char email;
    private Scanner scanner = new Scanner(System.in);

    public ClientAccount(String empty) {
        this.id = empty;
    }

    public ClientAccount(String Username, char email, int phone, int age, String id) {
        this.Username = Username;
        this.email = email;
        this.pNum = phone;
        this.age = age;
        this.id = id;
    }

    public String getUsername() {
        return this.Username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.pNum;
    }

    public int getAge() {
        return this.age;
    }

    public String getID() {
        return this.id;
    }

}