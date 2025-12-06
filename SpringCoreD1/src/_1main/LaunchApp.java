package _1main;

import _2service.Java;
import _2service.Telusko;

public class LaunchApp {
	public static void main(String[] args) {
		
		
		Telusko t  =  new Telusko(new Java());
	    t.setIcourse(new Java());
		
	    Boolean b = t.buyCourse(55);
	    
	    if(b ) {
	    	System.out.println("Course Purchased");
	    }
	    else {
	    	 System.out.println("Failed to purchase");
	    }
	    
	}

}
