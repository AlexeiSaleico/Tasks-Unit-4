package by.epam.saleiko.task01.entity;

import java.util.HashSet;
import java.util.Objects;


public class Region {
	private HashSet<District> districts = new HashSet<District>();
	private District center;
	
	
	public void addDistrict(District d) {
		districts.add(d);
		if (districts.size()==1) setCenter(d);
	}
	
	public HashSet<District> getDistricts(){
		return districts;
	}
	
	public void setCenter(District d) {
		center = d;
		if (!districts.contains(d)) districts.add(d);
	}
	
	public District getCenter() {
		return center;
	}
	

	@Override
	public boolean equals(Object o) {
		if (o == null || o.getClass() != getClass()) return false;
		if (this == o) return true;
		if (!(o instanceof Region)) return false; 
		Region r = (Region) o;
		return districts.equals(r.districts) && center.equals(r.center);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(districts,center);
	}
}

