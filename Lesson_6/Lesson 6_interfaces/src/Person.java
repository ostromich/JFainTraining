
public class Person implements Payable{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName(){
		
		return "Person's name is " + name;
	}
	
	public boolean increasePay(int percent) {
		//System.out.println("Increasing salary by " + percent + "%. "+ getName());
		return true;
	}
	
	
}
