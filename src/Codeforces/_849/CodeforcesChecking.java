package Codeforces._849;

import java.util.Scanner;

public class CodeforcesChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s = "codeforces";
		while(t-- > 0) {
			int f = 0;
			String ch = sc.next();
			for(int i =0 ;i < 10; i++)
				if(ch.charAt(0) == s.charAt(i)) {
					f=1;
					System.out.println("YES");
					break;
				}
			if(f==0)
				System.out.println("NO");
		}
	}

}
