package bird2;

public abstract class Bird // LISKOV SUBS
{
	private String colour;
	
	public String getColour() {
		return colour;
	}

	public double getWeight() {
		return weight;
	}

	private double weight;
	
	public Bird(String colour,Double weight)
	{
		
		this.weight=weight;
		this.colour=colour;
		
	}
	
	abstract void eat();
	
	
	
	

}
