package Codeforces;

import java.util.*;
import java.util.Scanner;

public class DoremyPaint {

	public static void main(String[] args) {
		String word1 = "abcc", word2 = "aab";
		isItPossible(word1, word2);
	   }
	   public static boolean isItPossible(String word1, String word2) {
	        Map<Character, Integer> map1 = new HashMap<>();
	        Map<Character, Integer> map2 = new HashMap<>();
	        for(int i=0; i<word1.length();i++) {
	        	if(!map1.containsKey(word1.charAt(i))) {
	        		map1.put(word1.charAt(i), 1);
	        	}
	        	else
	        		map1.replace(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
	        }
	        for(int i=0; i<word2.length();i++) {
	        	if(!map2.containsKey(word2.charAt(i))) {
	        		map2.put(word2.charAt(i), 1);
	        	}
	        	else
	        		map2.replace(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
	        }
	        System.out.println(map1+"\n"+ map2);
	        
	        return true;	
	    }

}
