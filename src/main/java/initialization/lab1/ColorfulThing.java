package initialization.lab1;

public class ColorfulThing {
	private Color color;
	
	public enum Color{
		Green,
		Red,
		Yellow,
		Blue,
		Orange;
	}
		
		public ColorfulThing(Color color){
			this.color = color;
			
		}
		
		public Color getColor(){
			return this.color;
		}


		
}
