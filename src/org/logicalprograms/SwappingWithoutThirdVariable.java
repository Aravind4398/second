package org.logicalprograms;

public class SwappingWithoutThirdVariable {
	private void swap(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	public static void main(String[] args) {
		SwappingWithoutThirdVariable s = new SwappingWithoutThirdVariable();
		s.swap(18, 87);
	}
}
