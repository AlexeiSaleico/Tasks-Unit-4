package by.epam.saleiko.task02.entity;

import java.util.Objects;

import by.epam.saleiko.task01.entity.City;

public class Word {
	private String word;
	
	public Word(String word) {
		this.word = word;
	}
	
	public String getWord() {
		return word;
	}
	
	@Override
	public String toString() {
		return word;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (!(o instanceof Word)) return false; 
		return ((Word)o).word.equals(word);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(word);
	}
}
