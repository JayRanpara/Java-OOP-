class Complex{
   int real;
   int imaginary;

   public Complex() {
      this.real=0;
      this.imaginary=0;
   }
   public Complex(int real,int imaginary){
      this.real = real;
      this.imaginary = imaginary;
   }
   public void addition(int real, int imaginary) {
      this.real+=real;
      this.imaginary+=imaginary;
   }
   public void print() {
      System.out.println(this.real+" i"+" + "+this.imaginary);
   }
}  

public class l6_B_5 {
   public static void main(String[] args) {
      Complex c=new Complex();
      Complex c1 = new Complex(7,7);
      c1.addition(5,9);
      c1.print();
      c.print();
   }
}
