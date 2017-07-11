package initialization.lab1;
import org.junit.Test;

import initialization.lab1.ColorfulThing.Color;

import org.junit.Assert;

public class ColorfulThingTest {
	
	@Test
	
	public void testGetColorC1(){
		// :Given
		ColorfulThing c1 = new ColorfulThing(Color.Green);
		Color expected = Color.Green;
		// :When
		Color actual = c1.getColor();
		// :Then
		Assert.assertEquals(expected, actual);
	}
	
	
    
    @Test
	public void testGetColorC2(){
		// :Given
		ColorfulThing c2 = new ColorfulThing(Color.Red);
		Color expected = Color.Red;
		// :When
		Color actual = c2.getColor();
		// :Then
		Assert.assertEquals(expected, actual);
    }
    
    
    
    @Test
	public void testGetColorC3(){
		// :Given
		ColorfulThing c3 = new ColorfulThing(Color.Yellow);
		Color expected = Color.Yellow;
		// :When
		Color actual = c3.getColor();
		// :Then
		Assert.assertEquals(expected, actual);
    }
    
    
    
    @Test
	public void testGetColorC4(){
		// :Given
		ColorfulThing c4 = new ColorfulThing(Color.Blue);
		Color expected = Color.Blue;
		// :When
		Color actual = c4.getColor();
		// :Then
		Assert.assertEquals(expected, actual);
    }
    
    
    
    @Test
	public void testGetColorC5(){
		// :Given
		ColorfulThing c5 = new ColorfulThing(Color.Orange);
		Color expected = Color.Orange;
		// :When
		Color actual = c5.getColor();
		// :Then
		Assert.assertEquals(expected, actual);
    }
    
}
