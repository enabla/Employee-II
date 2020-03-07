public class EmployeeCommissionedAndSalaried extends EmployeeCommissioned{
	private double salary;
	
	public EmployeeCommissionedAndSalaried(String fName, String lName, String idNo, double sales, double commision, double salary){
		super(fName, lName, idNo, sales, commision);
		if(salary < 0.0){
			throw new IllegalArgumentException("The salary cannot be negative.");
		}
		this.salary = salary;
	}
	
	public void setSalary(double salary){
		if(salary < 0.0){
			throw new IllegalArgumentException("Salary cannot be negative.");
		}
		this.salary = salary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	@Override
	public double earning(){
		return (salary + super.earning());
	}
	
	@Override
	public String toString(){
		return String.format("%s%n%s: %.2f%n%s %.2f",super.toString(),"Salary", getSalary(), "Total pay", earning());
	}
}