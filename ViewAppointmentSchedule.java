import java.util.*;
import java.io.*;
import java.sql.Timestamp;

import javax.swing.*;
import java.awt.*;
 




        public class ViewAppointmentSchedule {
            private String clientusername, barber, ethnicity,hairstyle;
            private int appointmentnumber,age;
            private char apppointmenttime;
            private Timestamp appointmentdate;

            
            
            public ViewAppointmentSchedule(String clientusername, String barber , String ethnicity, String hairstyle, int appointmentnumber, int age,
             char apppointmenttime,Timestamp appointmentdate)
             {
                this.clientusername = clientusername;
                this.barber  = barber ;
                this.ethnicity = ethnicity;
                this.hairstyle = hairstyle ;
                this.appointmentnumber = appointmentnumber;
                this.age = age;
                this.apppointmenttime = apppointmenttime;
                this.appointmentdate = appointmentdate;
             }

             public String getClientusename() {
                return this.clientusername;
            }
             public String getBarbeString() {
                return this.barber;
            }
             public String getEthnicity() {
                return this.ethnicity;
            }
             public String getHairstyle() {
                return this.hairstyle;
            }
             public int getAppointmentnumbe() {
                return this.appointmentnumber;
            }
            public int getAge() {
                return this.age;
            }
            public Char getAppointmenttime() {
                return this.apppointmenttime;
            }
            public Timestamp getAppointmentdate() {
                return this.appointmentdate;
            }

        }