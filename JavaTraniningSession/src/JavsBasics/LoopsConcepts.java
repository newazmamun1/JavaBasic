package JavsBasics;

public class LoopsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. while loop
		// disadvantage : it will gerenate infinite loop if we dont give incremental /decremation 
		
		int i = 1; // intialization 
		while(i<10) { // condition 
			System.out.println(i);
			i=i+1; // incremntal /decremental 
		}
		
		System.out.println("**********");
		
	// 2. for loop	
		//1-10
		for (int j=1;j<=10;j++ ) { // intialization , conditional part , incremental 
			System.out.println(j);
		}
		// for 10-1
		
		System.out.println("**********"); 
		
         for (int k=10 ;k>=1;k--) {
        	 System.out.println(k);
         }
         System.out.println("**********"); 
         
         for (int m=10;m>=-10;m--) {
        	 System.out.println(m);
         }
         
         
         
         
         
	}

}
