
public class Tax {
	double incomeGross;
	int numberOfDependents;
	String state;
	
	Tax(double ingr , int nofdep , String st) { 
		incomeGross= ingr;
		numberOfDependents = nofdep;
		state = st;
		
	}
		
	
	public double calcTax(){
                
        if (incomeGross < 50000.00){
        	return incomeGross*0.06/numberOfDependents;
    		
        } 
        else
        	{
        		return incomeGross*0.08/numberOfDependents;
        		
        	}
			
	}
	

}
