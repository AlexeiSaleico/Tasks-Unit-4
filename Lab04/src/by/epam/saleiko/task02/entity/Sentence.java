package by.epam.saleiko.task02.entity;

import java.util.Objects;

public class Sentence {
	private Word[] words;
	
	public Sentence(String sentence){
		String[] arr = sentence.split(" ");
		words = new Word[arr.length];
		for(int i = 0; i < arr.length; i++)
			words[i] = new Word(arr[i]);
	}
	
	public Word[] getWords() {
		return words;
	}
	
	@Override
	public String toString() {
		String out = "";
		for(int i = 0; i < words.length - 1; i++) out+= words[i].toString() + " ";
		out += words[words.length-1]+". ";
		return out;	
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (!(o instanceof Sentence)) return false; 
		return ((Sentence)o).words.equals(words);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(words);
	}

}
