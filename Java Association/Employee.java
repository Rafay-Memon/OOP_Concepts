public class Employee {
    private String name;
    private double salary;
    private Company company;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
}