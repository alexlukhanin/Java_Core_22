package ua.lviv.lgs.task1;

public class Application {

	public static void main(String[] args) {

		Pet cow = () -> System.out.println("� ������ - ����-����");
		Pet cat = () -> System.out.println("� �� - �����-�����");
		Pet dog = () -> System.out.println("� ��� - �����-�����");

		cow.makeSound();
		cat.makeSound();
		dog.makeSound();

	}

}
