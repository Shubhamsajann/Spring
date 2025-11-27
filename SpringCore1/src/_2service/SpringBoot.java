package _2service;

// Spring Boot Course (Implementation class of ICourse)
public class SpringBoot implements ICourse {

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Spring Boot Course is Purchased: " + amount);
        return true;
    }
}
