package string;

public class stringcod8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Rama");
		String s2=new String("rama");
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("Address are equal");
		}
		else {
			System.out.println("Address are not equal");
		}
	}

}
