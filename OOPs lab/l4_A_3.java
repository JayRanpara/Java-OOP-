import java.util.Scanner;

public class l4_A_3{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array = ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("enter number = ");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<n/2; i++) {
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		for(int i=0; i<n; i++) {
			System.out.print("reverce order = "+arr[i]+" ");
			
		}
	}
}