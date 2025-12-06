package _2service;

public class Spring implements ICourse {

	@Override
	public Boolean getCourse(int amount) {
	    System.out.println("Spring Course is Purchased: " + amount);
		return true;
	}

}
