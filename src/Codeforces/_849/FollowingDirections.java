package Codeforces._849;

import java.util.Scanner;

public class FollowingDirections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int f=0;
			int x = 0, y = 0;
			int n = sc.nextInt();
			String s = sc.next();
			for(int i=0; i<n; i++) {
				if(s.charAt(i) == 'L') x-=1;
				else if(s.charAt(i) == 'R') x+=1;
				else if(s.charAt(i) == 'D') y-=1;
				else if(s.charAt(i) == 'U') y+=1;
				if(x==1 && y==1) {
					f=1;
					break;
				}
			}
			if(f==0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}

}
