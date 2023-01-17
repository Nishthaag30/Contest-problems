package Codeforces;

import java.util.*;
public class Greatest_convex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- > 0) {
			int k = sc.nextInt();
			System.out.println(check(k));
		}
	}
	public static int check(int k) {
		long prev = 1;
		int ans = -1;
		long current = 1;
		for(int i = 2; i<k; i++) {
			current  = i * prev;
			if((current + prev) % k == 0) {
				ans = i;
			}
			prev = current;
		}
		return ans;
	}

}
