package Codeforces._849;

import java.util.Scanner;

public class PrependandAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0) {
			int hi = sc.nextInt();
			String s = sc.next();
			while(s.length() > 0) {
				if(s.charAt(0) == s.charAt(s.length()-1)) {
					break;
				}
				s = s.substring(1,s.length()-1);
			}
			System.out.println(s.length());		
		}
	}
}
