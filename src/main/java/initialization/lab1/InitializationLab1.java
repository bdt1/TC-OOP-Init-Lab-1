package initialization.lab1;

import initialization.lab1.ColorfulThing.Color;

public class InitializationLab1 {


	public static void main(String [] args){

		ColorfulThing c1 = new ColorfulThing(Color.Green);
		ColorfulThing c2 = new ColorfulThing(Color.Red);
		ColorfulThing c3 = new ColorfulThing(Color.Yellow);
		ColorfulThing c4 = new ColorfulThing(Color.Blue);
		ColorfulThing c5 = new ColorfulThing(Color.Orange);
		

		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		System.out.println(c3.getColor());
		System.out.println(c4.getColor());
		System.out.println(c5.getColor());
		
		
		BoringThing b1 = new BoringThing("brown");
		BoringThing b2 = new BoringThing("violet");
		BoringThing b3 = new BoringThing("purple");
		BoringThing b4 = new BoringThing("pink");
		BoringThing b5 = new BoringThing("rose");
		
		
	}
	
}
