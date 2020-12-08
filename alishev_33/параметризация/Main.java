package alishev_33.параметризация;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String [] args) {
		/////////// Java 5 //////////////
		List animals = new ArrayList();
		Animal curAnimal = new Animal();
		animals.add("cat");
		animals.add("dog");
		animals.add("frog");
		animals.add(curAnimal);
		
		String animal = (String)animals.get(3);
		System.out.println(animal);
		
		////////////// С появление дженериков /////////
		
		List<String> animals2 = new ArrayList<String>();
		animals2.add("cat");
		animals2.add("dog");
		animals2.add("frog");
		
		String animal2 = animals2.get(1);
		System.out.println(animal2);
		
		/////////////// Java 7 //////////////
		List<String> animals3 = new ArrayList<>();
	}
}

class Animal {
	
}