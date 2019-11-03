package aziz;

import java.util.Scanner;

public class aji {
	static Scanner input=new Scanner(System.in);
	static factory f1=new factory();
	public static void main(String[] args) {

		System.out.println("    Menu");
		System.out.println("1...........Circle");
		System.out.println("2.......... Square");
		System.out.println("3.......... Rectangle");
		System.out.println("4.......... Exit");
		System.out.println("enter number");
	
		
		
		
int i=0;		
do {
	System.out.println("enter nmumvrt");
	i=input.nextInt();
	switch(i) {
	case 1:
		getshape("Circle");
		break;
	case 2:
		getshape("Square");
		break;
	case 3:
		getshape("Rectangle");
		break;
		default:
			break;
		
	
	}
	
}while(i!=4);
	

	}
	
	public static void getshape(String shapes) {

		int  a=0;
		int b=0;
		System.out.println("enter length and width");
		a=input.nextInt();
		b=input.nextInt();
		Shape p1=f1.getShape(shapes);
		p1.implement(a, b);
		p1.Draw();
		
		
		
		
		
		
		
		
		
	}
	}


