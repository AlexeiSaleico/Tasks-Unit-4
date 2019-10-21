package by.epam.saleiko.task02.entity;

import java.util.Arrays;
import java.util.Objects;

public class Text {
	private String title;
	private Sentence[] text;
	
	public Text(String text, String title){
		String[] arr = text.split("[\\.\\!\\?]");
		this.text = new Sentence[arr.length];
		for(int i = 0; i < arr.length; i++)
			this.text[i] = new Sentence(arr[i]);
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void addText(String str) {
		String[] arr = str.split("[\\.\\!\\?]");
		Sentence[] temp = text.clone();
		text = new Sentence[temp.length+arr.length];
		for(int i = 0; i< temp.length; i++) {
			text[i] = temp[i];}
		for (int i = temp.length; i < text.length; i++) {
			text[i] = new Sentence(arr[i - temp.length]);}
	}
	
	public String getText() {
		String out = "";
		for(Sentence s : text) out+= s.toString();
		return out;	
	}
	
	
	@Override
	public String toString() {
		 return "Title: " + title + "\n" + getText();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (!(o instanceof Text)) return false; 
		return ((Text)o).text.equals(text) && ((Text)o).title.equals(title);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(text, title);
	}
}
