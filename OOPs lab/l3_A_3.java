import java.util.Scanner;

public class l3_A_3{
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number = ");
		int n = sc.nextInt();
		if((n&1) != 0) {
			System.out.println("Odd Number");
		}
		else {
			System.out.println("Even Number");
		}
	}
}