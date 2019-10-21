package by.epam.saleiko.task01;

import by.epam.saleiko.task01.entity.*;

public class Generator {
	private static String[] names = {
			"��������","����������","�������","������","����������","������","��������","���������","�������","�����","����-��������","�����","����������","������������","�����",
			"�������","�������","���������","�������","�������","���������","��������","������","�����","�������","������","�����-�������","���������","�����",
			"������","�������","��������","��������","�������","�����","������","�������","���������","������","��������","�������","���������","����","�����������","�������",
			"�������","�����","���������","������","������","������","�������","�����������","������","������","������","����","�������","�������","������","��������",
			"������","��������","������� �����","����������","�����","�����","�������","���������","�����","����������","������","����������","�������","������",
			"����������","�����������","����","���������","������","�����","������","��������","�������","�������","������","�������","�����������","��������",
			"�����","�������","���������","������","�����","���������","��������","���������","������ ������","�������","������","�������","�����","����","��������",
			"�������","�����","�������","�������","�������","�������","�����","�����"};
	private static int maxDistrictArea = 1337;
	
	public static City generateCity()  {
		String name =names[(int)(Math.random()*names.length)];
		return new City(name);
		}
			
	public static District generateDistrict() {
		District d = new District();
		int area = (int)(Math.random() * maxDistrictArea);
		d.setArea(area);
		do {
			d.addCity(generateCity());
		}while(Math.random()<0.1);
		return d;
	}
	
	public static Region generateRegion() {
		Region r = new Region();
		do {
			r.addDistrict(generateDistrict());
		}while(Math.random()<0.8);
		return r;
	}
	
	public static Country generateCountry() {
		Country c = new Country();
		do {
			c.addRegion(generateRegion());
		}while( Math.random() < 0.5);
		return c;
	}
}

	
