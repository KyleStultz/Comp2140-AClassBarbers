import java.awt.*;
import java.util.*;
import java.util.Scanner;

public class BarberProfile {

    private String BarberFName, BarberLName, id;
    private int BarberNum;
    private char BarberEmail, BarberAvailable, BarberLicenseNum;
    private Scanner scanner = new Scanner(System.in);

    public BarberProfile(String empty) {
        this.id = empty;
    }

    public BarberProfile(String BarberFName, String BarberLName, char BarberEmail, int BarberNum, char BarberAvailable,
            char BarberLicenseNum) {
        this.BarberFName = BarberFName;
        this.BarberLName = BarberLName;
        this.BarberEmail = BarberEmail;
        this.BarberNum = BarberNum;
        this.BarberAvailable = BarberAvailable;
        this.BarberLicenseNum = BarberLicenseNum;
        this.id = id;
    }

    public String getBarberFName() {
        return this.BarberFName;
    }

    public String getBarberLName() {
        return this.BarberLName;
    }

    public chae getBarberEmail() {
        return this.BarberEmail;
    }

    public int getBarberNum() {
        return this.BarberNum;
    }

    public char getBarberAvailable() {
        return this.BarberAvailable;
    }

    public Srting getId() {
        return this.id;
    }

    public char getBarberLicenseNum() {
        return this.BarberLicenseNum;
    }

}