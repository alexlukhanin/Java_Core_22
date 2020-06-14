package ua.lviv.lgs.task5;

public class Frog  {
	final private String GREETING = "I am a frog! ";
	
	/*Realization of Functional interface in class Frog*/
	Amphibiable eat = () -> System.out.println(GREETING + "I am eating...");
	Amphibiable swim = () -> System.out.println(GREETING + "I am swiming...");
	Amphibiable walk = () -> System.out.println(GREETING + "I am walking...");
	Amphibiable sleep = () -> System.out.println(GREETING + "I am sleeping...");
	
	
	

}
