package bird1;

public class Runner {
	
	public static void main(String [] args) {
		System.out.println("BIRD RUNNER");
		
		Bird eagle=new Eagle("BLACK", 10);
		eagle.fly();
		System.out.println("EAGLE WEIGHT IS "+eagle.getWeight()+" AND COLOR IS "+eagle.getColour());
		
		Bird parrot=new Parrot("GREEN", 30);
		parrot.fly();
		System.out.println("PARROT WEIGHT IS "+parrot.getWeight()+" AND COLOR IS "+parrot.getColour());
		
	}

}
