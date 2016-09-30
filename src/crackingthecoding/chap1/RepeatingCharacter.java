package crackingthecoding.chap1;

public class RepeatingCharacter {

	public static void main(String[] args) {
		String x = "aaabbbbbbbbbbc", str ="";
		int count = 1;
		for(int i = 0; i<x.length()-1; i++) {
			if(x.charAt(i)==x.charAt(i+1)) {
				count++;
			} else {
				str = str+x.charAt(i) + (count+"");
				count = 1;
			}
			
		}
		str = str+x.charAt(x.length()-1) + (count+"");
		System.out.println(str);
	}

}
