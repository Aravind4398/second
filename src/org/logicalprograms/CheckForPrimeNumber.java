package org.logicalprograms;

public class CheckForPrimeNumber {
	private void primeOrNot(int num) {
		int count = 0;
		if(num>1) {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					count+=1;
				}
			}
			if(count>0) {
				System.out.println(num+" is not a prime number");
			}
			else {
				System.out.println(num+" is a prime number");
			}
		}
		else {
			System.out.println("Enter a number greater than 1");
		}
	}
	public static void main(String[] args) {
		CheckForPrimeNumber c = new CheckForPrimeNumber();
		c.primeOrNot(11);
	}
}
