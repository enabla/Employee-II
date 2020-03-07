public class CommissionEmployee extends Object{
	private final String firstName;
	private final String secondName;
	private final String idNo;
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String secondName, String idNo, double grossSales, double commissionRate){
		if(grossSales < 0.0){
			throw new IllegalArgumentException("Gross sales cannot be negative.");
		}
		if(commissionRate < 0.0 || commissionRate >= 1){
			throw new IllegalArgumentException("Commission rate must range from 0 to a figure less than 1.");
		}
		
		this.firstName = firstName;
		this.secondName = secondName;
		this.idNo = idNo;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
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
		if(grossSales < 0){
			throw new IllegalArgumentException("Gross Sales cannot be negative.");
		}
		this.grossSales = grossSales;
	}
	
	public double getCommissionRate(){
		return commissionRate;
	}
	
	public void setCommissionRate(double commissionRate){
		if(commissionRate < 0 || commissionRate >= 1){
			throw new IllegalArgumentException("Commission rate must be at least zero and less than 1.");
		}
		this.commissionRate = commissionRate;
	}
	
	public double earnings(){
		return getCommissionRate()*getGrossSales();
	}
	
	@Override
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
							"Employee's names",getFirstName(),getSecondName(),
							"Id Number", getIdNo(),
							"Commission Rate",getCommissionRate(),
							"Gross Sales",getGrossSales());
	}
}