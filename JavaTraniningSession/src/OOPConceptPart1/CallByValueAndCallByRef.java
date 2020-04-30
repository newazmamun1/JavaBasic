package OOPConceptPart1;

public class CallByValueAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x = 10;
		int y = 20;
		obj.testSum(10, 20);// call by value or pass by bvalue 
		
		obj.p = 50;
		obj.q= 60;
		
		obj.swap(obj);
		
		//after swap --- p = 60 and q = 50
		System.out.println(obj.p);
		System.out.println(obj.q);
		

	}
	
	
	public int  testSum(int a, int b ) {
		a = 30;
		b= 40;
		int c= a+b;
		return c;
		
	}
	
	// call by reference 
	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp = t.p; //temp = 50
		t.p= t.q; // t.p = 60
		t.q = temp; // t.q = 50
		
	}
	 // Q:what is diffence between callbyvalue and Callby reference ?
     //Is it possible callby reffrence in Jave  ? 
	 //Yes , it is possible by using obj reference. 


}
