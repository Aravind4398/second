package org.logicalprograms;

public class ListAscending {
	private void sort() {
		int [] ar = new int[6];
		ar[0] = 7;
		ar[1] = 3;
		ar[2] = 17;
		ar[3] = 32;
		ar[4] = 67;
		ar[5] = 2;
		for(int i =0; i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		ListAscending l = new ListAscending();
		l.sort();
	}
}
