abstract class Vegetable{
   String color;

   Vegetable(String color) {
      this.color = color;
   }

   public abstract String toString();
}
class Potato extends Vegetable{
  
   Potato(String color) {
      super(color);
   }

   public String toString() { 
      return super.color;
   }
}
class Brinjal extends Vegetable{
  
   Brinjal(String color) {
      super(color);
   }
   public String toString() { 
      return super.color;
   }
}
class Tomato extends Vegetable{
  
   Tomato(String color) {
      super(color);
   }

   public String toString() { 
      return super.color;
   }
}

public class l8_A_1{
   public static void main(String args[]) {
      Potato p= new Potato("brown");
      Brinjal b = new Brinjal("violet");
      Tomato t  = new Tomato("red") ;

      System.out.println("Potato color = "+p);
      System.out.println("Potato color = "+b);
      System.out.println("Potato color = "+t);
   }
}
