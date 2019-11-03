

public class testadapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Movable bugattiVeyron = new BugattiVeyron();
		    MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		    System.out.println("Bugatti Veyron Super Sport's top speed is " + bugattiVeyronAdapter.getSpeed() + " Kmph.");
		   

}
}