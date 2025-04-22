import java.util.*;

interface Shape{
   public double getArea();
}
class Rectangle implements Shape{
   int l;
   int b;
   Rectangle(int l, int b) {
      this.l = l;
      this.b = b;
   }
   public double getArea() {
      return (double)l*b;
   }
}

class Circle implements Shape{
   int r;
   Circle(int r) {
      this.r = r;
   }
   
   public double getArea() {
      return (double)Math.PI*r*r;
   }
}

class Triangle implements Shape {
   int b;
   int h;

   Triangle(int b, int h) {
      this.h = h;
      this.b = b;
   }
   public double getArea() {
      return 0.5*h*b;
   }
}


public class l9_A_5 {
   public static void main(String args[]) {
      Shape s;
      System.out.println("enter 1 for find Rectangle area , enter 2 for find Circle area, enter 3 for find Triangle area = ");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a == 1) {
         System.out.println("enter l and b = ");
         int l = sc.nextInt();
         int b = sc.nextInt();

         s = new Rectangle(l,b);
      
      }
      else if(a == 2) {
         System.out.println("enter radius = ");
         int r = sc.nextInt();
         s = new Circle(r);
      }
      else {
         System.out.println("enter base and height = ");
         int b = sc.nextInt();
         int h = sc.nextInt();
         s = new Triangle(b,h);
      }
      System.out.println("area = "+s.getArea()
      );

   }
}
