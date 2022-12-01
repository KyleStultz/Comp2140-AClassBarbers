/* The Barber Profile should allow the barbers the have the ability to create a new barber profile.
 * 
 * @author - Kyle Stultz
 * 
 */

import java.awt.*;
import java.util.*;
import java.util.Scanner;

public class BarberProfile {

    private String BarberFName, BarberLName, BarberNum, id;
    private char BarberEmail, BarberAvailable, BarberLicenseNum;
    private Scanner scanner = new Scanner(System.in);

    public BarberProfile(String empty) {
        this.id = empty;
    }

    public BarberProfile(String BarberFName, String BarberLName, char BarberEmail, String BarberNum, char BarberAvailable,
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

    public void setBarberFName(String BarberFName) {
        this.BarberFName = BarberFName;
    }

    public String getBarberLName() {
        return this.BarberLName;
    }

    public void setBarberLName(String BarberLName) {
        this.BarberLName = BarberLName;
    }

    public char getBarberEmail() {
        return this.BarberEmail;
    }

    public void setBarberEmail(char email) {
        this.BarberEmail = BarberEmail;
    }

    public String getBarberNum() {
        return this.BarberNum;
    }

    public void setBarberNum(String BarberNum) {
        this.BarberNum = BarberNum;
    }

    public char getBarberAvailable() {
        return this.BarberAvailable;
    }

    public void setBarberAvailable(char BarberAvailable) {
        this.BarberAvailable = BarberAvailable;
    }

    public String getId() {
        return this.id;
    }

    public char getBarberLicenseNum() {
        return this.BarberLicenseNum;
    }

}