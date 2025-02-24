import java.util.Scanner;

class Bank_Account{
   int accountNo;
   String userName;
   String email;
   String accountType;
   int accountBalance;
   public void getAccountDetail() {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter your accountnumber =");
      this.accountNo = sc.nextInt();
      System.out.println("enter Username =");
      this.userName = sc.next();
      System.out.println("enter Your email =");
      this.email = sc.next();
      System.out.println("enter your accounttype =");
      this.accountType = sc.next();
      System.out.println("enter your accountBalance =");
      this.accountBalance = sc.nextInt();
   }
   public void displayAccountDetail() {
      System.out.println("***************************");
      System.out.println("account detail =");
      System.out.println(this.accountNo);
      System.out.println(this.userName);
      System.out.println(this.email);
      System.out.println(this.accountType);
      System.out.println(this.accountBalance);
      System.out.println("***************************");
   }
}

public class l6_A_4{
   public static void main(String args[]) {
      Bank_Account b1 = new Bank_Account();
      b1.getAccountDetail();
      b1.displayAccountDetail();
   }
}