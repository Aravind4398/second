package org.logicalprograms;

public class PrintPrimeNumbers {
	private void printPrime(int num) {
		if(num>1) {
			for(int i =2;i<num;i++) {
				int count = 0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						count+=1;
					}
				}
				if(count==0) {
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		PrintPrimeNumbers p = new PrintPrimeNumbers();
		p.printPrime(100);
	}
}
