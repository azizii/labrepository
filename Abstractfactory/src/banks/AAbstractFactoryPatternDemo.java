package banks;

import java.util.Scanner;

public class AAbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
	System.out.println("enter the nam of shape");
	
	String shapeName=input.nextLine();
	
	System.out.println("enter the type of color eg  Green, Red, Blue");
	String ColorName=input.nextLine();
	AbstractFactory  shapefactory=FactoryCreator.getFactory("Shape");
	Shape s=shapefactory.getShape(shapeName);
		

	}

}
