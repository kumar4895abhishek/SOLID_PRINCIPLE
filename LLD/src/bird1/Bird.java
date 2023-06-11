package bird1;

public abstract class Bird // If the common classes have common attributes, consider using abstract classes since they can have instance variables. 
{ // SRP & OCP
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
	
	abstract public void fly();
	
	

}
