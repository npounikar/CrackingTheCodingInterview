package crackingthecoding.chap1;

import java.util.ArrayList;
import java.util.HashSet;

public class PossibleSubsequence {

	public static void main(String[] args) {
		String str = "abc";
		ArrayList<String> sList = new ArrayList<String>();
		ListCombination(str, sList);
		for(int i =0; i<sList.size(); i++) 
			System.out.println(sList.get(i));

	    

	}


static void ListCombination(String str, ArrayList<String> sList){
	
	if(str != null && str.length()!=0)
		RecCombine("",str, sList);
}

static void RecCombine(String prefix,String rest, ArrayList<String> sList){
	if(rest.length() == 0)
		sList.add(prefix);
	else{
		RecCombine(prefix + rest.charAt(0),rest.substring(1), sList);
		RecCombine(prefix,rest.substring(1), sList);
		
	}
}

}
