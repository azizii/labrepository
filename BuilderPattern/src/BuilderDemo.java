
public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CDBuilder cdbuilder=new CDBuilder();
		
		CDType type=cdbuilder.buildSamsungCd();
		System.out.println("samsung");
		type.showitem();
		System.out.println("Total Cost "+type.price());
		
		
		CDType type1=cdbuilder.buildSonyCd();
		System.out.println("sony");
		type.showitem();
		System.out.println("Total Cost "+type1.price());
		
	}

}