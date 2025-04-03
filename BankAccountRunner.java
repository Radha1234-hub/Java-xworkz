class BankAccountRunner{
	

public static void main (String args[]){

	BankAccount.getbalance();
	
	System.out.println("The available balance is:");
	
	
	BankAccount.credit(800);
	BankAccount.getbalance();
	
	
	
	BankAccount.debit(200);
	BankAccount.getbalance();
	
	
}




}