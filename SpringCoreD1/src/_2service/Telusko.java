package _2service;

public class Telusko {
	
	private ICourse icourse;

	

	public Telusko() {
		
	}
	public Telusko(ICourse icourse) {
		this.icourse=icourse;
		
	}
	public void setIcourse(ICourse icourse) {
		this.icourse = icourse;
	}
	
	public Boolean buyCourse(int amount) {
		return icourse.getCourse(amount);
		
	}
	
	

}
