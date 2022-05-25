package org.logicalprograms;

public class TotalCharInString {
	public void totalCount(String s) {
		int count=0;
		for(int i=0; i<s.length();i++) {
			count+=1;
		}
		System.out.println("Total characters in the given string: "+count);
	}
	public static void main(String[] args) {
		TotalCharInString t = new TotalCharInString();
		t.totalCount("My name is aravind");
	}
}
