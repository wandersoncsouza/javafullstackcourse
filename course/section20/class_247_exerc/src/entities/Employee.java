package entities;

public class Employee {
    private String name;
    private String email;
    private Double salary;


    //CONSTRUCTORS
    public Employee() {
    }
    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }
    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    // TOSTRING
    @Override
    public String toString() {
        return "Employee data: Name:" + name + ", e-mail:" + email + ", salary" + String.format("%.2f", salary);
    }
    
}
