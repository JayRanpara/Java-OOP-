import java.util.Scanner;

public class l2_A_1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number =");
		int a = sc.nextInt();
		System.out.println("enter second number =");
		int b = sc.nextInt();
		System.out.println("enter string = ");
		String perform = sc.next();
		if(perform.equals("addition")) {
			System.out.println(a+b);
		}
		else if(perform.equals("subtration")) {
			System.out.println(a-b);
		}
		else if(perform.equals("multiplication")) {
			System.out.println(a*b);
		}
		else {
			System.out.println(a/b);
		}
	}
}