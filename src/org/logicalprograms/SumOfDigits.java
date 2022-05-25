package org.logicalprograms;

public class SumOfDigits {
	private void sum(int num) {
		int sum = 0;
		while(num>0) {
			int n = num%10;
			sum+=n;
			num/=10;
		}
		System.out.println("sum of the digits is "+sum);
	}
	public static void main(String[] args) {
		SumOfDigits s = new SumOfDigits();
		s.sum(12345);
	}
}
