/**
 * The Time class represents the time in a 24-digital hour clock setting in military time.
 * Time contains a set amount of hours, minutes, and seconds.
 */
public class Time {


   private int hours;
   private int minutes;
   private int seconds;

 /**
     * Constructor for the Time class. This creates an instance of the time given the
     * parameters mentioned below.
     *
     * @param hours represents the exact hour the time is set at.
     * @param minutes represents the exact minute the time is set at.
     * @param seconds represents the the exact second the time is set at.
     *
     */
   public Time(int hours, int minutes, int seconds) {
       this.hours = hours;
       this.minutes = minutes;
       this.seconds = seconds;


   }

   /**
     * The tick method for the Time class
     * This method adds 1 second each time it is called, and properly adjusts the time if the amount of seconds/minutes is > 60 and if hours > 23
     */
   public void tick() {
       seconds++;
       if (seconds >= 59) {
           minutes++;
           seconds = 0;
       }
       if (minutes >= 59) {
           minutes = 0;
           hours++;
       }
       if (hours > 23) {
           hours = 0;
       }
   }

     /**
     * the add method for the Time class.
     * This method will return an int displaying the sum of the two times.
     *
     * @return returns the sum.
     *
     */
   public int add(int t) {
       seconds += t;
      if (seconds >= 60){
         minutes += seconds/60;
         seconds %= 60; 
      }
      minutes += t/60;
      hours += (t/60) / 60;
      hours %= 24;
       return (seconds + minutes * 60 + hours * 3600);
   }

    /**
     * toString method for the Time class. This method will return a String
     * which displays the time in this format: HH:MM:SS.
     *
     * @return returns the appropriate formatted time.
     *
     */
   public String toString() {
       String str = "";
       if (hours < 10) {
           str += "0" + hours;
       } 
       else {
           str += hours;
       }
      
       str += ":";
      
       if (minutes < 10) {
           str += "0" + minutes;
       } 
       else {
           str += minutes;
       }
      
       str += ":";
      
       if (seconds < 10) {
           str += "0" + seconds;
       } 
       else {
           str += seconds;
       }
      
       return str;
   }
}
