package week1.day4;

public class RevString {

	public static void main(String[] args) {
		String companyName= "Test Leaf";
		int length=companyName.length();
		
		for (int i=length-1;i>=0;i--) {
			System.out.print(companyName.charAt(i));
		}
		
		System.out.println();
		//using char Array
		char[] charArr = companyName.toCharArray();
		for (int i=charArr.length-1;i>=0;i--) {
			System.out.print(charArr[i]);
		}
	}

}
