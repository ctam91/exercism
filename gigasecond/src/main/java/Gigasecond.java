import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private static LocalDateTime currentTime;
    private static final long GIGASECONDS = 1000000000L;

    /**
     * Takes in a date and determines the time at midnight (start of the day) and sets        * that as currentTime
     * @param localDate current date
     */
    Gigasecond(LocalDate localDate) {
        this.currentTime = localDate.atStartOfDay();
    }


    /**
     * Takes in a local date time and sets that as currentTime
     * @param localDateTime current datetime
     */
    Gigasecond(LocalDateTime localDateTime) {
        this.currentTime = localDateTime;
    }

    /**
     * Adds a gigasecond to the current time
     * @return the date when someone turns a gigasecond
     */
    LocalDateTime getDate() {
        return currentTime.plusSeconds(GIGASECONDS);
    }

}
