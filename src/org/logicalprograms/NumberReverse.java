package org.logicalprograms;

public class NumberReverse {
	private void num(int num) {
		int rev = 0;
		while(num>0) {
			int n = num%10;
			rev = (rev*10)+n;
			num= num/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		NumberReverse n = new NumberReverse();
		n.num(54321);
	}
}
