import java.util.Scanner;

public class l3_A_4{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number = ");
		int a = sc.nextInt();
		System.out.println("Enter Number = ");
		int b = sc.nextInt();
		System.out.println("Enter Number = ");
		int c = sc.nextInt();
		int d = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println("largest number = "+ d);
	}
}