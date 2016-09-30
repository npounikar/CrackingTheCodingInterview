package crackingthecoding.chap1;

public class RotatingSubString {

	public static void main(String[] args) {

		String a = "waterbottle", b="tlewaterbot", x = a;
		int count = 0;
		if(a.length() == b.length()) {
			while(count<a.length()) {
				if(a==b) {
					System.out.println("Substring : Same");
					break;
				}
				else {
					x = rotate(x);
					count++;
					if(x.equals(b)) {
						System.out.println("Rotatetd substring same");
						break;
					}
				}
			}
			if(count == a.length())
				System.out.println("NOT A SUBSTRING");
		} else
			System.out.println("NOT A SUBSTRING : length");
	}

private static String rotate(String a) {
	String x = a.substring(0,a.length()-1);
	String y = a.substring(a.length()-1);
	System.out.println(y+x);
	return y+x;
}

}
