import java.util.Scanner;

public class l4_B_1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String = ");
		String str = sc.nextLine();
		int n = str.length();
		for(int i=n/2; i<n; i++) {
			System.out.print(str.charAt(i));
		}
	}
}