package bird2;

public class Runner {
	
	public static void main(String [] args) 
	{
		System.out.println("BIRD RUNNER");
		
		Bird parrot = new Parrot( "Green",10);
		System.out.println("COLOR OF PARROT is "+parrot.getColour()+" WEIGHT IS "+parrot.getWeight()+" KG ");
        ((flyable)parrot).canFly();

        flyable eagle = new Eagle("Brown", 20);
        eagle.canFly();

        Bird penguin = new penguin("Black", 50.0);
       // penguin.makeSound();
        System.out.println("COLOUR OF PENGUIN IS "+penguin.getColour()+" WEIGHT IS "+penguin.getWeight()+" KG ");

        // Make a pengiun swim
        ((swim) penguin).doSwimming();
		
	}
	

}
