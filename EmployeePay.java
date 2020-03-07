public class EmployeePay{
	public static void main(String[] args){
		EmployeeCommissionedAndSalaried symo = new EmployeeCommissionedAndSalaried("Simon","Warui","21901367",7000000,0.05,180000);
		HourlyEmployee jos = new HourlyEmployee("Josphine","Nkatha","24567892",78,1000);
		
		System.out.printf("%n%n%s%n%n%s%n%n",symo,jos);
	}
}