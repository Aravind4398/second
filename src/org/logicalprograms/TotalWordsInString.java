package org.logicalprograms;

public class TotalWordsInString {
	private void total(String s) {
		String[] a = s.split(" ");
		int total = a.length;
		System.out.println("Total words in the given string: "+total);
	}
	public static void main(String[] args) {
		TotalWordsInString t = new TotalWordsInString();
		t.total("A paragraph is a series of related sentences developing a central idea, called the topic. Try to think about paragraphs in terms of thematic unity: a paragraph is a sentence or a group of sentences that supports one central, unified idea. Paragraphs add one idea at a time to your broader argument.");
	}
}
