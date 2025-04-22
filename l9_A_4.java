interface EvenListener{
   void performEvent();
}
interface MouseListener extends EvenListener{
   void mouseClicked();
   void mousePressed();
   void mouseReleased();
   void moveseMoved();
   void mouseDragged();
}
interface KeyListener extends EvenListener{
   void keyPressed();
   void keyReleased();
}
class EventDemo implements MouseListener,KeyListener{
   public void performEvent(){
      System.out.println("called performEvent");
   }
   public void mouseClicked(){
      System.out.println("called mouseClicked");
   }
   public void mousePressed(){
      System.out.println("called mousePressed");
   }
   public void mouseReleased(){
      System.out.println("called mouseReleased");
   }
   public void moveseMoved(){
      System.out.println("called moveseMoved");
   }
   public void mouseDragged(){
      System.out.println("called mouseDragged");
   }
   public void keyPressed(){
      System.out.println("called keyPressed");
   }
   public void keyReleased(){
      System.out.println("called keyReleased");
   }
}

public class l9_A_4 {
   public static void main(String args[]) {
      EventDemo e = new EventDemo();
      e.performEvent();
      e.mouseClicked();
      e.mousePressed();
      e.mouseReleased();
      e.moveseMoved();
      e.mouseDragged();
      e.keyPressed();
      e.keyReleased();
   }
}
