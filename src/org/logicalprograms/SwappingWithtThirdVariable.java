package org.logicalprograms;

public class SwappingWithtThirdVariable {
	private void swap(int a,int b) {
		int temp;
		temp= a;
		a = b;
		b = temp;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	public static void main(String[] args) {
		SwappingWithtThirdVariable s = new SwappingWithtThirdVariable();
		s.swap(5, 10);
	}
}
