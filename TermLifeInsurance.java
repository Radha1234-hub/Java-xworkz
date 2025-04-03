class TermLifeInsurance{

	public static double search(String insuranceName){
	
	double termPrice= 0.0;
	
	if (insuranceName=="LIC"){
		termPrice = 10000.00;
		
	}
	
	 else if (insuranceName== "Max life insurance "){
		termPrice = 9000.00;
		}
		
	else if (insuranceName== " SBI life insurance"){
		termPrice = 8000.00;
		}
	
	else if (insuranceName== " TATA life insurence"){
		termPrice = 7000.00;
		}
	
	else if (insuranceName==" Kotak life insurance"){
		termPrice = 8000.00;
		}
	
	else if (insuranceName=="Axis life insurance "){
		termPrice = 9900.00;
		}
	
	else if (insuranceName=="HDFC life insurance "){
		termPrice = 9999.00;
		}
	
	else if (insuranceName== " ICICI life insurance"){
		termPrice = 93400.00;
		}
	
	else if (insuranceName=="Smart life insurance"){
		termPrice = 9780.00;
		}
	
	else if (insuranceName== " Bajaj life insurance"){
		termPrice = 9000.00;
		}
	
	else
	{
		
		System.out.println("Provide valid insurance name");
	}
	
	return termPrice;
	
}}











