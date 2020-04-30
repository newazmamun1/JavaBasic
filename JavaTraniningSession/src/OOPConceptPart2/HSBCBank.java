package OOPConceptPart2;

public class HSBCBank implements USBank , BrazilBank { // we are achieving multiple inheritance
	
	// Is.a relationship 
	
	//if a class is implemented any interface , then its 
	//mandatory to define/override all the method of interface 
	

	
	// overriding from USBank 
	public void credit () {
		System.out.println("hsbc*** Credit ");
	}
	public void debit () {
		System.out.println("hsbc*** debit");
	}
	public void transferMoney () {
		System.out.println("hsbc *** transferMoney");
		
	}
	
	// Separate method of HSBCBank Calss
	public void educationLoan() {
		System.out.println("hsbc*** Education laon");
		
	}
	public void carLoan() {
		System.out.println("hsbc***Car loan");
	}
	
	//BrazilBank method : Overriding from BrazilBank
	public void mitualFund() {
		System.out.println("hsbc ** Brazil bank ");
	}
}
