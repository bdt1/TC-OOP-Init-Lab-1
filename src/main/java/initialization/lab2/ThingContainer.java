package initialization.lab2;

import initialization.lab1.ColorfulThing;
import initialization.lab1.ColorfulThing.Color;

public class ThingContainer {

	// array
	private ColorfulThing[] colorfulThingsArray;
	private int counter = 0;
	// counter to be used to determine index of array

	// constructor ThingContainer1
	public ThingContainer(int sizeOfArray) {
		colorfulThingsArray = new ColorfulThing[sizeOfArray];
	}

	// new constructor ThingContainer2
	public ThingContainer(ColorfulThing[] inputColorfulThingArray) {
		colorfulThingsArray = inputColorfulThingArray;
	}

	public void add(ColorfulThing color) {
		if (getCounter() < colorfulThingsArray.length) {
			colorfulThingsArray[getCounter()] = color;
			setCounter(getCounter() + 1);
		} else {
			System.out.println("ThingContainer is full");
		}

	}

	public void printThing() {
		for (int i = 0; i < colorfulThingsArray.length; i++) {
			if (colorfulThingsArray[i] != null) {
				System.out.println(colorfulThingsArray[i].getColor());
			} else {
				break;
			}
		}

	}

	public int pop() {
		int lastFilledPos = colorfulThingsArray.length - 1;
		for (int i = 0; i < colorfulThingsArray.length; i++) {
			if (colorfulThingsArray[i] == null) {
				lastFilledPos = i - 1;
				break;
			}
		}
		colorfulThingsArray[lastFilledPos] = null;
		setCounter(getCounter() - 1);
		return getCounter();
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Color remove(Color removeColor) {
		Color deletedColor = null;
		for (int i = 0; i < colorfulThingsArray.length; i++) {
			if (deletedColor == null && colorfulThingsArray[i].getColor() == removeColor) {
				deletedColor = colorfulThingsArray[i].getColor();
			}

			if (deletedColor != null) {
				if (i == colorfulThingsArray.length - 1) {
					colorfulThingsArray[i] = null;
				} else {
					colorfulThingsArray[i] = colorfulThingsArray[i + 1];
				}
				
			}
		}
		return deletedColor;

	}

	public ColorfulThing remove(ColorfulThing removeColorfulThing) {
		ColorfulThing deletedColorfulThing = null;
		for (int i = 0; i < colorfulThingsArray.length; i++) {
			if (deletedColorfulThing == null && colorfulThingsArray[i].getColor() == removeColorfulThing.getColor()) {
				deletedColorfulThing = colorfulThingsArray[i];
			}

			if (deletedColorfulThing != null) {
				if (i == colorfulThingsArray.length - 1) {
					colorfulThingsArray[i] = null;
				} else {
					colorfulThingsArray[i] = colorfulThingsArray[i + 1];
				}
			}

		}
		return deletedColorfulThing;

	}

}
