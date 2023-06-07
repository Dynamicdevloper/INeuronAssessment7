package in.ineuron;

import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "egg";
        String t = "add";
        
        boolean isIsomorphic = isIsomorphic(s, t);
        System.out.println(isIsomorphic);
	}
	
	public static boolean isIsomorphic(String s, String t) {
		
		if(s.length() != t.length()) return false;
		
		HashMap<Character, Character> sMap=new HashMap<>();
		HashMap<Character, Character> tMap=new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			 char charS = s.charAt(i);
			 char charT = t.charAt(i);
	            
	         if (!sMap.containsKey(charS)) {
	                sMap.put(charS, charT);
	         }
	            
             if (!tMap.containsKey(charT)) {
                tMap.put(charT, charS);
             }
            
             if (sMap.get(charS) != charT || tMap.get(charT) != charS) {
                return false;
             }
		}
		
		return true;
	}

}
