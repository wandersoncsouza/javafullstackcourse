package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - ((grossSalary * tax) / 100);
    }
    public void increaseSalary(double percentage){
        this.grossSalary = this.grossSalary + ((grossSalary * percentage) /100);
    }
    public String toString(){
        return name 
            + ", Salary R$:"
            + String.format("%.2f", grossSalary)
            + ", the netsalary is: "
            + String.format("%.2f", netSalary());  
    }
}
