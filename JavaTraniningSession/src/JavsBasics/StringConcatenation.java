package JavsBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// + is called concatenation oparator  
		//print ln is use for new line 
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c= 12.33;
		double d = 10.33;
				
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(c+d);
		
		System.out.println("hello world");
		
		System.out.println("the value of age:"+a);
		
		System.out.println("the value of age:"+b);
		
		System.out.println("the addition of a & b:"+(a+b));

	}

}
