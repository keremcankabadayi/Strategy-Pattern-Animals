
public interface Flys {

	String fly();

}

class ItFlys implements Flys {

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I can fly AF.";
	}

}

class CantFly implements Flys {

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "I can't fly!";
	}

}
