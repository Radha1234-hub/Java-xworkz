class FreshMart1{
	
	static String groceries[] = {"Rice", "Wheat Flour" , "Sugar" , "Salt" , "Milk" , "Vegetables" , "Fruits" , "Cooking Oil" , "Lentils" , "Spices"};
	
	static String perfumes[] = {"Chanel No. 5 " , "Dior Sauvage" , "Creed Aventus" , "Tom Ford Black Orchid" , " YSL Black Opium", "Gucci Bloom", " Armani Acqua di Giò" , "Paco Rabanne 1 Million", "Jo Malone English Pear & Freesia" , "Maison Francis Kurkdjian Baccarat Rouge 540"};

	static String biscuits[] = {"Parle-G", "Britannia Good Day" , "Hide & Seek Fab" , "Marie Gold" , "Bourbon" , "Little Debbie Jim Jam" , "Oreo" , "Milk Bikis" , "Nice Time" , "50-50"};
	
	static String utensils[] ={"Tawa" , "Kadhai", "Pressure Cooker", "Ladle", "Chakla Belan", "Strainer", "Grater", "Masala Dabba", "Mortar & Pestle", "Idli Steamer"};
	
	static String vegetables[] = {"Potato", "Tomato", "Onion", "Brinjal", "Cauliflower", "Spinach", "Bottle Gourd", "Bitter Gourd", "Okra", "Cabbage"};
	
	
	public static void main (String args[]){
	
	System.out.println("Main Started");
	
	getGroceries();
	getPerfumes();
	getBiscuits();
	getUtensils();
	getVegetables();
	
	System.out.println("Main ended");
	
	}
	
	
	//groceries
	
	public static void getGroceries(){
	
	System.out.println("getGroceries started");
	
	System.out.println("List of the groceries are:");
	
	for(String grocery:groceries){
	
	System.out.println(grocery);
	
	}
	
	System.out.println("getGroceries ended");
	
	}
	
	
	
	//perfumes
	
	public static void getPerfumes(){
	
	System.out.println("getPerfumes started");
	
	System.out.println("List of the perfumes are:");
	
	for(String perfume:perfumes){
	
	System.out.println(perfume);
	
	}
	
	System.out.println("getPerfumes ended");
	
	}
	
	
	//biscuits
	public static void getBiscuits(){
	
	System.out.println("getBiscuits started");
	
	System.out.println("List of the biscuits are:");
	
	for(String biscuit:biscuits){
	
	System.out.println(biscuit);
	
	}
	
	System.out.println("getBiscuits ended");
	
	}
	
	//utensils
	public static void getUtensils(){
	
	System.out.println("getUtensils started");
	
	System.out.println("List of the utensils are:");
	
	for(String utensil:utensils){
	
	System.out.println(utensil);
	
	}
	
	System.out.println("getUtensils ended");
	
	}
	
	
	//Vegetables
	public static void getVegetables(){
	
	System.out.println("getVegetables started");
	
	System.out.println("List of the vegetables are:");
	
	for(String vegetable:vegetables){
	
	System.out.println(vegetable);
	
	}
	
	System.out.println("getVegetables ended");
	
	}
	
}	
	