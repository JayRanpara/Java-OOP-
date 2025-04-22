class c1 extends Thread{
  public void run() {
   int n = (int)(1000*Math.random());
   
   System.out.println("genrate number = "+n);
   if(n%2 == 0) {
      C2 clr = new C2(n);
      clr.start();
      clr.getSquare();
   }
   else{
      C3 cls = new C3(n);
      cls.start();
      cls.getCube();
   }
  }
}
class C2 extends Thread{
   int n;
   public C2(int n) {
      this.n = n;
   }
   public void getSquare() {
      System.out.println(n*n);
   }
}
class C3 extends Thread{
   int n;
   public C3(int n) {
      this.n = n;
   }
   public void getCube() {
      System.out.println(n*n*n);
   }
}
public class l11_B_5 {
   public static void main(String args[]) {
      c1 c = new c1();
      c.start();
   }
}