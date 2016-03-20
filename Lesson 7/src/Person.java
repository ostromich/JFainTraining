
abstract public class Person{
	private String name; final int INCREASE_CAP = 20;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName(){
		
		return "Person's name is " + name;
	}
	
	public void changeAddress(String address){
		System.out.println("New address is " + address + " " + name);
				
	}
	public void giveDayOff() {
		System.out.println("Givving a day off to  " +  name);
		
	}
	
	abstract public boolean increasePay(int percent); //abstract method
	
	public void promote(int percent) {
		System.out.println("Promotion a worker...  " +  name);
		giveDayOff();
		
		//calling abstract method
		increasePay(percent);
			
	}
	
	
	
}
