import java.util.Scanner;

class Sentence {
   int vowel1;
   int vowel2;
   int vowel3;
   int vowel4;
   int vowel5;

   public void isVowel() {

      while(true) {
         System.out.println("enter sentence = ");
         Scanner sc = new Scanner(System.in);
         String s1 = sc.nextLine();
         if(s1.equals("quit")) {
            break;
         }
         for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c == 'A' || c == 'a') {
               vowel1++;
            } else if (c == 'O' || c == 'o') {
               vowel2++;
            } else if (c == 'I' || c == 'i') {
               vowel3++;
            } else if (c == 'U' || c == 'u') {
               vowel4++;
            } else if (c == 'E' || c == 'e') {
               vowel5++;
            }
         }
      }
      System.out.println("vowel A = " + vowel1);
      System.out.println("vowel O = " + vowel2);
      System.out.println("vowel I = " + vowel3);
      System.out.println("vowel U = " + vowel4);
      System.out.println("vowel E = " + vowel5);
   }
}
public class l6_B_3 {
   public static void main(String[] args) {
      Sentence s1 = new Sentence();
      s1.isVowel();
   }
}