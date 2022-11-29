/*
 * This will help to reduce no-shows by the customers and will help to keep the barbers aware of their next appointments
 *  so that they can make necessary preparations for that customer in advance. 
 * 
 * @author: Darrell Morgan
 * 
 */

include javax.swing.Timer;


public class AutomatedReminder {
    Intent myIntent = new Intent(this , NotifyService.class);     
    AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
    PendingIntent pendingIntent = PendingIntent.getService(this, 0, myIntent, 0);
    
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.HOUR, 0);
    calendar.set(Calendar.AM_PM, Calendar.AM);
    calendar.add(Calendar.DAY_OF_MONTH, 1);
    
    alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
}


public void onCreate() {
    NotificationManager mNM = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
    Notification notification = new Notification(R.drawable.notification_icon, "Notify Alarm start", System.currentTimeMillis());
    Intent myIntent = new Intent(this , MyActivity.class);     
    PendingIntent contentIntent = PendingIntent.getActivity(this, 0, intent, 0);
    notification.setLatestEventInfo(this, "Notify label", "Notify text", contentIntent);
    mNM.notify(NOTIFICATION, notification);
}