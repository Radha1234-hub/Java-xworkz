class BlinkIt {

    public static double deliveryOrders(String snacks) {

        if (snacks.equals("Britannia Little Hearts Classic Crunch Biscuit"))
            return 100.00;

        else if (snacks.equals("Britannia NutriChoice Digestive Biscuit"))
            return 27.0;

        else if (snacks.equals("Britannia Nice Time Coconut Biscuit"))
            return 220.0;

        else if (snacks.equals("Sunfeast Bourbon Dark Fantasy Biscuit"))
            return 100.0;

        else if (snacks.equals("Sunfeast Cheese Wowzers Crackers"))
            return 300.0;

        else if (snacks.equals("Parle Krackjack Crackers Sweet & Salty Biscuits"))
            return 200.0;

        else if (snacks.equals("Britannia Good Day Cashew Biscuit"))
            return 150.0;

        else if (snacks.equals("McVitie's Digestive Whole Wheat Biscuit"))
            return 160.0;

        else if (snacks.equals("Britannia Marie Gold Marie Biscuits"))
            return 155.0;

        else if (snacks.equals("Britannia Treat Jim Jam Sandwich Cream Biscuits"))
            return 225.0;

        else if (snacks.equals("Britannia 5050 Maska Chaska Biscuit"))
            return 299.0;

        else if (snacks.equals("Hide & Seek Chocolate Chip Cookies"))
            return 124.0;

        else if (snacks.equals("Jaggic Gud Atta Biscuit"))
            return 100.0;

        else if (snacks.equals("Parle-G Original Gluco Biscuit"))
            return 50.0;

        else if (snacks.equals("Britannia Milk Bikis Milk Sandwich Cream Biscuits"))
            return 200.0;

        else if (snacks.equals("Britannia The Original Bourbon Creme Biscuit With Chocolate"))
            return 35.0;

        else if (snacks.equals("Parle Monaco Light Salty Classic Regular Biscuit"))
            return 65.0;

        else if (snacks.equals("Cadbury Oreo Vanilla Flavour Sandwich Cream Biscuits"))
            return 50.0;

        else if (snacks.equals("Britannia 5050 Potazos Masti Masala Spicy Flavoured Crisps"))
            return 100.0;

        else if (snacks.equals("Sunfeast Dark Fantasy Biscuit - Choco Fills Cookies"))
            return 80.0;

        else if (snacks.equals("Haldiram's Heaven Atta Bakery Cookies"))
            return 140.0;

        else if (snacks.equals("Britannia BisCafe Coffee Crackers"))
            return 200.0;

        else if (snacks.equals("Parle-G Royale Glucose Biscuit"))
            return 240.0;

        else if (snacks.equals("Snackible Biscuit Sticks with Chocolatey Dip"))
            return 60.0;

        else if (snacks.equals("Parle Marie Biscuits"))
            return 150.0;

        else if (snacks.equals("Britannia NutriChoice Oats Orange & Almond Biscuit"))
            return 100.0;

        else if (snacks.equals("Britannia NutriChoice 5 Grain Digestive Biscuit"))
            return 200.0;

        else if (snacks.equals("Sunfeast Bounce Orange Cream Biscuits"))
            return 38.0;

        else if (snacks.equals("Britannia Good Day Butter Cookies"))
            return 80.20;

        else if (snacks.equals("TummyFriendly Foods Millet Cookies (Oats and Chocolate)"))
            return 190.0;

        else if (snacks.equals("Britannia Treat Rich Creme Strawberry Flavoured Wafers"))
            return 266.99;

        else if (snacks.equals("Cadbury Chocobakes Choco Chip Cookies"))
            return 150.0;

        else if (snacks.equals("Sunfeast Baked Creations Rich Choco Chip Cookies"))
            return 30.99;

        else if (snacks.equals("Sunfeast Dark Fantasy Choco Creme Center Filled Biscuits"))
            return 24.20;

        else if (snacks.equals("McVitie's Tasties Coconut Cookies"))
            return 199.00;

        else if (snacks.equals("McVitie's Whole Wheat Marie Biscuits"))
            return 50.99;

        else if (snacks.equals("Britannia NutriChoice Almond Oats Glucose"))
			return 50.99;
		
	else
        System.out.println("The snack is not found");
    
    return 0.0;
	}
    public static double deliveryOrders(String snacks, int quantity) {
        
        if (snacks.equals("Britannia Little Hearts Classic Crunch Biscuit"))
            return 100.00 * quantity;
        
        else if (snacks.equals("Britannia NutriChoice Digestive Biscuit"))
            return 27.0 * quantity;
        
        else if (snacks.equals("Britannia Nice Time Coconut Biscuit"))
            return 220.0 * quantity;
        
        else if (snacks.equals("Sunfeast Bourbon Dark Fantasy Biscuit"))
            return 100.0 * quantity;
        
        else if (snacks.equals("Sunfeast Cheese Wowzers Crackers"))
            return 300.0 * quantity;
        
        else if (snacks.equals("Parle Krackjack Crackers Sweet & Salty Biscuits"))
            return 200.0 * quantity;
        
        else if (snacks.equals("Britannia Good Day Cashew Biscuit"))
            return 150.0 * quantity;
        
        else if (snacks.equals("McVitie's Digestive Whole Wheat Biscuit"))
            return 160.0 * quantity;
        
        else if (snacks.equals("Britannia Marie Gold Marie Biscuits"))
            return 155.0 * quantity;
        
        else if (snacks.equals("Britannia Treat Jim Jam Sandwich Cream Biscuits"))
            return 225.0 * quantity;
        
        else if (snacks.equals("Britannia 5050 Maska Chaska Biscuit"))
            return 299.0 * quantity;
        
        else if (snacks.equals("Hide & Seek Chocolate Chip Cookies"))
            return 124.0 * quantity;
        
        else if (snacks.equals("Jaggic Gud Atta Biscuit"))
            return 100.0 * quantity;
        
        else if (snacks.equals("Parle-G Original Gluco Biscuit"))
            return 50.0 * quantity;
        
        else if (snacks.equals("Britannia Milk Bikis Milk Sandwich Cream Biscuits"))
            return 200.0 * quantity;
        
        else if (snacks.equals("Britannia The Original Bourbon Creme Biscuit With Chocolate"))
            return 35.0 * quantity;
        
        else if (snacks.equals("Parle Monaco Light Salty Classic Regular Biscuit"))
            return 65.0 * quantity;
        
        else if (snacks.equals("Cadbury Oreo Vanilla Flavour Sandwich Cream Biscuits"))
            return 50.0 * quantity;
        
        else if (snacks.equals("Britannia 5050 Potazos Masti Masala Spicy Flavoured Crisps"))
            return 100.0 * quantity;
        
        else if (snacks.equals("Sunfeast Dark Fantasy Biscuit - Choco Fills Cookies"))
            return 80.0 * quantity;
        
        else if (snacks.equals("Haldiram's Heaven Atta Bakery Cookies"))
            return 140.0 * quantity;
        
        else if (snacks.equals("Britannia BisCafe Coffee Crackers"))
            return 200.0 * quantity;
        
        else if (snacks.equals("Parle-G Royale Glucose Biscuit"))
            return 240.0 * quantity;
        
        else if (snacks.equals("Snackible Biscuit Sticks with Chocolatey Dip"))
            return 60.0 * quantity;
        
        else if (snacks.equals("Parle Marie Biscuits"))
            return 150.0 * quantity;
        
        else if (snacks.equals("Britannia NutriChoice Oats Orange & Almond Biscuit"))
            return 100.0 * quantity;
        
        else if (snacks.equals("Britannia NutriChoice 5 Grain Digestive Biscuit"))
            return 200.0 * quantity;
        
        else if (snacks.equals("Sunfeast Bounce Orange Cream Biscuits"))
            return 38.0 * quantity;
        
        else if (snacks.equals("Britannia Good Day Butter Cookies"))
            return 80.20 * quantity;
        
        else if (snacks.equals("TummyFriendly Foods Millet Cookies (Oats and Chocolate)"))
            return 190.0 * quantity;
        
        else if (snacks.equals("Britannia Treat Rich Creme Strawberry Flavoured Wafers"))
            return 266.99 * quantity;
        
        else if (snacks.equals("Cadbury Chocobakes Choco Chip Cookies"))
            return 150.0 * quantity;
        
        else if (snacks.equals("Sunfeast Baked Creations Rich Choco Chip Cookies"))
            return 30.99 * quantity;
        
        else if (snacks.equals("McVitie's Tasties Coconut Cookies"))
            return 199.00*quantity;

        else if (snacks.equals("McVitie's Whole Wheat Marie Biscuits"))
            return 50.99*quantity;

        else if (snacks.equals("Britannia NutriChoice Almond Oats Glucose"))
			return 50.99*quantity;
		
		else
        System.out.println("The snack is not found");
    
    return 0.0;
    }
}	