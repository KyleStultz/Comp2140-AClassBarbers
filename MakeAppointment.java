/*This should allow the client to book an appointment with the barber.
 * 
 * @author - Cheyenne Gowie
 * 
 */

import utilities.DAO.ContactDAOImpl;
import utilities.DAO.UserDAOImpl;
import utilities.TimeConversion;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/** Appointment model class. Make Appointment for client */
public class Appointment {
    private int appointmentID;
    private String serviceType;
    private String description;
    private boolean availability;
    private String hairType;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private LocalDateTime createDate;
    private String createdBy;
    private LocalDateTime lastUpdate;
    private String lastUpdatedBy;
    private int customerID;
    private int BarberID;
    private int BarberName;
    private Contact contact;
    private User user;

    /**
     * Appointment constructor. Responsible for instancing an object of the
     * Appointment model representation.
     * Holds information for a single appointment.
     * 
     * @param appointmentID String id of appointment
     * @param serviceType   String serviceType of appointment
     * @param description   String description of appointment
     * @param availability  boolean availability of appointment
     * @param hairType      String customer hairType
     * @param startDateTime LocalDateTime startDateTime of appointment
     * @param endDateTime   LocalDateTime endDateTime of appointment
     * @param createDate    LocalDateType of appointment
     * @param createdBy     String documenting how created the appointment
     * @param lastUpdate    LocalDateTime of lastUpdate of appointment
     * @param lastUpdatedBy String of who lastUpdated this appointment
     * @param customerID    Integer customerID
     * @param BarberName    Integer BarberName
     * @param BarberID      Integer BarberID
     */
    public Appointment(int appointmentID, String serviceType, String description, boolean availability, String hairType,
            LocalDateTime startDateTime, LocalDateTime endDateTime, LocalDateTime createDate, String createdBy,
            LocalDateTime lastUpdate, String lastUpdatedBy, int customerID, int BarberID, int BarberName) {
        this.appointmentID = appointmentID;
        this.serviceType = serviceType;
        this.description = description;
        this.availability = availability;
        this.hairType = hairType;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.customerID = customerID;
        this.BarberID = BarberID;
        this.BarberName = BarberName;
    }

    /**
     * getAppointmentID. Returns appointmentID integer
     * 
     * @return integer appointmentID
     */
    public int getAppointmentID() {
        return appointmentID;
    }

    /**
     * setAppointmentID. Sets the id of the appointment.
     * 
     * @param appointmentID integer appointmentID.
     */
    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    /**
     * getserviceType.
     * 
     * @return String serviceType of the appointment.
     */
    public String getserviceType() {
        return serviceType;
    }

    /**
     * setserviceType. Sets the serviceType of the appointment.
     * 
     * @param serviceType String serviceType.
     */
    public void setserviceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * getDescription.
     * 
     * @return String description of the appointment.
     */
    public String getDescription() {
        return description;
    }

    /**
     * setDescription. Set description of the appointment.
     * 
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getBarberAvailability. Return availabitity of barber.
     * 
     * @return boolean
     */
    public boolean getBarberAvailability() {
        return availability;
    }

    /**
     * setAvailability. Sets availability of appointment.
     * 
     * @param availability String availability
     */
    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    /**
     * getType. Returns hairType of appointment.
     * 
     * @return String hairType
     */
    public String getType() {
        return hairType;
    }

    /**
     * setType. Sets hairType of appointment.
     * 
     * @param hairType String hairType
     */
    public void setType(String hairType) {
        this.hairType = hairType;
    }

    /**
     * getStartDateTime. Get start date and time of appointment.
     * 
     * @return LocalDateTime startDateTime.
     */
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * getStartDateFormatted. Returns formatted string of startDateTime.
     * 
     * @return String startDateTime
     */
    public String getStartDateFormatted() {
        return TimeConversion.formatDate(startDateTime);
    }

    /**
     * getStartTime returns startTime of appointment.
     * 
     * @return LocalTime startTime
     */
    public LocalTime getStartTime() {
        return startDateTime.toLocalTime();
    }

    /**
     * getStartTimeFormatted. Get formatted String representation of start time.
     * 
     * @return String formatted start time.
     */
    public String getStartTimeFormatted() {
        return TimeConversion.formatTime(startDateTime);
    }

    /**
     * setStartDateTime. Sets the startDateTime of the appointment.
     * 
     * @param startDateTime LocalDateTime startDateTime.
     */
    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * getEndDateTime. Returns endDate and time of appointment.
     * 
     * @return LocalDateTime endDateTime.
     */
    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * getEndDate. Returns EndDate of appointment
     * 
     * @return LocalDate EndDate
     */
    public LocalDate getEndDate() {
        return endDateTime.toLocalDate();
    }

    /**
     * getEndTime. Get endTime of appointment.
     * 
     * @return LocalTime endTime.
     */
    public LocalTime getEndTime() {
        return endDateTime.toLocalTime();
    }

    /**
     * getEndTimeFormatted. Returns formatted String of appointment end time.
     * 
     * @return String endDateTime.
     */
    public String getEndTimeFormatted() {
        return TimeConversion.formatTime(endDateTime);
    }

    /**
     * setEndDateTime. Set endDate and time for appointment.
     * 
     * @param endDateTime LocalDateTime endDateTime.
     */
    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * getCreateDate. Returns when appointment was created.
     * 
     * @return LocalDateTime createDate.
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * setCreateDate. Sets createDate of appointment.
     * 
     * @param createDate LocalDateTime createDate.
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * getCreatedBy. Returns appointment's created by string.
     * 
     * @return String createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * setCreatedBy. Sets appointments created by member.
     * 
     * @param createdBy String createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * getLastUpdate. Returns the date and time of the last update to the
     * appointment.
     * 
     * @return LocalDateTime Last Update.
     */
    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    /**
     * setLastUpdate. Sets the date and time of the latest update to the
     * appointment.
     * 
     * @param lastUpdate LocalDateTime lastUpdate
     */
    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * getLastUpdatedBy. Returns the string of the person who last updated/modify
     * the appointment.
     * 
     * @return String lastUpdateBy
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * setLastUpdateBy. Sets the user who last updated/modify the appointment.
     * 
     * @param lastUpdatedBy String lastUpdateBy
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * getCustomerID. Returns the ID of the customer associated with the
     * appointment.
     * 
     * @return int customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * setCustomerID. Sets the ID of the associated customer.
     * 
     * @param customerID Integer.
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * getBarberID. Gets the associated BarberID of the user associated with the
     * appointment.
     * 
     * @return int BarberID
     */
    public int getBarberID() {
        return BarberID;
    }

    /**
     * setBarberID. Sets the BarberID of the user associated with the appointment.
     * 
     * @param BarberID Integer.
     */
    public void setBarberID(int BarberID) {
        this.BarberID = BarberID;
    }

    /**
     * getContactID. Returns the id of the contact associated with the appointment.
     * 
     * @return int BarberName.
     */
    public int getContactID() {
        return BarberName;
    }

    /**
     * setContactID. Sets the id of the contact associated with the appointment.
     * 
     * @param BarberName Integer.
     */
    public void setContactID(int BarberName) {
        this.BarberName = BarberName;
    }

    /**
     * getContact(). Returns contact model object of the contact associated with the
     * appointment.
     * 
     * @return Contact.
     * @throws SQLException throws SQLException if database error occurs.
     */
    public Contact getContact() throws SQLException {
        ContactDAOImpl contactDAO = new ContactDAOImpl();
        this.contact = contactDAO.getContact(getContactID());
        return this.contact;
    }

    /**
     * getContactName. Returns the name of the contact associated with the
     * appointment.
     * 
     * @return String contactName.
     * @throws SQLException throws SQLException if database error occurs.
     */
    public String getContactName() throws SQLException {
        Contact contact = getContact();
        String name = contact.getContactName();
        return name;
    }

    /**
     * getUser. Returns user model object of user associated with the appointment.
     * 
     * @return User.
     * @throws SQLException throws SQLException if database error occurs.
     */
    public User getUser() throws SQLException {
        UserDAOImpl userDAO = new UserDAOImpl();
        this.user = userDAO.getUser(getBarberID());
        return this.user;
    }
}

