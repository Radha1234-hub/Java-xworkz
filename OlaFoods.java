class OlaFoods{


public static double foodOrders(String foodItemName) {
    if (foodItemName.equals("Classic Moong Dal Khichdi")) 
        return 100;

    else if (foodItemName.equals("Vegetable Khichdi")) 
        return 120;

    else if (foodItemName.equals("Spinach and Corn Khichdi")) 
        return 150;

    else if (foodItemName.equals("Tandoori Khichdi")) 
        return 180;

    else if (foodItemName.equals("Paneer Tikka Khichdi")) 
        return 200;

    else if (foodItemName.equals("Masala Khichdi")) 
        return 130;

    else if (foodItemName.equals("Lemon Khichdi")) 
        return 130;

    else if (foodItemName.equals("Tomato Khichdi")) 
        return 120;

    else if (foodItemName.equals("Kesar (Saffron) Khichdi")) 
        return 250;

    else if (foodItemName.equals("Prawn Khichdi")) 
        return 250;

    else if (foodItemName.equals("Methi Thepla Khichdi")) 
        return 150;

    else if (foodItemName.equals("Rajma Khichdi")) 
        return 150;

    else if (foodItemName.equals("Quinoa Khichdi")) 
        return 180;

    else if (foodItemName.equals("Kashmiri Pulao Khichdi")) 
        return 220;

    else if (foodItemName.equals("Keto Khichdi")) 
        return 200;

    else if (foodItemName.equals("Cheese Paratha")) 
        return 100;

    else if (foodItemName.equals("Butter Chicken Paratha")) 
        return 180;

    else if (foodItemName.equals("Tandoori Paratha")) 
        return 80;

    else if (foodItemName.equals("Paneer Tikka Paratha")) 
        return 150;

    else if (foodItemName.equals("Sweet Potato Paratha")) 
        return 130;

    else if (foodItemName.equals("Kashmiri Naan Paratha")) 
        return 180;

    else if (foodItemName.equals("Keema Paratha")) 
        return 200;

    else if (foodItemName.equals("Prawn Paratha")) 
        return 250;

    else if (foodItemName.equals("Lemon Coriander Paratha")) 
        return 100;

    else if (foodItemName.equals("Mushroom Paratha")) 
        return 150;

    else if (foodItemName.equals("Grilled Chicken Bowl")) 
        return 1162;

    else if (foodItemName.equals("Crispy Tofu Bowl")) 
        return 1037;

    else if (foodItemName.equals("Beef Burrito Bowl")) 
        return 1249;

    else if (foodItemName.equals("Shrimp & Avocado Bowl")) 
        return 1289;

    else if (foodItemName.equals("Fruit Parfait")) 
        return 459;

    else if (foodItemName.equals("Soup of the Day")) 
        return 539;

    else if (foodItemName.equals("Fried Zucchini Sticks")) 
        return 665;

    else if (foodItemName.equals("Grilled Chicken Parmesan")) 
        return 1449;

    else if (foodItemName.equals("Veggie Lasagna")) 
        return 1299;

    else if (foodItemName.equals("Paneer Tikka Masala")) 
        return 1099;

    else if (foodItemName.equals("Lamb Rogan Josh")) 
        return 1699;

    else if (foodItemName.equals("Grilled Salmon")) 
        return 1899;

    else if (foodItemName.equals("BBQ Pulled Pork Sandwich")) 
        return 1399;

    else if (foodItemName.equals("Vegetable Stir-Fry")) 
        return 999;

    else if (foodItemName.equals("Spaghetti Bolognese")) 
        return 1249;

    else {
        System.out.println("The dish is not found");

        return 0.0;

    }
}

public static double foodOrders(String foodItemName, int quantity){
	
    if (foodItemName.equals("Classic Moong Dal Khichdi")) 
        return 100 * quantity;

    else if (foodItemName.equals("Vegetable Khichdi")) 
        return 120 * quantity;

    else if (foodItemName.equals("Spinach and Corn Khichdi")) 
        return 150 * quantity;

    else if (foodItemName.equals("Tandoori Khichdi")) 
        return 180 * quantity;

    else if (foodItemName.equals("Paneer Tikka Khichdi")) 
        return 200 * quantity;

    else if (foodItemName.equals("Masala Khichdi")) 
        return 130 * quantity;

    else if (foodItemName.equals("Lemon Khichdi")) 
        return 130 * quantity;

    else if (foodItemName.equals("Tomato Khichdi")) 
        return 120 * quantity;

    else if (foodItemName.equals("Kesar (Saffron) Khichdi")) 
        return 250 * quantity;

    else if (foodItemName.equals("Prawn Khichdi")) 
        return 250 * quantity;

    else if (foodItemName.equals("Methi Thepla Khichdi")) 
        return 150 * quantity;

    else if (foodItemName.equals("Rajma Khichdi")) 
        return 150 * quantity;

    else if (foodItemName.equals("Quinoa Khichdi")) 
        return 180 * quantity;

    else if (foodItemName.equals("Kashmiri Pulao Khichdi")) 
        return 220 * quantity;

    else if (foodItemName.equals("Keto Khichdi")) 
        return 200 * quantity;

    else if (foodItemName.equals("Cheese Paratha")) 
        return 100 * quantity;

    else if (foodItemName.equals("Butter Chicken Paratha")) 
        return 180 * quantity;

    else if (foodItemName.equals("Tandoori Paratha")) 
        return 80 * quantity;

    else if (foodItemName.equals("Paneer Tikka Paratha")) 
        return 150 * quantity;

    else if (foodItemName.equals("Sweet Potato Paratha")) 
        return 130 * quantity;

    else if (foodItemName.equals("Kashmiri Naan Paratha")) 
        return 180 * quantity;

    else if (foodItemName.equals("Keema Paratha")) 
        return 200 * quantity;

    else if (foodItemName.equals("Prawn Paratha")) 
        return 250 * quantity;

    else if (foodItemName.equals("Lemon Coriander Paratha")) 
        return 100 * quantity;

    else if (foodItemName.equals("Mushroom Paratha")) 
        return 150 * quantity;

    else if (foodItemName.equals("Grilled Chicken Bowl")) 
        return 1162 * quantity;

    else if (foodItemName.equals("Crispy Tofu Bowl")) 
        return 1037 * quantity;

    else if (foodItemName.equals("Beef Burrito Bowl")) 
        return 1249 * quantity;

    else if (foodItemName.equals("Shrimp & Avocado Bowl")) 
        return 1289 * quantity;

    else if (foodItemName.equals("Fruit Parfait")) 
        return 459 * quantity;

    else if (foodItemName.equals("Soup of the Day")) 
        return 539 * quantity;

    else if (foodItemName.equals("Fried Zucchini Sticks")) 
        return 665 * quantity;

    else if (foodItemName.equals("Grilled Chicken Parmesan")) 
        return 1449 * quantity;

    else if (foodItemName.equals("Veggie Lasagna")) 
        return 1299 * quantity;

    else if (foodItemName.equals("Paneer Tikka Masala")) 
        return 1099 * quantity;

    else if (foodItemName.equals("Lamb Rogan Josh")) 
        return 1699 * quantity;

    else if (foodItemName.equals("Grilled Salmon")) 
        return 1899 * quantity;

    else if (foodItemName.equals("BBQ Pulled Pork Sandwich")) 
        return 1399 * quantity;

    else if (foodItemName.equals("Vegetable Stir-Fry")) 
        return 999 * quantity;

    else if (foodItemName.equals("Spaghetti Bolognese")) 
        return 1249 * quantity;

    else {
        System.out.println("The dish is not found");

        return 0.0;

        }
    }
}
