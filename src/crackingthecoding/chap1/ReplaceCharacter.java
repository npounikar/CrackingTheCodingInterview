package crackingthecoding.chap1;

public class ReplaceCharacter {

	public static void main(String[] args) {

		String x = "My name is Nishant";
		String str = "";
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)==' ')
				str = str+"%20";
			else
				str = str+x.charAt(i)+"";
		}
		System.out.println(str);
	}

}
