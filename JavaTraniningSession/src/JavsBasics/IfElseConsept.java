package JavsBasics;

public class IfElseConsept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 30;
		int b = 20;
		
		if (b>a) {
			System.out.println("b is gretter then a");
		}
		else {
			System.out.println("a is gretter then b");
		}
         // comparison operator
		//<> >= <= !=
		
		int c = 40;
		int d = 50;
		
		if (c==d) {
			System.out.println("c and d are equal ");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		// write  a logic to find  the highest number 
		
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
	//nested if -else
		
		if (a1>b1 & a1>c1) { // false & false = false 
			System.out.println("a1 is gresterts");
		}
		else if (b1>c1) {
			System.out.println("b1 is the gretest");
		}
		else {
			System.out.println("c1 is the grestet ");
		}
		
		
	}

}
