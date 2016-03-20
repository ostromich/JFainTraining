
public class NJTax extends Tax {
	NJTax(double ingr, int nofdep, String st) {
		super(ingr, nofdep, st);
		// TODO Auto-generated constructor stub
	}

	public double taxForNJ(double tax){
		
		return tax-500;
	}
	
	/*public double calcTax(){
        
        if (incomeGross < 50000.00){
        	return incomeGross*0.10/numberOfDependents;
    		
        } 
        else
        	{
        		return incomeGross*0.13/numberOfDependents;
        		
        	}
			
	}*/ //this example overriding public double calcTax() of class Tax in class NJTax
	
}
