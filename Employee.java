public class Employee{
	private final String fName;
	private final String lName;
	private final String idNo;
	
	public Employee(String fName, String lName, String idNo){
		this.fName = fName;
		this.lName = lName;
		this.idNo = idNo;
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
	
	public String toString(){
		return String.format("These are the employee's details:%nNames: %s %s%nId No.: %s",
							getFName(), getLName(), getIdNo());
	}
}