class Zepto {

    public static double tableOrders(String dessertName) {

        if (dessertName.equals("NIC Dry Fruit Over Load Ice Cream"))
            return 169.0;

        else if (dessertName.equals("Kwality Wall's Hazelnut Chocolate Ice Cream"))
            return 159.0;

        else if (dessertName.equals("NIC Chocochips Ice Cream"))
            return 109.09;

        else if (dessertName.equals("NIC Alphonso Mango Ice Cream"))
            return 209.65;

        else if (dessertName.equals("Kwality Wall's Shameless Vanilla"))
            return 557.0;

        else if (dessertName.equals("Kwality Wall's Cadbury Crackle"))
            return 200.91;

        else if (dessertName.equals("Kwality Wall's Cornetto Double Chocolate 105 ml Combo"))
            return 129.23;

        else if (dessertName.equals("Kwality Wall's Cornetto Butterscotch 105 ml Combo"))
            return 125;

        else if (dessertName.equals("Baskin Robbins Classic Vanilla Ice Cream Tub 450 ml Combo"))
            return 155.0;

        else if (dessertName.equals("Slow Churn Chikoo Ice Cream"))
            return 122;

        else if (dessertName.equals("Arun Butterscotch Icone Ice Cream Cone 100 ml Combo"))
            return 299;

        else if (dessertName.equals("Amul Vanilla Magic Ice Cream"))
            return 411;

        else if (dessertName.equals("Baskin Robbins Ice Cream Rocks Hazelnut"))
            return 196.0;

        else if (dessertName.equals("Get-A-Way Choco Hazelnut Crunch Ice Cream Stick 70 ml Combo"))
            return 125;

        else if (dessertName.equals("Havmor Nutty French Vanilla Ice Cream Cone 150 ml Combo"))
            return 231;

        else if (dessertName.equals("Go Zero Belgian Dark Chocolate Low Calorie Guilt Free Ice Cream Cup 100 ml Combo"))
            return 149;

        else if (dessertName.equals("Get-A-Way Black Forest Ice Cream Pastry"))
            return 280.0;

        else if (dessertName.equals("NIC Roasted Almond Ice Cream Tub 500 ml Combo"))
            return 89;

        else if (dessertName.equals("Havmor Signature Nutty Belgian Dark Chocolate Ice Cream Tub 750 ml Combo"))
            return 315;

        else if (dessertName.equals("Baskin Robbins Raspberry Vanilla Doublet Bar Ice Cream Stick 65 ml Combo"))
            return 200;

        else if (dessertName.equals("Kwality Wall's Magnum Almond Ice Cream Stick Combo"))
            return 300.0;

        else if (dessertName.equals("Arun Casata Slice Ice Cream 120 ml Combo"))
            return 180;

        else if (dessertName.equals("NOTO Dark Chocolate Low Calorie Ice Cream 100 ml Combo"))
            return 323;

        else if (dessertName.equals("Amul Chocolate Brownie Ice Cream"))
            return 154;

        else if (dessertName.equals("London Dairy Double Chocolate Ice Cream Tub"))
            return 231.0;

        else if (dessertName.equals("Amul Gold Vanilla Ice Cream(1l) & Dukes Waffy Chocolate Wafer Rolls(250gms) Combo"))
            return 209;

        else if (dessertName.equals("Get-A-Way Triple Chocolate Ice Cream Cake"))
            return 352;

        else if (dessertName.equals("Kwality Wall'S Hazelnut Chocolate Ice Cream Tub(500ml) & Britannia Fudge It Chocolate Brownie"))
            return 134;

        else if (dessertName.equals("Amul Vanilla Magic Ice Cream Tub 1 l Combo"))
            return 104.0;

        else if (dessertName.equals("Go Zero Madagascar Chocolate Low Calorie Guilt Free Ice Cream Bar 70 ml Combo"))
            return 500.20;

        else if (dessertName.equals("Go Zero Butterscotch Caramel Low Calorie Guilt Free Ice Cream Cone"))
            return 190;

        else if (dessertName.equals("Amul Gold Vanilla Ice Cream"))
            return 266.99;

        else if (dessertName.equals("London Dairy Choco Brownie Delight Ice Cream Tub 500 ml Combo"))
            return 456;

        else if (dessertName.equals("Baskin Robbins Honey Nut Crunch Ice Cream Tub"))
            return 899.99;

        else if (dessertName.equals("Havmor Taj Mahal Ice Cream Tub 750 ml Combo"))
            return 247.20;

 else 
        System.out.println("The dessert is not found");
    
    return 0.0;
    
	}
	
	public static double tableOrders(String dessertName, int quantity) {

    if (dessertName.equals("NIC Dry Fruit Over Load Ice Cream")) 
        return 169.0 * quantity;

    else if (dessertName.equals("Kwality Wall's Hazelnut Chocolate Ice Cream")) 
        return 159.0 * quantity;

    else if (dessertName.equals("NIC Chocochips Ice Cream")) 
        return 109.09 * quantity;

    else if (dessertName.equals("NIC Alphonso Mango Ice Cream")) 
        return 209.65 * quantity;

    else if (dessertName.equals("Kwality Wall's Shameless Vanilla")) 
        return 557.0 * quantity;

    else if (dessertName.equals("Kwality Wall's Cadbury Crackle")) 
        return 200.91 * quantity;

    else if (dessertName.equals("Kwality Wall's Cornetto Double Chocolate 105 ml Combo")) 
        return 129.23 * quantity;

    else if (dessertName.equals("Kwality Wall's Cornetto Butterscotch 105 ml Combo")) 
        return 125 * quantity;

    else if (dessertName.equals("Baskin Robbins Classic Vanilla Ice Cream Tub 450 ml Combo")) 
        return 155.0 * quantity;

    else if (dessertName.equals("Slow Churn Chikoo Ice Cream")) 
        return 122 * quantity;

    else if (dessertName.equals("Arun Butterscotch Icone Ice Cream Cone 100 ml Combo")) 
        return 299 * quantity;

    else if (dessertName.equals("Amul Vanilla Magic Ice Cream")) 
        return 411 * quantity;

    else if (dessertName.equals("Baskin Robbins Ice Cream Rocks Hazelnut")) 
        return 196.0 * quantity;

    else if (dessertName.equals("Get-A-Way Choco Hazelnut Crunch Ice Cream Stick 70 ml Combo")) 
        return 125 * quantity;

    else if (dessertName.equals("Havmor Nutty French Vanilla Ice Cream Cone 150 ml Combo")) 
        return 231 * quantity;

    else if (dessertName.equals("Go Zero Belgian Dark Chocolate Low Calorie Guilt Free Ice Cream Cup 100 ml Combo")) 
        return 149 * quantity;

    else if (dessertName.equals("Get-A-Way Black Forest Ice Cream Pastry")) 
        return 280.0 * quantity;

    else if (dessertName.equals("NIC Roasted Almond Ice Cream Tub 500 ml Combo")) 
        return 89 * quantity;

    else if (dessertName.equals("Havmor Signature Nutty Belgian Dark Chocolate Ice Cream Tub 750 ml Combo")) 
        return 315 * quantity;

    else if (dessertName.equals("Baskin Robbins Raspberry Vanilla Doublet Bar Ice Cream Stick 65 ml Combo")) 
        return 200 * quantity;

    else if (dessertName.equals("Kwality Wall's Magnum Almond Ice Cream Stick Combo")) 
        return 300.0 * quantity;

    else if (dessertName.equals("Arun Casata Slice Ice Cream 120 ml Combo")) 
        return 180 * quantity;

    else if (dessertName.equals("NOTO Dark Chocolate Low Calorie Ice Cream 100 ml Combo")) 
        return 323 * quantity;

    else if (dessertName.equals("Amul Chocolate Brownie Ice Cream")) 
        return 154 * quantity;

    else if (dessertName.equals("London Dairy Double Chocolate Ice Cream Tub")) 
        return 231.0 * quantity;

    else if (dessertName.equals("Amul Gold Vanilla Ice Cream(1l) & Dukes Waffy Chocolate Wafer Rolls(250gms) Combo")) 
        return 209 * quantity;

    else if (dessertName.equals("Get-A-Way Triple Chocolate Ice Cream Cake")) 
        return 352 * quantity;

    else if (dessertName.equals("Kwality Wall'S Hazelnut Chocolate Ice Cream Tub(500ml) & Britannia Fudge It Chocolate Brownie")) 
        return 134 * quantity;

    else if (dessertName.equals("Amul Vanilla Magic Ice Cream Tub 1 l Combo")) 
        return 104.0 * quantity;

    else if (dessertName.equals("Go Zero Madagascar Chocolate Low Calorie Guilt Free Ice Cream Bar 70 ml Combo")) 
        return 500.20 * quantity;

    else if (dessertName.equals("Go Zero Butterscotch Caramel Low Calorie Guilt Free Ice Cream Cone")) 
        return 190 * quantity;

    else if (dessertName.equals("Amul Gold Vanilla Ice Cream")) 
        return 266.99 * quantity;
	
	 else if (dessertName.equals("London Dairy Choco Brownie Delight Ice Cream Tub 500 ml Combo"))
            return 456* quantity;

        else if (dessertName.equals("Baskin Robbins Honey Nut Crunch Ice Cream Tub"))
            return 899.99 * quantity;

        else if (dessertName.equals("Havmor Taj Mahal Ice Cream Tub 750 ml Combo"))
            return 247.20* quantity;
		else 
        System.out.println("The dessert is not found");

    return 0.0;
	}
}