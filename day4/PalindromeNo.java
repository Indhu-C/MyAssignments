package week1.day4;

public class PalindromeNo {

	public static void main(String[] args) {
		int input=12321;
		
		int ip =input;
		int temp=0;
		int op=0;
		
		while(ip!=0) {
			temp=ip%10;
			op=temp+op*10;
			ip=ip/10;
			}
		
		if(input==op)
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
		}
	}
