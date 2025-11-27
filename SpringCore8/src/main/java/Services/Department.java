package Services;

public class Department {

    // Properties of Department (data members)
    private Integer dpNo;
    private String dpName;

    // Constructor that Spring will use for constructor injection
    public Department(Integer dpNo, String dpName) {
        this.dpNo = dpNo;     // assigning department number
        this.dpName = dpName; // assigning department name
    }

    // Used to print object details when System.out.println() is called
    @Override
    public String toString() {
        return "Department [dpNo=" + dpNo + ", dpName=" + dpName + "]";
    }
}
