import java.util.Scanner;

public class l3_B_7{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number = ");
		int n= sc.nextInt();
		int original = n,rev = 0;
		while(n!=0) {
			int rem = n%10;
			rev = rev*10+rem;
			n/=10;
		}
		if(rev == original) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
	}
}