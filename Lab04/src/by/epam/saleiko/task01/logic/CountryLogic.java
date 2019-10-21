package by.epam.saleiko.task01.logic;

import java.util.HashSet;

import by.epam.saleiko.task01.entity.*;

public class CountryLogic {
	
	public static City getCapital(Country c) {
		return c.getCenter().getCenter().getCenter();
	}
	
	public static int calculateArea(Country c) {
		int area = 0;
		for (Region r: c.getRegions())
			for (District d: r.getDistricts())
				area += d.getArea();
		return area;
	}
	
	public static int calculateRegions(Country c) {
		return c.getRegions().size();
	}
	
	public static HashSet<City> getRegionCenters(Country c){
		HashSet<City> centers = new HashSet<City>();
		for(Region r: c.getRegions()) {
			centers.add(r.getCenter().getCenter());
		}
		return centers;
	}
}
