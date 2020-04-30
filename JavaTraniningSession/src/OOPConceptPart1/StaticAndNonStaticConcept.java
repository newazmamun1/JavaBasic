package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	// global vars: the scope of global vars will be available 
	//across all the functions with some condition .
	// What is condition ? 
	//If it is static var , we can call directly or by class name
	// If it is non static , we have to crate object & call obj.sendMail method 
	
	
	String name = "Tom"; //Non static global vari
	static int age = 25; //static global vari

	public static void main(String[] args) {
		//how to call static method
		//1. direct calling 
		sum();
		//2.calling by classname 
		StaticAndNonStaticConcept.sum();
		
		// how to call static variable ?
		System.out.println(age); // direct call
		System.out.println(StaticAndNonStaticConcept.age); // called by classname
		
	     //How to call non- static variable ?
		// by create the obj 
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMain();
		System.out.println(obj.name);
		
		// can i access static method by using object reference ? Yes
		obj.sum(); // warning will be given 

	}
	
	public void sendMain() { // Non static method 
		System.out.println("Send main Method ");
	}
	
	public static void sum () { // static method 
		System.out.println("Send Method ");
		
	}

}
