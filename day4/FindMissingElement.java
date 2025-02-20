package week1.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int[] ip= {1,4,3,2,8,6,7};
		int l=ip.length;
		//int op;
		Arrays.sort(ip);
		
		//Method 1
		for(int i=1;i<l;i++) {
			if(ip[i]-ip[i-1]>1)
				System.out.println("Method1 --->Missing number is "+(ip[i]-1));
		}
		//Method 2
		for(int i=0;i<l;i++) {
			if(ip[i]!=i+1) {
				System.out.println("Method2 --->Missing number is "+(i+1));
			break;
			}
		}
		
	}

}
