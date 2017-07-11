package initialization.lab2;

import org.junit.Assert;
import org.junit.Test;

import initialization.lab1.ColorfulThing;
import initialization.lab1.ColorfulThing.Color;

//Be sure to test the behavior of `ThingContainer` in multiple 
//scenarios, including testing the `add` method when the `
//ThingContainer is or is not full.

public class InitializationLab2Test {

	@Test
	public void testAddNotFull() {
	// :Given
	ThingContainer container1 = new ThingContainer(3);
	ColorfulThing c1 = new ColorfulThing(Color.Green);
	ColorfulThing c2 = new ColorfulThing(Color.Red);
	ColorfulThing c3 = new ColorfulThing(Color.Yellow);
	//String expected = "Green\n + Red\n + Yellow";
	//String expected = (Color.Green) + "\n" + (Color.Red) + "\n" + (Color.Yellow);
	// :When
	container1.add(c1);
	container1.add(c2);
	container1.add(c3);
	container1.printThing();
	
	// :Then
	//Assert.assertArrayEquals(expected), (container1.printThing()));
	}


	@Test
	public void testAddWhenFull() {
	// :Given
	ThingContainer container1 = new ThingContainer(2);
	ColorfulThing c1 = new ColorfulThing(Color.Green);
	ColorfulThing c2 = new ColorfulThing(Color.Red);
	ColorfulThing c3 = new ColorfulThing(Color.Yellow);
	//String expected = "Green\n + Red\n + Yellow";
	//String expected = (Color.Green) + "\n" + (Color.Red) + "\n" + (Color.Yellow);
	// :When
	container1.add(c1);
	container1.add(c2);
	container1.add(c3);
	container1.printThing();
	
	// :Then
	//Assert.assertArrayEquals(expected), (container1.printThing()));
	}

}

