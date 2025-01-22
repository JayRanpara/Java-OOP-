import java.util.Scanner;

public class l4_A_2{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array = ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter number = ");
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		double avg = (double)sum/arr.length;
		System.out.println("Avarage of this array = "+avg);
	}
}