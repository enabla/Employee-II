public class CommisionPay{
	private final String fName;
	private final String lName;
	private final String idNo;
	private double sales;
	private double percentCommision;
	
	public CommisionPay(String fName, String lName, String idNo, double sales, double percentCommision){
		if(sales < 0.0){
			throw new IllegalArgumentException("Sales cannot be negative.");
		}
		
		if(percentCommision < 0.0 || percentCommision > 1.0){
			throw new IllegalArgumentException("Percentage commission must lie between 0 and 100 percent");
		}
		
		this.fName = fName;
		this.lName = lName;
		this.idNo = idNo;
		this.sales = sales;
		this.percentCommision = percentCommision;
	}
	
	public String getFName(){
		return fName;
	}
	
	public String getLName(){
		return lName;
	}
	
	public String getIdNo(){
		return idNo;
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
	
	public void setCommission(double percentCommision){
		if(percentCommision < 0.0 || percentCommision > 1.0){
			throw new IllegalArgumentException("The rate of commission has to be between 0 and 100 percent.");
		}
		this.percentCommision = percentCommision;
	}
	
	public double getCommissionRate(){
		return percentCommision;
	}
	
	public double pay(){
		return percentCommision * sales;
	}
	
	public String toString(){
		return String.format("%s: %s %s%n%s: %s%n%s: %.1f %s%n%s; %.2f%n",
							"Names",getFName(),getLName(),
							"ID No", getIdNo(),
							"Percantage Commission",100*getCommissionRate(),"Percent",
							"Total Commission", pay());
	}
}