package string;

import java.util.Scanner;

public class stringcod5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string-1:");
		String Str1=sc.next();
		Str1=Str1.toLowerCase();
		int vowel=0;
		int cons=0;
		for(int i=0;i<=Str1.length()-1;i++) {
			if(Str1.charAt(i)=='a' || Str1.charAt(i)=='e' || Str1.charAt(i)=='i' || Str1.charAt(i)=='o' 
					|| Str1.charAt(i)=='u') {
				vowel++;
			}
			else {
				cons++;
			}
		}
		System.out.println("vowel count="+vowel);
		System.out.println("consonant count="+cons);

	}

}
