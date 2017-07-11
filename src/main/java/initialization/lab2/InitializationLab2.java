package initialization.lab2;
import initialization.lab1.ColorfulThing;
import initialization.lab1.ColorfulThing.*;

public class InitializationLab2 {
	public static void main(String [] args){
		
		ColorfulThing c1 = new ColorfulThing(Color.Green);
		ColorfulThing c2 = new ColorfulThing(Color.Red);
		ColorfulThing c3 = new ColorfulThing(Color.Yellow);
	
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		System.out.println(c3.getColor());
		
	}
	
	
	
}


