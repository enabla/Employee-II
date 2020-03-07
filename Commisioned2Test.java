public class Commisioned2Test{
	public static void main(String[] args){
		CommisionPay chiku = new CommisionPay("Brenda","Wanjiku","5745983",6000000.0,0.07);
		Commisioned2 employee2 = new Commisioned2(chiku,90000.0);
		System.out.printf("%n%n%s%n%n", employee2);
	}
}