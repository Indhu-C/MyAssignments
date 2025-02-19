package week1.day3;

public class IsPrime {
	
	public static boolean isPrimeNo(int no) {
		for(int i=2;i<no;i++) {
			
			if(no%i==0) {
			
				return false;}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int num1=13;
		
		if(isPrimeNo(num1))
			System.out.println(num1+" is a prime number");
		else
			System.out.println(num1+" is not a prime number");
		
int num2=10;
		
		if(isPrimeNo(num2))
			System.out.println(num2+" is a prime number");
		else
			System.out.println(num2+" is not a prime number");
	}

}
