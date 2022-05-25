package org.logicalprograms;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class PrintAllOddAndEvenNumbers {
	private void allOddAndEven(int num) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("ent the num:");
		//int num = sc.nextInt();
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		for (int i = 1;i<=num;i++) {
			if(i%2==0) {
				even.add(i);
				//System.out.println(even);
			}
			else {
				odd.add(i);
				//System.out.println(odd);
			}
		}
		System.out.println("even: "+even);
		System.out.println("evenCount: "+even.size());
		System.out.println("odd: "+odd);
		System.out.println("oddCount: "+odd.size());
	}
	public static void main(String[] args) {
		PrintAllOddAndEvenNumbers n = new PrintAllOddAndEvenNumbers();
		n.allOddAndEven(50);
	}
}
