
import java.util.ArrayList;
import java.util.List;



public class CDType {
	
	   private List<Packing> packings= new ArrayList<Packing>();
	   public void AddItem(Packing pack){
		   packings.add(pack);
	   }
	   
	   public String pack(){
	
		   return null;
	   }

	   public int price(){
		   int cost = 0;
		      
		      for (Packing pack : packings) {
		         cost += pack.price();
		      }		
		      return cost;
	   }

	public void showitem() {
		 for (Packing item : packings) {
	     
	         System.out.print(", Packing : " + item.pack());
	         System.out.println(", Price : " + item.price());
	      }	
		// TODO Auto-generated method stub
		
	}
	   
}