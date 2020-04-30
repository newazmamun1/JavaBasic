package JavsBasics;

public class ConstructorConcept {
	
	//class entity that used defined some class feature while creating object-- 
	//in the class global variable in the form of object 
	// having having some proparty 
	// it should be same class name 
	// no static or no return type 
	// constructor can be overloaded 
	
	public ConstructorConcept(){
		System.out.println("Deafault const");
			
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single parameter constructor");
		System.out.println("The value of i "+i);
		
	}
	
	public ConstructorConcept(int i ,int j) {
		System.out.println("two parameter constructor");
		System.out.println("The value of i "+i);
		System.out.println("The value of i "+j);
	
	}
	

	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		

	}

}
