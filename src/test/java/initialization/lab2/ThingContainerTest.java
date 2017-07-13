package initialization.lab2;

import org.junit.Assert;
import org.junit.Test;

import initialization.lab1.ColorfulThing;
import initialization.lab1.ColorfulThing.Color;

public class ThingContainerTest {

	@Test
	public void testArraySize() {
		// :Given
		System.out.println("--------------testArraySize");
		ThingContainer container1 = new ThingContainer(3);
		int expected = 1;
		ColorfulThing c1 = new ColorfulThing(Color.Green);
		container1.add(c1);
		container1.printThing();
		// :When
		int actual = container1.getCounter();
		// :Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testAdd() {
		// :Given
		System.out.println("--------------testAdd");
		ThingContainer container1 = new ThingContainer(3);
		int expected = 3;
		ColorfulThing c1 = new ColorfulThing(Color.Green);
		ColorfulThing c2 = new ColorfulThing(Color.Red);
		ColorfulThing c3 = new ColorfulThing(Color.Yellow);
		// :When
		container1.add(c1);
		container1.add(c2);
		container1.add(c3);
		container1.printThing();
		int actual = container1.getCounter();
		// :Then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testAddWhenFull() {
		// :Given
		System.out.println("--------------testAddWhenFull");
		ThingContainer container1 = new ThingContainer(3);
		ColorfulThing c1 = new ColorfulThing(Color.Green);
		ColorfulThing c2 = new ColorfulThing(Color.Red);
		ColorfulThing c3 = new ColorfulThing(Color.Yellow);
		int expected = 3;
		// :When
		container1.add(c1);
		container1.add(c2);
		container1.add(c3);
		container1.add(c3);
		container1.printThing();
		int actual = container1.getCounter();
		// :Then
		Assert.assertEquals(expected, actual);

	}

	@Test
	public void testPop() {
		// :Given
		System.out.println("--------------testPop");
		ThingContainer container1 = new ThingContainer(3);
		int expected = 2;
		ColorfulThing c1 = new ColorfulThing(Color.Green);
		ColorfulThing c2 = new ColorfulThing(Color.Red);
		ColorfulThing c3 = new ColorfulThing(Color.Yellow);
		// :When
		container1.add(c1);
		container1.add(c2);
		container1.add(c3);
		int response = container1.pop();
		container1.printThing();
		// :Then
		Assert.assertEquals(expected, response);
	}
	
	@Test
	public void testRemoveColor() {
		// :Given
		System.out.println("--------------testRemoveColor");
		ThingContainer container1 = new ThingContainer(3);
		Color expected = Color.Green;
		ColorfulThing c1 = new ColorfulThing(Color.Green);
		ColorfulThing c2 = new ColorfulThing(Color.Red);
		ColorfulThing c3 = new ColorfulThing(Color.Yellow);
		// :When
		container1.add(c1);
		container1.add(c2);
		container1.add(c3);
		Color response = container1.remove(Color.Green);
		container1.printThing();
		// :Then
		Assert.assertEquals(expected, response);
	}
	
	@Test
	public void testRemoveColorfulThing() {
		// :Given
		System.out.println("--------------testRemoveColorfulThing");
		ThingContainer container1 = new ThingContainer(4);
		ColorfulThing c1 = new ColorfulThing(Color.Green);
		ColorfulThing c2 = new ColorfulThing(Color.Red);
		ColorfulThing c3 = new ColorfulThing(Color.Yellow);
		ColorfulThing expected = c1;
		// :When
		container1.add(c1);
		container1.add(c2);
		container1.add(c3);
		container1.add(c1);
		
		ColorfulThing response = container1.remove(c2);
		container1.printThing();
		// :Then
		Assert.assertEquals(expected, response);
	}


}
