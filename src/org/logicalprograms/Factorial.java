package org.logicalprograms;

public class Factorial {
	private void fact(int num) {
		int fact = 1;
		for(int i=num;i>0;i--) {
			fact*=i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.fact(5);
	}
}
