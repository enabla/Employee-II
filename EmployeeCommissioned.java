public class EmployeeCommissioned extends Employee{
	private double sales;
	private double commision;
	
	public EmployeeCommissioned(String fName, String lName, String idNo, double sales, double commision){
		super(fName,lName,idNo);
		
		if(sales < 0.0){
			throw new IllegalArgumentException("Sales cannot be negative.");
		}
		
		if(commision < 0.0 || commision > 1.0){
			throw new IllegalArgumentException("Commmision has to lie between 0 - 100 percent.");
		}
		
		this.sales = sales;
		this.commision = commision;
	}
	
	public void setSales(double sales){
		if(sales < 0.0){
			throw new IllegalArgumentException("Sales cannot be negative.");
		}
		this.sales = sales;
	}
	
	public double getSales(){
		return sales;
	}
	
	public void setCommision(double commision){
		if(commision < 0.0 || commision > 1.0){
			throw new IllegalArgumentException("Percentage commision has to lie between 0 and 100.");
		}
		this.commision = commision;
	}
	
	public double getCommision(){
		return commision;
	}
	
	public double earning(){
		return (sales * commision);
	}
	
	@Override
	public String toString(){
		return String.format("%s%n%s: %.2f%n%s: %.2f %s%n%s: %.2f",
							super.toString(),
							"Total Sales",getSales(),
							"Percent Commision",100*getCommision(),"percent",
							"Total Commision", earning());
	}
}