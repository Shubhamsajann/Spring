package Services;

public class Employee {

    // Properties of Employee bean
    private Integer empid;
    private String name;
    private Double salary;
    private String city;

    // Parameterized constructor
    // Spring injects constructor values defined in applicationConfig.xml
    public Employee(Integer empid, String name, Double salary, String city) {
        super();
        System.out.println("Employee Bean is created");  // Constructor message
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    // toString() used for printing object details
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
    }

    // A simple business method
    public String employeeTask() {
        return "every Employee acts productive";
    }
}
