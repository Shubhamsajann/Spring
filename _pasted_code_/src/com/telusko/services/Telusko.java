package com.telusko.services;

// Spring Annotations
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
    @Service:
    -----------
    - Marks this class as a Spring bean.
    - Spring will automatically create an object of this class.
*/
@Service
public class Telusko {

    /*
        Dependency: ICourse
        -------------------
        - Telusko depends on an object that implements ICourse.
        - This can be JavaCourse or SpringBootCourse.

        @Autowired:
            - Tells Spring to inject a dependency automatically.

        @Qualifier("java"):
            - When multiple beans implement ICourse,
              this tells Spring to inject the bean named "java".
    */
    @Autowired
    @Qualifier("java")
    private ICourse course;

    /*
        Default Constructor
        -------------------
        - Runs when Telusko bean is created.
        - Spring calls this automatically because @Service creates the bean.
    */
    public Telusko() {
        super();
        System.out.println("Telusko Bean is Created");
    }


    /*
        Constructor Injection (Commented Out)
        -------------------------------------
        - You can inject dependencies using constructor.
        - Spring runs this constructor and passes the matching bean.

        @Autowired on constructor:
            - Spring will use this constructor to inject 'course'.

        @Qualifier("java"):
            - Inject specifically the "java" bean.
    */
//    @Autowired
//    public Telusko(@Qualifier("java") ICourse course) {
//        System.out.println("Constructor Injection");
//        this.course = course;
//    }


    /*
        Setter Injection
        ----------------
        - Dependency can also be provided using setter method.
        - Annotation-based setter injection is shown here (commented).
        - If enabled, Spring will call setCourse() and pass the correct bean.
    */
//    @Autowired
//    @Qualifier("springBoot")
    public void setCourse(ICourse course) {
        System.out.println("Setter Injection");
        this.course = course;
    }

    /*
        Business Logic Method
        ---------------------
        - buythecourse() uses the injected ICourse object.
        - Calls getTheCourse() of whichever implementation was injected.
        - Returns true/false based on course purchase logic.
    */
    public Boolean buythecourse(Double amount) {
        return course.getTheCourse(amount);
    }
}
