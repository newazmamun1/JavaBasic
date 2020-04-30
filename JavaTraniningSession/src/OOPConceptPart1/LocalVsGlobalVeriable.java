package OOPConceptPart1;

public class LocalVsGlobalVeriable {
	
	// Global variable ---Class variable 
	String name = "Tom" ; 
	int age = 25; 

	public static void main(String[] args) {
		
		int i = 10; // local var for main method 
		System.out.println(i);
		
		LocalVsGlobalVeriable obj = new LocalVsGlobalVeriable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
		

	}
	public void  sum() {
		int i= 10; //local vai for sum method 
		int j = 20;
		
	}

}
