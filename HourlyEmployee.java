public class HourlyEmployee extends Employee{
	private double wage;
	private int hours;
	
	public HourlyEmployee(String fName, String lName, String idNo, int hours, double wage){
		super(fName, lName, idNo);
		if(wage < 0.0){
			throw new IllegalArgumentException("Wages cannot be negative");
		}
		if(hours < 0 || hours > 168){
			throw new IllegalArgumentException("Hours in a week lie between 0 and 168.");
		}
		this.hours = hours;
		this.wage = wage;
	}
	
	public void setWage(double wage){
		if(wage < 0.0){
			throw new IllegalArgumentException("Wages cannot be negative.");
		}
		this.wage = wage;
	}
	
	public double getWage(){
		return wage;
	}
	
	public void setHours(int hours){
		if(hours < 0 || hours > 168){
			throw new IllegalArgumentException("A week has between 0 to 168 hours.");
		}
		this.hours = hours;
	}
	
	public int getHours(){
		return hours;
	}
	
	public double earnings(){
		return getHours() > 56? getWage()*getHours()+1.5*getWage()*(getHours() - 56) : getWage()*getHours();
	}
	
	@Override
	public String toString(){
		return String.format("%s%n%s: %.2f%n%s: %d%n%n%s: %.2f",
							super.toString(), 
							"Hourly Pay", getWage(),
							"Hours Worked",getHours(),
							"Total Pay",earnings());
	}
}