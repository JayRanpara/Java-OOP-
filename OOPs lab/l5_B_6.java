public class l5_B_6{
	public static void main(String args[]) {
		int n = 3;
		for(int i=0; i<n; i++) {
			for(int j = 0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=n-2; i>=0; i--) {
			for(int j = 0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}