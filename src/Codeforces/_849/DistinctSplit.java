package Codeforces._849;

import java.util.*;

public class DistinctSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			String s = sc.next();
			Map<Character, Integer> s1 = f(s.substring(0,1));
			Map<Character, Integer> s2 = f(s.substring(1));
			int max = s1.size() + s2.size();
			for(int i=1; i<s.length(); i++) {
				if(!s1.containsKey(s.charAt(i)))
					s1.put(s.charAt(i), 1);
				else
					s1.replace(s.charAt(i), s1.get(s.charAt(i)) + 1);
				s2.replace(s.charAt(i), s2.get(s.charAt(i)) - 1);
				if(s2.get(s.charAt(i)) == 0)
					s2.remove(s.charAt(i));
				int c = s1.size() + s2.size();
				max = Math.max(max, c);
				if(max == n)
					break;
			}
			System.out.println(max);
		}
	}
	public static Map<Character, Integer> f(String s) {
		Map<Character, Integer> st = new HashMap<>();
		for(int i=0; i<s.length(); i++)
			if(!st.containsKey(s.charAt(i)))
				st.put(s.charAt(i), 1);
			else
				st.replace(s.charAt(i), st.get(s.charAt(i)) + 1);
		return st;
	}

}
