package org.logicalprograms;

public class CountOddAndEven {
	private void count(int a) {
		int odd = 0;
		int even = 0;
		for(int i=1;i<=a;i++) {
			if(i%2!=0) {
				odd = odd+1;
			}
			else{
				even = even+1;
			}
		}
		System.out.println("even: "+even);
		System.out.println("odd: "+odd);
	}
	public static void main(String[] args) {
		CountOddAndEven c = new CountOddAndEven();
		c.count(50);
	}
}
