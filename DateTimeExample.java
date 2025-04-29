import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class DateTimeExample {
    public static void main(String[] args) {
        // LocalDate
        LocalDate date = LocalDate.now();
        System.out.println("LocalDate: " + date);

        //  Create a specific date
        LocalDate pastDate = LocalDate.of(1990, 12, 15);
        System.out.println("Past Date: " + pastDate);
       
        //Get date parts
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);

        //Compare dates
        boolean isBefore = pastDate.isBefore(date);
        boolean isAfter = pastDate.isAfter(date);
        System.out.println("Past date is before today? " + isBefore);
        System.out.println("Past date is after today? " + isAfter);

        //Check equality
        boolean isEqual = date.equals(LocalDate.now());
        System.out.println("Is today equal to now()? " + isEqual);
       
       // Add/Subtract time
        LocalDate nextWeek = date.plusWeeks(1);
        LocalDate lastYear = date.minusYears(1);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Last Year: " + lastYear);
        System.out.println("After adding days : "+date.plusDays(4));

       //Period
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 4, 29);

        Period period = Period.between(startDate, endDate);
        System.out.println("PERIOD:");
        System.out.printf("Years: %d, Months: %d, Days: %d%n",
                period.getYears(), period.getMonths(), period.getDays());

        // LocalTime
        LocalTime time = LocalTime.now();
        System.out.println("LocalTime: " + time);

        //Get time parts
            System.out.println("Hour: " + time.getHour());   
            System.out.println("Minute: " + time.getMinute()); 
            System.out.println("Second: " + time.getSecond()); 

        //Duration 
        LocalTime startTime = LocalTime.of(10, 30, 0);
        LocalTime endTime = LocalTime.of(15, 45, 30);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println("DURATION:");
        System.out.printf("Hours: %d, Minutes: %d, Seconds: %d%n",
                duration.toHours(), duration.toMinutesPart(), duration.toSecondsPart());


        // LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + dateTime);

        // ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime: " + zonedDateTime);

        // Time Zones
        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now(zone);
        System.out.println("New York Time: " + nyTime);

//DateTimeFormatter
        LocalDate date2 = LocalDate.of(2025, 5, 10);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date2.format(dateFormatter);
        System.out.println("Formatted LocalDate: " + formattedDate); 


    //Convert given string into date 1st way
      String str = "2021-08-14";
     // Using parse method to convert the string to LocalDate object
      LocalDate date1 = LocalDate.parse(str, DateTimeFormatter.ISO_DATE);
      System.out.println("String to date : "+date1);


      ////Convert given string into date 2nd way
      String string = "30 August, 2021";
     //Creater the DateTimeFormatter matching the input string format
      DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy");
      LocalDate date3 = LocalDate.parse(string, format);
      System.out.println(date3);
        
       
    }

}
