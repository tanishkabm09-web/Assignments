package basics.questions;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime {
    public static void main(String [] args){
        LocalDate date = LocalDate.now();
        System.out.println("Date: " + date);
        LocalTime time = LocalTime.now();
        System.out.println("Time: " + time);
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("Date & Time:" + datetime);
        /* Display the day of the month
        Display the day of year
        Display the Week name, Month Name, Month Number
        E - Name of the day : (Mon-Sun)
        D - Day of the year(1-366)(Including leap year)
        dd - Day of the month(1-31)
        M - month number(1-12)
        MMM - Month name- Jan - Dec
      */
        DateTimeFormatter format = DateTimeFormatter.ofPattern("D, MMM dd yyyy");
        String formattedDateTime = datetime.format(format);
        System.out.println("formatted Date: " + formattedDateTime);

    }
}
