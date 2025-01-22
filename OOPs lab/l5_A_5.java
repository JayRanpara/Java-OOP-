import java.util.Scanner;

public class l5_A_5{
	public static void main(String args[]) {
		String str = "stream";
		for(int i=0; i<str.length(); i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}