package Services;

public class Employee {

    // Employee properties (Spring injects using setter injection)
    private Integer empid;
    private String name;
    private Double salary;
    private String city;
    private Department depart;  // Has-A relationship (Employee → Department)

    // Default constructor
    // Spring calls this first before applying property injection
    public Employee() {
        super();
        System.out.println("Employee Bean Created");
    }

    // All setter methods (required for p: property injection)
    public Integer getEmpid() { return empid; }
    public void setEmpid(Integer empid) { this.empid = empid; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public Department getDepart() { return depart; }
    public void setDepart(Department depart) { this.depart = depart; }

    // Prints object in readable format
    @Override
    public String toString() {
        return "Employee [empid=" + empid +
                ", name=" + name +
                ", salary=" + salary +
                ", city=" + city +
                ", depart=" + depart + "]";
    }

    // Business method
    public String employeeTask() {
        return "every Employee acts productive";
    }
}
