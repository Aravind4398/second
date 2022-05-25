package org.logicalprograms;

import java.util.Scanner;

public class CheckOddOrEven {
	private void oddOrEven() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("ent the num:");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is an even number.");
		}
		else {
			System.out.println(num+" 4is an odd number.");
		}
	}
	public static void main(String[] args) {
		CheckOddOrEven n = new CheckOddOrEven();
		n.oddOrEven();
	}
}
