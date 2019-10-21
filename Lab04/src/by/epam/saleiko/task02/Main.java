package by.epam.saleiko.task02;

import by.epam.saleiko.task02.entity.*;

public class Main {
	public static void main(String[] args) {
		Text t = new Text ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
				+ " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
				+ "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum","Lorem ipsum");
		t.addText("Узбекский язык — тюркский язык, государственный язык Республики Узбекистан, региональный язык в восьми северных провинциях Афганистана. "
				+ "Кроме того, распространён в Таджикистане, Киргизии, Казахстане, Туркменистане, России, Турции и других странах. "
				+ "Диалектичен, что позволяет отнести его к разным подгруппам. "
				+ "Является родным и основным языком для большинства узбеков.");
		
		System.out.println(t.toString());
	
	}
}
