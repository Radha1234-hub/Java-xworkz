class Chocolate1{

	static String chocolates[] = {"Cadbury Dairy Milk", "Cadbury Silk", "Cadbury 5 Star", "Cadbury Perk", "Cadbury Fuse", "Cadbury Bournville", "Cadbury Gems", "Nestlé KitKat", "Nestlé Munch", "Nestlé Alpino", "Nestlé Classic", "Amul Dark Chocolate", "Amul Fruit & Nut", "Amul Mystic Mocha", "Amul Almond", "Amul Cranberry", "Hershey's Kisses", "Hershey's Cocoa", "Hershey's Dark", "Ferrero Rocher", "Toblerone", "Lindt Swiss Chocolate", "Lindt Excellence", "Mars", "Snickers", "Bounty", "Milky Bar", "Galaxy", "Temptations Almond Treat", "Temptations Rum & Raisins", "KitKat Dessert Delight", "KitKat Chunky", "Kinder Joy", "Kinder Bueno", "Lotus Biscoff Chocolate", "LuvIt Luscious", "LuvIt Chocwich", "Sapphire Truffles", "Schmitten Swiss Chocolate", "Skittles Chocolate"};
	
	
	public static void main(String args[]){
	
	System.out.println("Main started");
	
	getChocolates();
	
	System.out.println("Main ended");
	
	}
	
	public static void getChocolates(){
	
	System.out.println("getChocolates started");
	
	System.out.println("List of the chocolates are:");
	
	for(String chocolate:chocolates){
	
	System.out.println(chocolate);
	}
	
	System.out.println("getChocolates ended");
	
	
	}
}