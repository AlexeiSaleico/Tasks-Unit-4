package by.epam.saleiko.task01.entity;

import java.util.Objects;

public class City {
	private String name;
	
	public City(String name){
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (!(o instanceof City)) return false; 
		City c = (City) o;
		return c.name == name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
