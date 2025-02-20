package week1.day4;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String[] args) {
		String text1 = "stops", text2 = "potss";
		
		char[] charArr1=text1.toCharArray();
		char[] charArr2=text2.toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		int l1=text1.length();
		int l2=text2.length();
		if(l1 != l2) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		else {
			
			for(int i=0;i<l1;i++) {
			if(charArr1[i]!= charArr2[i]) {
				System.out.println("The given strings are not an Anagram.");
			}
			continue;
			}
			System.out.println("The given strings are an Anagram.");
			
		}
	}

}
