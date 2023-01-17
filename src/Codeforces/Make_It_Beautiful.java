package Codeforces;

import java.util.*;

public class Make_It_Beautiful {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++)
				arr[i] = sc.nextInt();
			boolean b = check(arr);
			if(b== true) {
				System.out.println("Yes");
				for(int i=0; i<n; i++)
					System.out.print(arr[i] +" ");
			}
			else
				System.out.println("No");
		}
	}
	public static boolean check(int[] arr) {
		boolean b = false;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[0]) {
				b = true;
				break;
			}
		}
		if(b == false)
			return false;
		Arrays.sort(arr);
		reverse(arr);
		int k = 1;
		while(arr[k] != arr[0])
			k++;
		int temp = arr[1];
		arr[1] = arr[k];
		arr[k] = temp;
		return true;
	}
	public static void reverse(int[] arr)
    {
		int lo = 0; 
		int hi = arr.length - 1;
		while(lo<=hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
		}
    }
}
