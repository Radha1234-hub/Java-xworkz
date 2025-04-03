class FoodPanda{
public class FoodPanda {

    public static double dineIn(String food) {

        // Prices for dine-in

        if (food.equals("Vegetable Spring Rolls"))  
            return 2.5;
        else if (food.equals("Chicken Spring Rolls"))  
            return 27;
        else if (food.equals("Veg Manchurian"))  
            return 22;
        else if (food.equals("Chicken Manchurian"))  
            return 10.0;
        else if (food.equals("Gobi Manchurian"))  
            return 30.00;
        else if (food.equals("Paneer Chilli"))  
            return 20.0;
        else if (food.equals("Chili Garlic Noodles"))  
            return 15.0;
        else if (food.equals("Veg Hakka Noodles"))  
            return 2.5;
        else if (food.equals("Chicken Hakka Noodles"))  
            return 15.0;
        else if (food.equals("Vegetable Fried Rice"))  
            return 22.5;
        else if (food.equals("Chicken Fried Rice"))  
            return 29.0;
        else if (food.equals("Egg Fried Rice"))  
            return 11;
        else if (food.equals("Vegetable Schezwan Fried Rice"))  
            return 10.0;
        else if (food.equals("Chicken Schezwan Fried Rice"))  
            return 20.0;
        else if (food.equals("Hot and Sour Soup (Veg)"))  
            return 15.0;
        else if (food.equals("Hot and Sour Soup (Chicken)"))  
            return 2.5;
        else if (food.equals("Sweet Corn Soup (Veg)"))  
            return 22.5;
        else if (food.equals("Sweet Corn Soup (Chicken)"))  
            return 29.0;
        else if (food.equals("Veg Spring Onion Soup"))  
            return 11;
        else if (food.equals("Chicken and Corn Soup"))  
            return 10.0;
        else if (food.equals("Vegetable Dim Sum"))  
            return 20.0;
        else if (food.equals("Chicken Dim Sum"))  
            return 15.0;
        else if (food.equals("Vegetable Dumplings"))  
            return 2.5;
        else if (food.equals("Chicken Dumplings"))  
            return 15.0;
        else if (food.equals("Chili Paneer"))  
            return 22.5;
        else if (food.equals("Dragon Chicken"))  
            return 29.0;
        else if (food.equals("Chicken Sweet and Sour"))  
            return 11;
        else if (food.equals("Fish in Black Bean Sauce"))  
            return 10.0;
        else if (food.equals("Chili Fish"))  
            return 20.0;
        else if (food.equals("Szechuan Chicken"))  
            return 15.0;
        else if (food.equals("Kung Pao Chicken"))  
            return 2.5;
        else if (food.equals("Lemon Chicken"))  
            return 15.0;
        else if (food.equals("Vegetable Hot Pot"))  
            return 22.5;
        else if (food.equals("Chicken in Oyster Sauce"))  
            return 29.0;
        else if (food.equals("Prawn Hakka Noodles"))  
            return 11;
        else if (food.equals("Prawn Fried Rice"))  
            return 10.0;
        else if (food.equals("Crispy Fried Fish"))  
            return 20.0;
        else if (food.equals("Crispy Chili Potato"))  
            return 15.0;
        else if (food.equals("Egg Foo Young"))  
            return 2.5;
        else if (food.equals("Mongolian Chicken"))  
            return 15.0;
        else {
            System.out.println("The food is not found");
            return 0.0;
        }
    


    public static double dineIn(String food, int quantity) {
        // Prices for dine-in with quantity

        if (food.equals("Vegetable Spring Rolls"))  
            return 150.0 * quantity;
        else if (food.equals("Chicken Spring Rolls"))  
            return 180.0 * quantity;
        else if (food.equals("Veg Manchurian"))  
            return 220.0 * quantity;
        else if (food.equals("Chicken Manchurian"))  
            return 250.0 * quantity;
        else if (food.equals("Gobi Manchurian"))  
            return 240.0 * quantity;
        else if (food.equals("Paneer Chilli"))  
            return 290.0 * quantity;
        else if (food.equals("Chili Garlic Noodles"))  
            return 230.0 * quantity;
        else if (food.equals("Veg Hakka Noodles"))  
            return 210.0 * quantity;
        else if (food.equals("Chicken Hakka Noodles"))  
            return 250.0 * quantity;
        else if (food.equals("Vegetable Fried Rice"))  
            return 200.0 * quantity;
        else if (food.equals("Chicken Fried Rice"))  
            return 230.0 * quantity;
        else if (food.equals("Egg Fried Rice"))  
            return 220.0 * quantity;
        else if (food.equals("Vegetable Schezwan Fried Rice"))  
            return 250.0 * quantity;
        else if (food.equals("Chicken Schezwan Fried Rice"))  
            return 270.0 * quantity;
        else if (food.equals("Hot and Sour Soup (Veg)"))  
            return 150.0 * quantity;
        else if (food.equals("Hot and Sour Soup (Chicken)"))  
            return 180.0 * quantity;
        else if (food.equals("Sweet Corn Soup (Veg)"))  
            return 140.0 * quantity;
        else if (food.equals("Sweet Corn Soup (Chicken)"))  
            return 140.0 * quantity;
        else if (food.equals("Veg Spring Onion Soup"))  
            return 180.0 * quantity;
        else if (food.equals("Chicken and Corn Soup"))  
            return 200.0 * quantity;
        else if (food.equals("Vegetable Dim Sum"))  
            return 280.0 * quantity;
        else if (food.equals("Chicken Dim Sum"))  
            return 300.0 * quantity;
        else if (food.equals("Vegetable Dumplings"))  
            return 250.0 * quantity;
        else if (food.equals("Chicken Dumplings"))  
            return 280.0 * quantity;
        else if (food.equals("Chili Paneer"))  
            return 290.0 * quantity;
        else if (food.equals("Dragon Chicken"))  
            return 320.0 * quantity;
        else if (food.equals("Chicken Sweet and Sour"))  
            return 300.0 * quantity;
        else if (food.equals("Fish in Black Bean Sauce"))  
            return 350.0 * quantity;
        else if (food.equals("Chili Fish"))  
            return 320.0 * quantity;
        else if (food.equals("Szechuan Chicken"))  
            return 310.0 * quantity;
        else if (food.equals("Kung Pao Chicken"))  
            return 310.0 * quantity;
        else if (food.equals("Lemon Chicken"))  
            return 300.0 * quantity;
        else if (food.equals("Vegetable Hot Pot"))  
            return 310.0 * quantity;
        else if (food.equals("Chicken in Oyster Sauce"))  
            return 350.0 * quantity;
        else if (food.equals("Prawn Hakka Noodles"))  
            return 320.0 * quantity;
        else if (food.equals("Prawn Fried Rice"))  
            return 350.0 * quantity;
        else if (food.equals("Crispy Fried Fish"))  
            return 380.0 * quantity;
        else if (food.equals("Crispy Chili Potato"))  
            return 250.0 * quantity;
        else if (food.equals("Egg Foo Young"))  
            return 250.0 * quantity;
        else if (food.equals("Mongolian Chicken"))  
            return 320.0 * quantity;
        else {
            System.out.println("The food is not found");
            return 0.0;
        }
    }
