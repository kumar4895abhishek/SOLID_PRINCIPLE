package bird1;

public class Parrot extends Bird {
	
	public Parrot(String colour,double weight)
	{
		super(colour,weight);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("PARROT IS FLYING");
		
	}

}
