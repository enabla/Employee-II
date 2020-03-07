public class BasePlusCommissionEmployee1 extends CommissionEmployee{
	private double baseSalary;
	
	public BasePlusCommissionEmployee1(String firstName, String secondName, String idNo,
	double grossSales, double commissionRate, double baseSalary){
			
			super(firstName, secondName, idNo, grossSales, commissionRate);
		
			if(baseSalary < 0.0){
				throw new IllegalArgumentException("Salary cannot be negative.");
			}
			this.baseSalary = baseSalary;
	}
		
	//Set basic salary
	public void setBaseSalary(double baseSalary){
		if(baseSalary < 0){
			throw new IllegalArgumentException("Salary cannot be negative.");
		}
		this.baseSalary = baseSalary;
	}
	
	//Get basic salary
	public double getBaseSalary(){
		return baseSalary;
	}
	
	//Override total earnings
	@Override
	public double earnings(){
		return getBaseSalary() + super.earnings());
	}
	
	//Override toString method
	@Override
	public String toString(){
		return String.format("%n%n%s:%n%s%n%s: %.2f%n%n",
							"Employee's information",
							super.toString(),
							"Basic Salary",getBaseSalary());
	}
}