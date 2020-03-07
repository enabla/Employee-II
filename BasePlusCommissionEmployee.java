public class BasePlusCommissionEmployee{
	private final String firstName;
	private final String secondName;
	private final String idNo;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String secondName, String idNo, 
									double grossSales, double commissionRate, double baseSalary){
		if(grossSales < 0.0){
			throw new IllegalArgumentException("Gross sales cannot be negative.");
		}
		if(commissionRate < 0.0 || commissionRate >= 1.0){
			throw new IllegalArgumentException("Commission rate has to be at least 0 to less than 1.");
		}
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("You cannot earn a negative salary.");
		}
		this.firstName = firstName;
		this.secondName = secondName;
		this.idNo = idNo;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getSecondName(){
		return secondName;
	}
	
	public String getIdNo(){
		return idNo;
	}
	
	public double getGrossSales(){
		return grossSales;
	}
	
	public void setGrossSales(double grossSales){
		if(grossSales < 0.0){
			throw new IllegalArgumentException("Gross sales cannot be negative.");
		}
		this.grossSales = grossSales;
	}
	
	public double getCommission(){
		return commissionRate;
	}
	
	public void setCommission(double commissionRate){
		if(commissionRate < 0.0 || commissionRate >= 1.0){
			throw new IllegalArgumentException("Commission has to be between 0 and a number less than 1.");
		}
		this.commissionRate = commissionRate;
	}
	
	public double getBaseSalary(){
		return baseSalary;
	}
	
	public void setBaseSalary(double baseSalary){
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("Salary cannot be negative.");
		}
		this.baseSalary = baseSalary;
	}
	
	public double earnings(){
		return baseSalary + (grossSales*commissionRate);
	}
	
	@Override
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%n",
								"Employee Names",getFirstName(),secondName,
								"Emplyee Id",idNo,
								"Gross Sales",grossSales,
								"Commission Rate",commissionRate,
								"Base Salary",baseSalary);
	}
}