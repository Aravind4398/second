package org.logicalprograms;

public class StringPalindrome {
	private void palindrome(String s) {
		String pal="";
		for(int i = s.length()-1;i>=0;i--) {
			pal+=s.charAt(i);
		}
		if(s.equals(pal)) {
			System.out.println("The given string "+s+" is palindrome");
		}
		else {
			System.out.println("The given string "+s+" is not palindrome");
		}
	}
	public static void main(String[] args) {
		StringPalindrome s = new StringPalindrome();
		s.palindrome("racecar");
	}
}
