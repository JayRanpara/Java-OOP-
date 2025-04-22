interface Transport{
   public void deliver();
}
abstract class Animal{
   abstract public void display();
}
class Tiger extends Animal{
   public void display() {
      System.out.println("tiger called");
   }
}
class Camel extends Animal implements Transport{
   public void deliver() {
      System.out.println("by Camel");
   }
   public void display() {
      System.out.println("camel called");
   }
}
class Deer extends Animal{
   public void display() {
      System.out.println("Dear called");
   }
}
class Donkey extends Animal implements Transport{
   public void deliver() {
      System.out.println("by donkey");
   }
   public void display() {
      System.out.println("Donkey called");
   }
}


public class l8_A_3 {
   public static void main(String args[])  {
      Animal a[] = new Animal[4];
      a[0]  = new Tiger();
      a[1] = new Camel();
      a[2] = new Deer();
      a[3] = new Donkey();

      for(int i=0; i<a.length; i++) {
         a[i].display();
         if(i==1||i==3) {
            ((Transport)a[i]).deliver();
         }
      }
   }
}
