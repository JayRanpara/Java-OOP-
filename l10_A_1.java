import java.util.Scanner;

// class Exp{
//    int a;
//    int b;

//    Exp(int a, int b) {
//       this.a = a;
//       this.b = b;
//    }
// }

public class l10_A_1 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no.of student = ");
      int n = sc.nextInt();


      int arr[] = new int[5];

      int sum = 0;
   try{
      for(int i=0; i<n; i++) {
         System.out.println("enter marks of "+(i+1));
         arr[i] = sc.nextInt();
         sum+=arr[i];
      }
     int avg = sum/n;
   }  
   catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("index out of bound");
   }
   catch(ArithmeticException e) {
      System.out.println("can't divided by 0");
   }

   }
}
