package crackingthecoding.chap1;

import java.util.HashSet;

public class UniqueCharactersInString {
	
	public static void main(String[] args) {
		boolean contains = false;
		boolean containsA = false;
		String x = "abcxdfgre";
		HashSet<Character> set = new HashSet<Character>();
		for(int i = 0; i<x.length(); i++) {
			if(set.contains(x.charAt(i))) {
				contains = true;
				break;
			} else 
				set.add(x.charAt(i));
		}
		System.out.println(contains);
		System.out.println("=================================================");
		for(int i = 0; i<x.length() && !containsA; i++) {
			for(int j = 0; j<x.length() && !containsA; j++) {
				
				if(x.charAt(i)==x.charAt(j) && i!=j) {
					containsA = true;
					break;
				}
			}
		}
		System.out.println(containsA);
	}

}
