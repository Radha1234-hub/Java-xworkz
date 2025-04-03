class Bill {

	String billReferenceNo;
	String billIssuedate;
	String billDueDate;
	double billAmount;
	boolean isBillOverDue;
	boolean isBillPaid;
	String seriveProvider;
	

	//no args constructor
	Bill(){
	this ("S234"," 25-mar-2025" ,"30-mar-2025",9000.0,false,false, "Jio" );
	System.out.println("The no args constructor is invoked");
	
	}
	
	//parameterized constructor
	Bill(String billReferenceNo,String billIssuedate,String billDueDate,double billAmount,boolean isBillOverDue ,boolean isBillPaid ,String seriveProvider){
	
	System.out.println("The parameterized constructor is invoked");
	
	this.billReferenceNo = billReferenceNo;
	this.billIssuedate = billIssuedate;
	this.billDueDate = billDueDate;
	this.billAmount = billAmount;
	this.isBillOverDue = isBillOverDue;
	this.isBillPaid = isBillPaid;
	this.seriveProvider = seriveProvider;
	}
	
	public void showDetails(){
	System.out.println("The bill is ready");
	System.out.println("Bill reference no:"+this.billReferenceNo);
	System.out.println("Bill issue date:"+this.billIssuedate);
	System.out.println("Bill due data :"+this.billDueDate);
	System.out.println("Is bill over due:"+this.isBillOverDue);
	System.out.println("Is bill paid:"+this.isBillPaid);
	System.out.println("Service provider:"+this.seriveProvider);
	
	}
	







































}