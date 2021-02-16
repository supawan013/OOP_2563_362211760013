package LAB8;

public class Employee extends Person{
    //Class Atrribute
    private String empID;
    private String position;
    private double salary;

    //constructor

    public Employee() {
    }

    public Employee(String pid, String name, int age, String gender, String tel, String empID, String position, double salary) {

        //calling constructor of super class
        super(pid, name, age, gender, tel);
        this.empID = empID;
        this.position = position;
        this.salary = salary;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}
