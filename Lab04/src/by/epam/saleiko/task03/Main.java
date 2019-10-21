package by.epam.saleiko.task03;

import by.epam.saleiko.task03.entity.*;

public class Main {
	public static void main(String[] args) {
		User u1 = new User();
		u1.addAccount(500);
		u1.addAccount(-100);
		u1.addAccount(450);
		u1.addAccount(1000);
		u1.addAccount(-500);
		System.out.println(u1.positiveSum()+"\n"+u1.negativeSum());
		u1.sort();
		u1.blockAll();
		u1.findByBalance(450)[0].unblock();
		System.out.println(u1.findByBalance(450).length);
		System.out.println(u1.toString());
	}
}
