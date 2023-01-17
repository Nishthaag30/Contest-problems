package codechef;

import java.util.*;

public class Arrays_halves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int size=2*n;
		    int arr[]=new int[size];
		    for(int i=0;i<size;i++){
		        arr[i]=sc.nextInt();
		    }
		    ArrayList<Integer> dif1=new ArrayList<Integer>();
		    ArrayList<Integer> dif2=new ArrayList<Integer>();
		    
		    for(int i=0;i<size;i++){
		        if(arr[i]>size/2 && i<size/2){
		            dif1.add(i+1);
		        }
		        if(arr[i]<=size/2 && i>=size/2){
		            dif2.add(i+1);
		        }
		        
		    }
		    int ops=0;
		        for(int j=0;j<dif1.size();j++){
		            ops+= Math.abs(dif1.get(j)-dif2.get(j));
		        }
		    
		    System.out.println(ops);
		}
	}

}
