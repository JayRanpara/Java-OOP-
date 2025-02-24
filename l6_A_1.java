class circle{
   double radius;

   void setRad(double radius) {
      this.radius = radius;
   }
   double countArea() {
      return Math.PI*Math.pow(radius,2);
   }
}

public class l6_A_1{
   public static void main(String[] args) {
      circle c1 = new circle();
      c1.setRad(15.6);
      System.out.println(c1.countArea());
   }
}