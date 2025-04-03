class ZeptoRunner{

public static void main(String[] zepto){
String dessertName = null;
double ref = Zepto.tableOrders("Havmor Nutty French Vanilla Ice Cream Cone 150 ml Combo");
System.out.println("The price of the dessert is :" +ref);

double val = Zepto.tableOrders("Havmor Nutty French Vanilla Ice Cream Cone 150 ml Combo",9);
System.out.println("The price of the dessert is :" +val);

}
}