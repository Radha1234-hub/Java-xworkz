class Character{
	
	public static void main (String args[]){
	
		System.out.println("Main Started");
	
		
		String characters[] = {"Lord Shiva" , "Goddess Parvati" , "Lord Ganesha" , "Lord Kartikeya" , "Nandi" , "Sage Narada" , "Demon Tarakasura" , "Ravana" , "Tripurasura" , "Lord Vishnu"};
		
		System.out.println("Total no of characters available are :" +characters.length);
		
		System.out.println("The characters in Shiva series are");
		
		//System.out.println(characters[0] + " " + characters[1] + " " + characters[2] + " " + characters[3] + " " + characters[4] + " " + characters[5] + " " + characters[6] + " " + characters[7] + " " + characters[8] + " " +characters[9]);
		
		for (String character:characters) {
	
	System.out.println(character);
	
	}
		
		System.out.println("Main ended");
	
	}

}