import java.util.Scanner;

public class l5_C_7 {

   public static int checked(int curr[],int target) {
      for(int i=0; i<curr.length; i++) {
         if(curr[i] == target) {
            return i;
         }
      }
      return -1;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter size");
      int size = sc.nextInt();
      int arr[] = new int[size];
      

      for(int i=0; i<size; i++) {
         System.out.println("enter element");
         arr[i] = sc.nextInt();
      }
      System.out.println("enter prior = ");
      int prior = sc.nextInt();
      int i=0;
      int j =prior;

      int curr[] = new int[size];
      int k = 0;
      while(j<size) {
         if(j>i) {
            curr[k] = arr[j];
            k++;
            j++;
         }
      }
      while(i<prior) {
         curr[k] = arr[i];
         k++;
         i++;
         
      } 
      System.out.println("final array = ");
      for(int p=0; p<size; p++) {
         System.out.println(curr[p]);
      }
      System.out.println("enter target = ");
      int target = sc.nextInt();
      System.out.println("element found at index = "+checked(curr, target));
   }
}
