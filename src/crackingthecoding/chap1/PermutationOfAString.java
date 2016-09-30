package crackingthecoding.chap1;

public class PermutationOfAString {

	public static void main(String[] args) {

		// case sensitive
		// include white spaces
		// By Default : two string can't be permutation of each other if their length is different
		
		System.out.println(isPermutation("abc","cba"));

	}

	private static boolean isPermutation(String string1, String string2) {
		boolean permutation = false;
//		int count1 = 0, count2 = 0, count3=0;
//		if(string1.length()<string2.length()) {
//			for(int i = 0 ; i <string1.length(); i++) {
//				for(int j = 0 ; j <string2.length(); j++) {
//					if(string1.charAt(i)==string2.charAt(j)) {
//						count1++;
//						continue;
//					}
//				}
//			}
//			if(count1 == string1.length()) {
//				System.out.println(string1+" is permutation of "+string2);
//				permutation = true;
//			}
//		} else if (string1.length()>string2.length()) {
//			for(int i = 0 ; i <string2.length(); i++) {
//				for(int j = 0 ; j <string1.length(); j++) {
//					if(string2.charAt(i)==string1.charAt(j)) {
//						count2++;
//						continue;
//					}
//				}
//			}
//			if(count2 == string2.length()) {
//				System.out.println(string2+" is permutation of "+string1);
//				permutation = true;
//			}
//		} else  {
		int count3 = 0;
			for(int i = 0 ; i <string2.length(); i++) {
				for(int j = 0 ; j <string1.length(); j++) {
					if(string2.charAt(i)==string1.charAt(j))
						count3++;
				}
			}
			if(count3 == string1.length()&&count3 == string2.length()) {
				System.out.println(string1+" is permutation of "+string2);
				permutation = true;
			}
//		}
		System.out.println(String.valueOf(42).length());
		return permutation;
	}

}
