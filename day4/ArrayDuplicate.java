package week1.day4;

import java.util.Arrays;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		
		int[] num1={1, 3, 5, 7, 9};
		int[] num2={2, 4, 6, 8, 7};
		
		Arrays.sort(num);
		
		Arrays.sort(num1);
		Arrays.sort(num2);
		
		for (int i = 1; i < num.length; i++) {
			if(num[i-1]==num[i]) {
			System.out.println(num[i]);
			}
		}

		for (int i = 1; i < num1.length; i++) {
			for (int j = 1; j < num2.length; j++) {
			
		
			if(num1[i]==num2[j]) {
			System.out.println(num1[i]);
			}
		
			}

			}
	}
}
