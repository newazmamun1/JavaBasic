package JavsBasics;

public class B extends A {
	public B() {
		super();
		// super(10);
		// super(10,20); // super keyword used to call parents class constructor

		// System.out.println("Child class const");
	}

	public B(int i) {
		super(10);

		// System.out.println("Parents class const defined ");
	}

	public B(int i, int j) {
		super(10, 20);

		// System.out.println("Parents class const defined double ");
	}

	public static void main(String args[]) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

	}

}