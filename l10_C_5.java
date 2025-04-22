class OutOfRange extends Exception{
   @Override
   public String toString() {
      return "exception out of range";
   }
}

class Square{
   public int calculateSquare(int a) throws OutOfRange{
      if(a<10||a>50) {
         throw new OutOfRange();
      }
      return a*a;
   }
}

public class l10_C_5 {
   public static void main(String[] args) throws OutOfRange{
      Square s = new Square();
      System.out.println(s.calculateSquare(70));
   }
}
