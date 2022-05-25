package org.logicalprograms;

public class ReverseEachWordInASentence {
	private void reverseWord(String s) {
		String[] split = s.split(" ");
		String revWord = "";
		for(String word:split) {
			String rev = "";
			for(int i=word.length()-1;i>=0;i--) {
				rev+= word.charAt(i);	
			}
			revWord+=rev+" ";
		}
		System.out.println(revWord);
	}
	public static void main(String[] args) {
		ReverseEachWordInASentence r = new ReverseEachWordInASentence();
		r.reverseWord("my name is what");
	}
}
