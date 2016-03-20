
public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tax t = new Tax();
		NJTax t = new NJTax(500000, 2, "New York");
		
	/*	t.incomeGross = 50000;
		t.numberOfDependents= 2;
		t.state = "Alabama";
	*/	
		double yourTax = t.calcTax();
		double tnj = t.taxForNJ(yourTax);
		
		System.out.println("Your tax is  " + tnj +" in state " + t.state);

	}

}
