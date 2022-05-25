package org.logicalprograms;

public class XPattern {
	private void x(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i+j==4) {
				System.out.print("*");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		XPattern x= new XPattern();
		x.x(5);
	}
}
