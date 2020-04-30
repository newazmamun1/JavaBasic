package OOPConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit() ;
	
	public void debit () ;
	
	public void transferMoney () ;
	
	// only method declaration 
	// no method body = only method prototype
	// interface , we declare the variable are by default static in nature
	// variable value will not be change , its final/constant in nature .
	// no static method in interface 
	// no main method
	// we can not create the object of interface 
	// interface is  abstract in nature 
	
	
}
