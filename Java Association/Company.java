public class Company {
    private String name;
    private Employee[] employees;
    private int employeeCount;
    
    public Company(String name, int capacity) {
        this.name = name;
        this.employees = new Employee[capacity];
        this.employeeCount = 0;
    }
    
    public void addEmployee(Employee employee) {
        if (this.employeeCount < this.employees.length) {
            this.employees[this.employeeCount++] = employee;
        } else {
            System.out.println("Maximum capacity reached, cannot add employee.");
        }
    }
    
    public void removeEmployee(Employee employee) {
        for (int i = 0; i < this.employeeCount; i++) {
            if (this.employees[i].equals(employee)) {
                this.employees[i] = null;
                // Shift remaining employees to fill the gap
                for (int j = i + 1; j < this.employeeCount; j++) {
                    this.employees[j - 1] = this.employees[j];
                }
                this.employeeCount--;
                break;
            }
        }
    }
    
    public Employee[] getEmployees() {
        Employee[] result = new Employee[this.employeeCount];
        for (int i = 0; i < this.employeeCount; i++) {
            result[i] = this.employees[i];
        }
        return result;
    }
    
    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i < this.employeeCount; i++) {
            totalSalary += this.employees[i].getSalary();
        }
        return totalSalary;
    }
	
	public static void main(String [] args)
	{
		Employee e1 = new Employee("Rafay", 200000);
		Employee e2 = new Employee("Touqeer", 300000);
		Employee e3 = new Employee("Inaam", 250000);
		Company c = new Company("ABC company", 3);
		
		c.addEmployee(e1);
		c.addEmployee(e2);
		c.addEmployee(e3);
		
		Employee[] employees = c.getEmployees();
		System.out.println("Employee with their salaries in " + c.name + " are: ");
		for(int i = 0; i < employees.length; i++)
		{
			System.out.println("Employee " + (i+1) + " " + employees[i].getName() + " Salaray: " + employees[i].getSalary());
		}
	}
}