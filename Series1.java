class Series1{

	//Hindi Series
	static String hindiSeries[] = {"Sacred Games","Mirzapur", "Paatal Lok", "The Family Man", "Aarya" , "Aspirants" , "Panchayat", "Scam 1992" , "Made in Heaven" , "Kota Factory"};
	static String kannadaSeries[] = {"Sacred Face", "Hate You Romeo" , " Honeymoon" , "Inspector Karan" , "Ranna vs Sanna", "Ragini IPS" ,"Vittal Melsa" , "Siri" , "Agnisakshi", "Lakshmi Baramma"};
	static String malayalamSeries[] = { "Perilloor Premier League", "Thera Para" , " Master Peace" , "Kerala Crime Files" , "Scoot!" , "Just Married Things", "I Promise R.I.A" , "Plus 2 Class", "Utsaha Ithihasam" , "10-C"};
	static String englishSeries[] = {"Game of Thrones" , "Breaking Bad" , "Stranger Things" , "The Witcher" , "Sherlock" , "Friends" , "The Office (US)" , "Money Heist" , "The Boys" , "House of the Dragon"};

	public static void main(String args[]){
	
	System.out.println("Main Started");
	
	getHindiSeries();
	getKannadaSeries();
	getMalayalamSeries();
	getEnglishSeries();
	
	System.out.println("Main ended");
	
	}


  // Hindi Series
	public static void getHindiSeries(){
	
	System.out.println("getHindiSeries started");
	
	System.out.println("List of the hindi series are:");
	
	for(String hindiSerial:hindiSeries){
	
	System.out.println(hindiSerial);
	
	}
	
	System.out.println("getHindiSeries ended");
	
	}


	// Kannada series
	
	public static void getKannadaSeries(){
	
	System.out.println("getkannadaSeries started");
	
	System.out.println("List of the kannada series are:");
	
	for(String kannadaSerial:kannadaSeries){
	
	System.out.println(kannadaSerial);
	
	}
	
	System.out.println("getKannadaSeries ended");
	
	}
	
	
	//Malayalam series
	
	public static void getMalayalamSeries(){
	
	System.out.println("getMalayalamSeries started");
	
	System.out.println("List of the malayalam series are:");
	
	for(String malayalamSerial:malayalamSeries){
	
	System.out.println(malayalamSerial);
	
	}
	
	System.out.println("getKannadaSeries ended");
	
	}


  //English series
  
  public static void getEnglishSeries(){
	
	System.out.println("getEnglishSeries started");
	
	System.out.println("List of the english series are:");
	
	for(String englishSerial:englishSeries){
	
	System.out.println(englishSerial);
	
	}
	
	System.out.println("getEnglishSeries ended");
	
	}
  
 }