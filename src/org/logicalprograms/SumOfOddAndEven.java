package org.logicalprograms;

public class SumOfOddAndEven {
	private void sum(int num) {
		int oddSum = 0;
		int evenSum = 0;
		for (int i=0;i<=num;i++) {
			if(i%2==0) {
				evenSum+=i;
			}
			else {
				oddSum+=i;
			}
		}
		System.out.println("oddSum: "+oddSum);
		System.out.println("evenSum: "+evenSum);
	}
	public static void main(String[] args) {
		SumOfOddAndEven s = new SumOfOddAndEven();
		s.sum(51);
	}
}
