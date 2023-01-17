package Codeforces;

import java.security.KeyStore.Entry;
import java.util.*;

public class Koxia_and_whiteboards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[m];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			for(int i=0; i<m; i++)
				b[i] = sc.nextInt();
			Arrays.sort(b);
			Arrays.sort(a);
			if(n<m) {
				int j= m-1;
				for(int i=0; i<n; i++)
					if(a[i] < b[j])
						a[i] = b[j--];
			}
			
		}
	}
	public int maxPoints(int[][] points) {
		int sp = 0;
        Map<Double, Integer> map = new HashMap<>();
        double slope = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<points.length; i++){
            for(int j = i+1; j<points.length; j++){
            if(points[i][1] == points[j][1]){
                sp++;
                continue;
            }
            double m = (double)(points[j][0] - points[i][0]) / (points[j][1] - points[i][1]);
            if(!map.containsKey(m))
                map.put(m,1);
            else {
                map.replace(m, map.get(m) + 1);
                if(max < map.get(m)) {
                	max = map.get(m);
                	slope = m;
                }
            }
            }
        }
        System.out.println(map + "\n" + slope);
        }
        }
        
    }

}
