class DarshanUniException extends Exception{
   @Override
   public String toString() {
      return "This Student is not Darshan University Student because package is below 3000000";
   }
}
class Student{
   int pakage;
   public Student(int pakage) throws DarshanUniException{
      this.pakage = pakage;
      if(pakage<3000000) {
         throw new DarshanUniException();
      }
   }
}
public class l10_A_3 {
   public static void main(String[] args) throws DarshanUniException{
      Student s = new Student(200000);
   }
}
