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
       seconds += t;
      if (seconds >= 60){
         minutes += seconds/60;
         seconds %= 60; 
      }
      minutes += t/60;
      hours += (t/60) / 60;
      hours %= 24;
       return t*(seconds + minutes * 60 + hours * 3600);
   }

   
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
