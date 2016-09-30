package crackingthecoding.chap1;

public class ReverseString {

	public static void main(String[] args) {
		String x = "nishant";
		String z="";
		for(int i=x.length()-1;i>=0; i--) {
			z = z+x.charAt(i);
		}
		System.out.println(z);
	}
}
