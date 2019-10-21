package by.epam.saleiko.task01;

import by.epam.saleiko.task01.entity.*;
import by.epam.saleiko.task01.logic.CountryLogic;

public class Main {
	public static void main(String[] args) {
		Country b = Generator.generateCountry();
		
		System.out.println("Столица: " + CountryLogic.getCapital(b).getName());
		System.out.println("Количество областей: " + CountryLogic.calculateRegions(b));
		System.out.println("Площадь: " + CountryLogic.calculateArea(b));
		System.out.println("Областные центры:");
		for(City c : CountryLogic.getRegionCenters(b))
			System.out.println(c.getName());
		System.out.println();
		
		for(Region r: b.getRegions())
		{
			System.out.println("Область " + r.getCenter().getCenter().getName());
			for(District d: r.getDistricts()) {
				System.out.print("Район " + d.getCenter().getName() +", площадью " + d.getArea() + "\nГорода:");
				for(City c: d.getCities()) {
					System.out.print(c.getName()+"; ");
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}
	
	
}
