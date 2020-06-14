package ua.lviv.lgs.task1;

public class Application {

	public static void main(String[] args) {

		Pet cow = () -> System.out.println("ί κξπξβΰ - Μσσσ-Μσσσ");
		Pet cat = () -> System.out.println("ί κ³ς - Μÿσσσ-Μÿσσσ");
		Pet dog = () -> System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");

		cow.makeSound();
		cat.makeSound();
		dog.makeSound();

	}

}
