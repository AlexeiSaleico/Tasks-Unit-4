package by.epam.saleiko.task02;

import by.epam.saleiko.task02.entity.*;

public class Main {
	public static void main(String[] args) {
		Text t = new Text ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
				+ " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
				+ "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum","Lorem ipsum");
		t.addText("��������� ���� � �������� ����, ��������������� ���� ���������� ����������, ������������ ���� � ������ �������� ���������� �����������. "
				+ "����� ����, ������������ � ������������, ��������, ����������, �������������, ������, ������ � ������ �������. "
				+ "�����������, ��� ��������� ������� ��� � ������ ����������. "
				+ "�������� ������ � �������� ������ ��� ����������� �������.");
		
		System.out.println(t.toString());
	
	}
}
