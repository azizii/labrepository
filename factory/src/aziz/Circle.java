package aziz;

public class Circle implements Shape {
	int c=0;
	@Override
	public void Draw() {
		System.out.println("result is"+c);
	}
	@Override
	public void implement(int a,int b) {
		// TODO Auto-generated method stub
		
		c=a+b;
		
		
	}
}
