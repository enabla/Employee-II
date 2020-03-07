public class CommissionEmployeeTest{
	public static void main(String[] args){
		CommissionEmployee symo = new CommissionEmployee("Simon","Warui","21901367",40000000,0.05);
		System.out.println(
			"Simon's information obtained by get methods:");
		System.out.printf("%n%s %s","First name is:",symo.getFirstName());
		System.out.printf("%n%s %s","Last name is: ",symo.getSecondName());
		System.out.printf("%n%s %s","ID. Number is: ",symo.getIdNo());
		System.out.printf("%n%s %.2f","Commission rate is: ",symo.getCommissionRate());
		System.out.printf("%n%s %.2f%n","Total sales is: ",symo.getGrossSales());
		
		symo.setGrossSales(50000000);
		symo.setCommissionRate(0.06);
		
		System.out.printf("%n%s%n%s%n%n","Simon's updated information obtained by the toString method:",symo);
	}
}