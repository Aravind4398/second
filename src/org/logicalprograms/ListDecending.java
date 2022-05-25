package org.logicalprograms;

public class ListDecending {
	private void reverseSort() {
		int[] ar = new int[6];
		ar[0]=9;
		ar[1]=7;
		ar[2]=11;
		ar[3]=94;
		ar[4]=79;
		ar[5]=98;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		ListDecending l = new ListDecending();
		l.reverseSort();
	}
}
