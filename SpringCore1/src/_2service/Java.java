package _2service;

// Java Course (Implementation class of ICourse)
public class Java implements ICourse {

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Java Course is Purchased: " + amount);
        return true;
    }
}
