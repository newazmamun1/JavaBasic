package OOPConceptPart2;

public class TestCar {
	// Method OverRiding : 
	// when method is presents in parents class as well as in child class
	// with the same name and number of arguments , is called Method.Overiding 
	

	public static void main(String[] args) {
		// Create the object of BMW class in TestCar class
		
		// static polymorphism /compile.time polymorphism 
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("********");
		
		
		//Q: What is polymorphism ?
		// A: point to many method , meny method overriding. 
		//Number of argument we created inside the parents class &
		//as well Child class , we are acheving method overriding 
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("********");
		
		//Top casting 
		Car c1 = new BMW(); 
		// child class object can be reffered by parent class refference variable 
		// that is called dynamic polymorphisom or Run time polymorphism 
		c1.start();
		c1.stop();
		c1.refuel();
		
		// down casting is possible but it give an exception CalsscastException
		//BMW b1= (BMW)new Car();  
		
		

	}

}
