import java.util.Scanner;
public class l3_A_5{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number = ");
		int n = sc.nextInt();
		int count =0;
		for(int i=2; i<n/2; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
	}
}