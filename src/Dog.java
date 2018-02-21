
public class Dog extends Animals {

	public void DigHole() {

		System.out.println("I can dig a hole.");
	}

	public Dog() {
		// TODO Auto-generated constructor stub
		super();
		setSound("Hav Hav");
		flyingType = new CantFly();
	}
}
