import java.util.Scanner;

// public class l2_A_3{
// 	public static void main(String args[]) {
// 		System.out.println("enter fahrenheit = ");
// 		Scanner sc = new Scanner(System.in);
// 		double f = sc.nextDouble();
// 		double c = ((f-32)*5)/9;
// 		System.out.println("celsius ="+c);
// 	}
// }

public class l2_A_3{
	public static void main(String args[]) {
		System.out.println("enter celsius = ");
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		double f = 9*c/5+32;
		System.out.println("fahrenheit = "+f);
	}
}