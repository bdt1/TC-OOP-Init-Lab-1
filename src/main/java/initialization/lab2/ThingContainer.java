package initialization.lab2;

import initialization.lab1.ColorfulThing;

public class ThingContainer {
/*class to hold ColorfulThings - needs an add method to add `ColorfulThing`s 
to its array
	
Give the `ThingContainer` class an array of `ColorfulThing`s and a constructor 
that takes one argument: an integer that defines the size of the array.	
*/
	//array
	private ColorfulThing[] colorfulThingsArray;
	private int counter = 0;
	// counter to be used to determine index of array
	

	// constructor
	public ThingContainer(int sizeOfArray){
		colorfulThingsArray = new ColorfulThing[sizeOfArray];
	}
	
    // N/A
	//public ThingContainer(ColorfulThing[] inputColorfulThingArray) {
        //colorfulThingsArray = inputColorfulThingArray;
	//}
	
	public void add(ColorfulThing color){	
		if(counter < colorfulThingsArray.length) {
			colorfulThingsArray[counter] = color;
			counter++;
		} 
		else {
			System.out.println("ThingContainer is full");
		}
		
	}
	
	public void printThing() {
		for(int i = 0; i < colorfulThingsArray.length; i++) {
			if (colorfulThingsArray[i] != null) {
				System.out.println(colorfulThingsArray[i].getColor());
			}
			else {
				break;
			}
		}
	}
	
	
}
