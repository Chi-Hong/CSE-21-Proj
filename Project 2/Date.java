public class Date {

   private int year, month, day;

   public Date (int y, int m, int d){
       this.year = y;
       this.month = m;
       this.day = d;

   }

   public int compare (Date dt) {
       int difference;
       difference = ((dt.dayOfYear()+(365*dt.year))-(this.dayOfYear()+(365*this.year)))/30;
       if(difference > 60)
           return 60;
       else
           return difference;
   }

   public int year() {
       return year;
   }

   public int month() {
       return month;
   }

   public int day() {
       return day;
   }

   public int dayOfYear() {
       int totalDays = 0;
       switch (month) {
       case 12: totalDays += 30;
       case 11: totalDays += 31;
       case 10: totalDays += 30;
       case 9 : totalDays += 31;
       case 8 : totalDays += 31;
       case 7 : totalDays += 30;
       case 6 : totalDays += 31;
       case 5 : totalDays += 30;
       case 4 : totalDays += 31;
       case 3 : totalDays += 28;
       case 2 : totalDays += 31;
       }
       totalDays += day;
       return totalDays;

   }

}