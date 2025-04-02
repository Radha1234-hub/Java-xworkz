class Character1{

	static String characters[] = {"Lord Shiva" , "Goddess Parvati" , "Lord Ganesha" , "Lord Kartikeya" , "Nandi" , "Sage Narada" , "Demon Tarakasura" , "Ravana" , "Tripurasura" , "Lord Vishnu"};
	
	
	public static void main (String args[]){
	
	System.out.println("Main Started");
	
	getCharacters();
	
	System.out.println("Main ended");
	
	}
	
	
	public static void getCharacters(){
	
	System.out.println("getCharacters Started");
	
	System.out.println("List of the characters are:");
	
	for (String character:characters) {
	
	System.out.println(character);
	
	}
	
	
	
	
	
	}
	
}		
