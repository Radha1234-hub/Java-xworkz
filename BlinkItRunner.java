class BlinkItRunner {
    public static void main(String[] it) {
        String snacks = null;

        double ref = BlinkIt.deliveryOrders("Britannia Little Hearts Classic Crunch Biscuit");
        System.out.println("The price of the entered snacks is: " + ref);

        double price = BlinkIt.deliveryOrders("Britannia Little Hearts Classic Crunch Biscuit", 5);
        System.out.println("The price of the quantity is: " + price);
    }
}
