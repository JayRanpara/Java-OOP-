import java.util.Scanner;

public class l4_A_1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String = ");
		String line = sc.nextLine();
		int count1=0,count2 = 0,space=0,number=0,schar=0;
		for(int i=0; i<line.length(); i++) {
			char c = line.charAt(i);
			if(c=='A'||c=='I'||c=='O'||c=='U'||c=='E'||c=='a'||c=='i'||c=='o'||c=='u'||c=='e'){
				count1++;
			}
			else if(c==' '){
				space++;
			}
			else if(c>='0'&&c<='9') {
				number++;
			}
			else if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
				count2++;
			}
			else {
				schar++;
			}
		}
		System.out.println("vowels = "+count1);
		System.out.println("consonants = "+count2);
		System.out.println(space);
	}
}