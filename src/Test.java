
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animals comar = new Dog();
		Animals tweety = new Bird();
		
		System.out.println("Dog: " + comar.tryToFly());
		System.out.println("Bird: " + tweety.tryToFly());
		
        // This allows dynamic changes for flyingType

		comar.setFlySkill(new ItFlys());
		System.out.println("Dog: " + comar.tryToFly());

	}

}
