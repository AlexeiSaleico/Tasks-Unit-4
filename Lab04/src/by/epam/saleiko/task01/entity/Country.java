package by.epam.saleiko.task01.entity;

import java.util.HashSet;
import java.util.Objects;

public class Country {
	private HashSet<Region> regions = new HashSet<Region>();
	private Region center;
	
	
	public void addRegion(Region r) {
		regions.add(r);
		if (regions.size()==1) setCenter(r);
	}
	
	public HashSet<Region> getRegions(){
		return regions;
	}
	
	public void setCenter(Region r) {
		center = r;
		if (!regions.contains(r)) regions.add(r);
	}
	
	public Region getCenter() {
		return center;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (!(o instanceof City)) return false; 
		Country c = (Country) o;
		return regions.equals(c.regions) && center == c.center;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(regions,center);
	}

}
