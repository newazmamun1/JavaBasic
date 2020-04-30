package OOPConceptPart1;

public class FunctionsInJave {
  // main method ---> starting point of execution 
	public static void main(String[] args) {
	
		FunctionsInJave obj = new FunctionsInJave();
		// one object will be created , obj is the reference variable ,refereing to the object 
		// after creating the object , the copy of all non static method will be given to the objcet 
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1= obj.qa();
		System.out.println(s1);
		
		int div= obj.division(30, 10);
		System.out.println(div);
		
	}	
	//Q: why main method is void ?
		// because ,we never write return statement inside the method .	
	
	//non static method		
		// function & method are same 
		
		//3 type
		
		// void --does not return any value 
		// return type = void 
	
	
		
		public void test() { // no input , no out put 
			System.out.println("test method ");
		}
		
        // return type = int 
		public int pqr() { // no input , some out put 
			System.out.println("PQR method");
			int a = 10; 
			int b= 20;
			int c= a+b;
			
			return c;
		}
	     // return type string 
		public String  qa () { // no input , some output 
			System.out.println("QA method");
			String s = "Selenium";
			
			return s;
		}
		// return type --int 
        // x, y -- input parameter /arguments 
		public int division (int x, int y ) {
			System.out.println("division method ");
			int d = x/y;
			
			return d; 
		}
	}
