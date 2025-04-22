interface A1 extends A{
   int a = 10;
   public void displayA1();
}
interface A2 extends A{
   int b = 20;
   public void displayA2();
}

interface A{
   int c = 30;
   public void displayA();

}
interface A12 extends A1,A2{
   int d = 40;
   public void displayB();
}
class B implements A12{
   public void displayB() {
      System.out.println("B is called variable is = "+d);
   }
   public void displayA() {
      System.out.println("A is called variable is = "+c);
   }
   public void displayA1() {
      System.out.println("A1 is called variable is = "+a);
   }
   public void displayA2() {
      System.out.println("A2 is called variable is = "+b);
   }
}

public class l8_A_2 {
   public static void main(String args[]) {
      B b1 = new B();
      b1.displayA();
      b1.displayA1();
      b1.displayA2();
      b1.displayB();
   }
}
