class DreamyDestiny1{

	static String menuItems[] = { "Paneer Tikka ", "Crispy Corn Chaat" , "Butter Chicken","Paneer Butter Masala","Vegetable Biryani","Pista & Almond Baklava Tart","Dark Chocolate & Hazelnut Praline Tart","Whiskey-Infused Chocolate Mousse","Exotic Mango & Passionfruit Pavlova","Truffle-Infused Honey Gelato"};
	
	public static void main (String args[]){
	
	System.out.println("Main started");
	
	getMenuItems();
	
	System.out.println("Main ended");
}
	
	
	public static void getMenuItems(){
	
	System.out.println ("getMenu items started");
	
	System.out.println(" list of the items in the menu are:");
	
	for(String menuItem:menuItems){
	
		System.out.println(menuItem);
	
	}
	System.out.println ("getMenu items ended");
	}
}