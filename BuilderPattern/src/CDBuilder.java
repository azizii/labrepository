
public class CDBuilder {
	
	
	public CDType buildSonyCd(){
		
		
	CDType type=new CDType();
	type.AddItem(new Sony());
	type.AddItem(new Sony());
          return type;
	}
	
	
	public CDType buildSamsungCd(){
		CDType type=new CDType();
		type.AddItem(new Samsung());
		type.AddItem(new Samsung());
		   return type;
	}
}