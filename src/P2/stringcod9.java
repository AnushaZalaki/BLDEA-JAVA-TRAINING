package P2;

public class stringcod9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Rama");
		String s2=new String("rama");
		if(s1.compareToIgnoreCase(s2)==0 || s1.compareToIgnoreCase(s2)==32 || s1.compareToIgnoreCase(s2)==-32) {
			System.out.println("Address are equal");
		}
		else {
			System.out.println("Address are not equal");
		}

	}

}
