package org.logicalprograms;

import java.util.LinkedList;
import java.util.List;

public class ReverseSentence {
	private void reverse(String s) {
		String[] split = s.split(" ");
		List<String> li = new LinkedList<>();
		for(int i = split.length-1; i >-1; i--) {
			li.add(split[i]);
		}
		for(String j:li) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	private void anotherReverse(String s) {
		String[] split = s.split(" ");
		String rev ="";
		for(int i = split.length-1; i >-1; i--) {
			rev+=split[i]+" ";	
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		ReverseSentence r = new ReverseSentence();
		r.reverse("This program is to reverse the given sentence");
		r.anotherReverse("We successfully reversed the sentence by a shorter method");
	}
}
