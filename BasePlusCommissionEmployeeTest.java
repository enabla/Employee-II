public class BasePlusCommissionEmployeeTest{
	public static void main(String[] args){
		BasePlusCommissionEmployee1 jos = new BasePlusCommissionEmployee1("Josphine","Nkatha","25473047",45000000,0.03,30000);
		
		System.out.println("Josy's information details:%n");
		System.out.printf("%s %s%n","First name is",jos.getFirstName());
		System.out.printf("%s %s%n","Second name is",jos.getSecondName());
		System.out.printf("%s %s%n","Gross sales is",jos.getGrossSales());
		System.out.printf("%s %s%n","Rate of commission is",jos.getCommissionRate());
		System.out.printf("%s %s%n%n","Basic salary is",jos.getBaseSalary());
		
		jos.setBaseSalary(45000);
		
		System.out.printf("%s%n%s%n%n",
							"Josy's information as per the toString method",jos);
	}
}