class MyThread implements Runnable{
   @Override
   public void run() {
      for(int i=0; i<5; i++) {
         
         try{
            Thread.sleep(1000);
            System.out.println("Good Morning");
         }
         catch(Exception e) {
            System.out.println("stop");
         }
      }
      
   }
}
class MyThread2 implements Runnable{
   @Override
   public void run() {
      for(int i=0; i<5; i++) {
         
         try{
            Thread.sleep(3000);
            System.out.println("Good Afternoon");
         }
         catch(Exception e) {
            System.out.println("stop");
         }
      }
      
   }
}

public class l11_A_2 {
   public static void main(String[] args) {
      MyThread my = new MyThread();
      Thread t = new Thread(my);
      t.start();
      MyThread2 my1 = new MyThread2();
      Thread t1 = new Thread(my1);
      t1.start();
   }
}