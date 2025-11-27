package _2service;

// Target class (Customer)
public class Telusko {

    // Dependency: ICourse (Java / SpringBoot)
    private ICourse course;

    // Default Constructor
    public Telusko() {}

    // Constructor Injection
    public Telusko(ICourse course) {
        this.course = course;
    }

    // Setter Injection
    public void setCourse(ICourse course) {
        this.course = course;
    }

    // Business logic method
    public Boolean buythecourse(Double amount) {
        return course.getTheCourse(amount);
    }
}
