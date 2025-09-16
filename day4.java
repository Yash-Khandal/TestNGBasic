package test;

import org.testng.annotations.Test;

public class day4 {

	@Test(groups = {"hello", "greet"})
	public void sayHello() {
	    System.out.println("Hello!");
	}

	@Test(groups = {"bye", "greet"})
	public void sayBye() {
	    System.out.println("Bye!");
	}

	@Test(groups = {"hello", "morning"})
	public void goodMorning() {
	    System.out.println("Good Morning!");
	}

	@Test(groups = {"bye", "night"})
	public void goodNight() {
	    System.out.println("Good Night!");
	}

}
