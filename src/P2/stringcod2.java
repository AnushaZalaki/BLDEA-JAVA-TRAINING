package P2;

public class stringcod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String Str ="RajaRamMohanRoy";
	System.out.println(Str.length());
	System.out.println(Str.toUpperCase());
	System.out.println(Str.toLowerCase());
	System.out.println(Str.charAt(1));
// System.out.println(Str.charAt(120));
	int a=10+Str.charAt(1);
	System.out.println(a);
	System.out.println(Str.indexOf('R'));
	System.out.println(Str.indexOf('Z'));
	System.out.println(Str.startsWith("Raja"));
	System.out.println(Str.startsWith("Roja"));
	System.out.println(Str.endsWith("Roy"));
	System.out.println(Str.endsWith("Boy"));
	System.out.println(Str.contains("Mohan"));
	System.out.println(Str.contains("Rohan"));
	System.out.println(Str.contains("mohan"));

}
}
