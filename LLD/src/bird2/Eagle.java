package bird2;

public class Eagle extends Bird implements flyable {
	
	public Eagle(String colour,double weight)
	{
		super(colour,weight);
	}

	

	@Override
	public void canFly() {
		System.out.println("EAGLE CAN FLY");
		
	}

	@Override
	void eat() {
		System.out.println("EAGLE CAN EAT EVERY BIRD CAN EAT");
		
	} 

}
