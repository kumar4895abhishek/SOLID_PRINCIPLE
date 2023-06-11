package bird2;

public class penguin extends Bird implements swim,nonflyable {

	public penguin(String colour, Double weight) {
		super(colour, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSwimming() {
		System.out.println("PENGUIN CAN SWIM");
		
	}

	@Override
	public void cantFly() {
		System.out.println("PENGUIN CANNOT FLY");
		
	}

	@Override
	void eat() {
		System.out.println("PENGUIN CAN EAT EVERY BIRD CAN EAT");
		
	}

	

}
