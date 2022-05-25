package org.logicalprograms;

public class StringReverse {
	private void reverseString(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		StringReverse s = new StringReverse();
		s.reverseString("aravind");
	}
}
