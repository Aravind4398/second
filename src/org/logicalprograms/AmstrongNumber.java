package org.logicalprograms;

public class AmstrongNumber {
	private void amstrong(int num) {
		int n = num;
		int ams = 0;
		while(n>0) {
			int b = n%10;
			ams = ams+(b*b*b);
			n = n/10;
		}
		if(ams == num) {
			System.out.println(num+" is an amstrong number");
		}
		else {
			System.out.println(num+" not an amstrong number");
		}
	}
	public static void main(String[] args) {
		AmstrongNumber a = new AmstrongNumber();
		a.amstrong(154);
	}
}
