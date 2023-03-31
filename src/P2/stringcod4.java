package P2;

import java.util.Scanner;

public class stringcod4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string-1:");
		String Str1=sc.next();
		System.out.println("enter the string-2:");
		String Str2=sc.next();
		if(Str1.equalsIgnoreCase(Str2)==true) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
	}

}
