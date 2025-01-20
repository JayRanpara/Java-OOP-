import java.util.Scanner;

public class l3_A_1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st number = ");
		int a = sc.nextInt();
		System.out.println("enter 2nd number = ");
		int b = sc.nextInt();
		System.out.println("enter 3rd number = ");
		int c = sc.nextInt();
		System.out.println("enter 4th number = ");
		int d = sc.nextInt();
		System.out.println("enter 5th number = ");
		int e = sc.nextInt();
		int sum = a+b+c+d+e;
		double per = sum/5;
		if(per>=60) {
			System.out.println("first class");
		}
		else if(per>=50&&per<=59) {
			System.out.println("second class");
		}
		else if(per>=40&&per<=49) {
			System.out.println("Third class");
		}
		else {
			System.out.println("fail");
		}
	}
}