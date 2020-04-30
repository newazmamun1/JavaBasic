package OOPConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
		//Main method can be overlaod

	}
    // Method Overloading: when method name is same with different argument or 
	//   input parameter with in same class
	//duplicate method not allowed 
	//We cannot create method inside a method
	
     public void sum() { // 0 input  parameter 
	     System.out.println("Sum method --Zero parameter ");
     }
     public void sum(int i) { // 1 input parameter 
    	 System.out.println("Sum Method ---1 input parameter");
    	 System.out.println(i);
     }
     public void sum(int  k, int n) { //2 input parameter 
    	 System.out.println("Sum method -- 2 input paratemter");
    	 System.out.println(k+n);
     }
}
