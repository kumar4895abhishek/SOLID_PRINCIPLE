package bird2;

public class Parrot extends Bird implements flyable {
	
	public Parrot(String colour,double weight)
	{
		super(colour,weight);
	}

	

	@Override
	public void canFly() {
		System.out.println("PARROT IS FLYING");
		
	}

	@Override
	void eat() {
		System.out.println("PARROT CAN EAT EVERY BIRD CAN EAT");
		
	}

}
