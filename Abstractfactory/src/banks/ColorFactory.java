package banks;

public class ColorFactory extends  AbstractFactory {



	@Override
	public Shape getShape(String shape) {
		
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		
		if (color == null) {
			return null;
		}else if(color.equalsIgnoreCase("Green")) {
			return new Green();
			
		}else if(color.equalsIgnoreCase("Red")) {
			return new Red();
			
		}else if(color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
		return null;
	}
}
