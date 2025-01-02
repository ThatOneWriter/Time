public class Time {


   private int hours;
   private int minutes;
   private int seconds;


   public Time(int hours, int minutes, int seconds) {
       this.hours = hours;
       this.minutes = minutes;
       this.seconds = seconds;


   }


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


   public int add(int t) {
       return 0;
   }
   public String toString() {
       String str = " ";
       if (hours < 10 && minutes < 10 && seconds < 10) {
           str += "0" + hours + ":0" + minutes + ":0" + seconds;
       }
       return str;
   }
}
