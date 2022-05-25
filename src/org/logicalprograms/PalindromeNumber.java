package org.logicalprograms;

public class PalindromeNumber {
	private void palindrome(int num) {
		int n = num;
		int rev = 0;
		while(n>0) {
			int num1 = n%10;
			rev = (rev*10)+num1;
			n = n/10;
		}
		if(rev == num) {
			System.out.println(num+" is a palindrome number");
		}
		else {
			System.out.println(num+" is not a palindrome number");
		}
	}
	public static void main(String[] args) {
		PalindromeNumber p = new PalindromeNumber();
		p.palindrome(123216);
	}
}
