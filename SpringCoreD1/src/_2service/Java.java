package _2service;

public class Java implements ICourse {

	@Override
	public Boolean getCourse(int amount) {
	    System.out.println("Java Course is Purchased: " + amount);
		return true;
	}

}
