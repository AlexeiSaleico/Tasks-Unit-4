package by.epam.saleiko.task01.entity;

import java.util.HashSet;
import java.util.Objects;

public class District {
	private HashSet<City> cities = new HashSet<City>();
	private int area;
	private City center;
	
	public void setArea(int area) {
		this.area = area;
	}

	public int getArea() {
		return area;
	}
	
	public void addCity(City c) {
		cities.add(c);
		if (cities.size()==1) setCenter(c);
	}
	
	public HashSet<City> getCities(){
		return cities;
	}
	
	public void setCenter(City c) {
		center = c;
		if (!cities.contains(c)) cities.add(c);
	}
	
	public City getCenter() {
		return center;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || o.getClass() != getClass()) return false;
		if (this == o) return true;
		if (!(o instanceof City)) return false; 
		District d = (District) o;
		return cities.equals(d.cities) && area == d.area && center == d.center;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(area,center,cities);
	}
}
