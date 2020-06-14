package ua.lviv.lgs.task2;

public class Main {

	public static void main(String[] args) {
		/*Example string*/
		String s = "test String long long long long";
		
		/*Call of constructors*/
		Default defDoc = DocString::new;
		NotDefault notDefDoc = DocString::new;
		
		/*Output of the objects DocString*/
		new Thread(() -> System.out.println(defDoc.createDoString())).start(); 
		
		new Thread(() -> System.out.println(notDefDoc.createDoString(s))).start(); 
		

	}

	
	
	
}


