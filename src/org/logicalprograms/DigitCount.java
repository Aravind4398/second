package org.logicalprograms;

public class DigitCount {
	private void count(int num) {
		int count = 0;
		while(num>0) {
			count++;
			num = num/10;
		}
		System.out.println("Total Digits: "+count);
	}
	public static void main(String[] args) {
		DigitCount d = new DigitCount();
		d.count(95743043);
	}
}
