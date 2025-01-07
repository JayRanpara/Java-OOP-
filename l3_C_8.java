import java.util.Scanner;

public class l3_C_8{
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting range = ");
		int a= sc.nextInt();
		System.out.println("Enter ending range = ");
		int b= sc.nextInt();

	    for(int i =a+1; i<b; i++) {
	    	int count = 0;
	    	for(int j = 2; j<i-1; j++) {
	    		if(i%j ==0) {
	    			count++;
	    		}
	    		
	    	}
	    	if(count == 0) {
	    			System.out.println(i+" ");
	    		}
	    }
	}
}