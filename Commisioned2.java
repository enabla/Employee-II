public class Commisioned2{
	private CommisionPay emp;
	private double salary;
	
	public Commisioned2(CommisionPay emp, double salary){
		if(salary < 0.0){
			throw new IllegalArgumentException("Salary cannot be negative.");
		}
		this.emp = emp;
		this.salary = salary;
	}
	
	public void setSalary(double salary){
		if(salary < 0.0){
			throw new IllegalArgumentException("The salary cannot be negative.");
		}
		this.salary = salary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public double payment(){
		return salary + emp.pay();
	}
	
	public String toString(){
		return String.format("%s%s: %.2f%n%s: %.2f%n",
							emp,
							"Salary",getSalary(),
							"Total Pay",payment());
	}
}