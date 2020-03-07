public class CommisionSalaried extends CommisionPay{
	private double salary;
	
	public CommisionSalaried(String fName, String lName, String idNo, double sales, double percentCommision, double salary){
		super(fName, lName, idNo, sales, percentCommision);
		
		if(salary < 0.0){
			throw new IllegalArgumentException("Salary cannot be negative.");
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
	public double pay(){
		return salary + super.pay();
	}
	
	@Override
	public String toString(){
		return String.format("%s%s: %.2f%n%n%s: %.2f%n",
							super.toString(),
							"Monthly Salary",salary,
							"Total Earnings", pay());
	}
}