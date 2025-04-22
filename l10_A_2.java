class Check extends Exception{
   @Override
   public String toString() {
      return "InSufficientFundException";
   }
}

class Account{
   int balance;

   Account(int balance) {
      this.balance = balance;
   }
   public void withDrawn(int money) throws Check{
      if(this.balance-money <=2000) {
         throw new Check();
      }
   }
   public void deposit(int money) {
      this.balance+=money;
   }
}

public class l10_A_2 {
   public static void main(String[] args) throws Check{
      Account a = new Account(2000);
      a.deposit(2000);
      a.withDrawn(2000);
   }
}