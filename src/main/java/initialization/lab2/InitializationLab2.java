package initialization.lab2;

import initialization.lab1.ColorfulThing;
import initialization.lab1.ColorfulThing.*;

public class InitializationLab2 {
	public static void main(String[] args) {

		// Constructor1 ThingContainer1
		ColorfulThing c1 = new ColorfulThing(Color.Green);
		ColorfulThing c2 = new ColorfulThing(Color.Red);
		ColorfulThing c3 = new ColorfulThing(Color.Yellow);

		System.out.println("--------------testAdd");
		ThingContainer container1 = new ThingContainer(6);
		container1.add(c1);
		container1.add(c2);
		container1.add(c3);
		container1.add(c1);
		container1.add(c2);
		container1.add(c3);
		container1.printThing();

		System.out.println("--------------testAddWhenFull");
		container1.add(c1);
		container1.printThing();

		System.out.println("--------------testRemoveColor Green");
		container1.remove(Color.Green);
		container1.printThing();

		System.out.println("--------------testRemoveColorfulThing c2(Red)");
		container1.remove(c2);
		container1.printThing();

		// Constructor1 ThingContainer1
		System.out.println("--------------testThingContainer2");
		ColorfulThing[] myArrayOfColorfulThings = new ColorfulThing[6];
		ThingContainer container2 = new ThingContainer(myArrayOfColorfulThings);

		System.out.println("--------------testAdd 2");
		container2.add(c1);
		container2.add(c2);
		container2.add(c3);
		container2.add(c1);
		container2.add(c2);
		container2.add(c3);
		container2.printThing();

		System.out.println("--------------testAddWhenFull 2");
		container2.add(c1);
		container2.printThing();

		System.out.println("--------------testRemoveColor Green 2");
		container2.remove(Color.Green);
		container2.printThing();

		System.out.println("--------------testRemoveColorfulThing c2(Red) 2");
		container2.remove(c2);
		container2.printThing();

	}

}
