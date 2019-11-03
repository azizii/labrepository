package aziz;

public class factory {

	
	
	public Shape getShape(String shapes) {
		
		if(shapes==null) {
			return null;
		}
		
		if(shapes.equalsIgnoreCase("Square")) {
			return new Square();
			
		}else if(shapes.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		else if(shapes.equalsIgnoreCase("Circle")) {
			return new  Circle();
		}
		return null;
		
	}
}
