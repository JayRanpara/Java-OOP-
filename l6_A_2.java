class Time{
   int hour;
   int min;

  public Time(int hour, int min) {
      this.hour = hour;
      this.min = min;
  }

   public void addition(int hour, int min) {
      this.min+=min;
      if(this.min>59) {
         this.hour++;
         this.min-=60;
      }
      this.hour += hour;
   }

   public int gethour() {
      return hour;
   }

   public int getMin() {
      return min;
   }
}

public class l6_A_2 {
   public static void main(String[] args) {
      Time t1 = new Time(2,45);
      t1.addition(3,25);
      System.out.print(t1.gethour()+",");
      System.out.print(t1.getMin());
   }
}
