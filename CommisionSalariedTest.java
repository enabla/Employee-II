public class CommisionSalariedTest{
	public static void main(String[] args){
		CommisionSalaried employee1 = new CommisionSalaried("Simon","Warui","21901367",6000000.0,0.05,240000);
		
		System.out.printf("%n%n%s%n%s%n%n","Initial Sales Earnings:",employee1);
		
		employee1.setCommission(0.1);
		employee1.setSales(8000000);
		employee1.setSalary(100000);
		System.out.printf("%s%n%s%n%n","Updated Earnings:",employee1);
	}
}