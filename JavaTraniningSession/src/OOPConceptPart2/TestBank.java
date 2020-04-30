package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		//USBank b = new USbank; we can not craete object 
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		hs.mitualFund();
		
		//dynamic polymorphisom 
		//child class object can be refer by parents interface reference var
		
		USBank b =new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		

	}

}
