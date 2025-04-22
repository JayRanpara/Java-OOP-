class MyException1 extends Exception{
   @Override
   public String toString() {
      return "Number Format Exception.";
   }
}
class MyException2 extends Exception{
   @Override
   public String toString() {
      return "can't divide by 0";
   }
}
class Operation{
  
   public double divide(double a, double b) throws MyException1,MyException2{
      
      if(a != (int)a||b != (int)b) {
         throw new MyException1();
      }
      else if(b == 0) {
         throw new MyException2();
      }
      return a/b;
   }
}

public class l10_B_4 {
   public static void main(String[] args) throws MyException1,MyException2{
      Operation o = new Operation();
      try{
         o.divide(4.5,5.4);
         //throw Number Format Exception.
      }
      catch(Exception e) {
         e.printStackTrace();
      }
      try{
         o.divide(5,0);
      }
      catch(Exception e) {
         e.printStackTrace();
      }
   }
}