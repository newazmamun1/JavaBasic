package JavsBasics;

public class A {
	
	public A() {
		System.out.println("Parent class constructor");
	}
	
	public A(int i) {// parameterized constructor 
		System.out.println("Parent class constructor with value of i "+i);

    }
	public A(int i,int j) {// parameterized constructor 
		System.out.println("Parent class constructor with value of i "+i);
		System.out.println("Parent class constructor with value of j "+j);
	}

}