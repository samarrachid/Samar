package exercises;

public class Employee {
	int id;
	String firstName;
	String lastName;
	int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getID() {
		
		return id;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public String getName() {
		
		return firstName + lastName;
	}
	
	public int getSalary() {
		
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		
		return salary * 12;
	}
// 
//	public int raiseSalary() {
//		int increase = 0;
//		System.out.println(increase);
//		int newSalary = 800 + increase;
	
	
//		return newSalary;
//	}
	
	public String toString() {
		return "Employee[ id = " + getID() + "name = " + getName() + "salary= " + getSalary();
	}
	
	public static void main(String[] args) {
		Employee em = new Employee(123, "dania", "Rachid", 800);
		
		System.out.println(em.getSalary());
		
//		System.out.println(em.raiseSalary());
		System.out.println(em.getAnnualSalary());
		
	}
}
