import java.util.Scanner;

public class l2_A_2{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double heigth = sc.nextDouble();
		double weigth = sc.nextDouble();
		double area = heigth*weigth;
		System.out.println("area of rectangle = "+area);
	}
}