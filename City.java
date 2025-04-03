class City{

static String name = "Madras";

public static void main(String args[]){

System.out.println("Name of the city befor:"+name);

//name = "Chennai";

upadate();

System.out.println("Name of the city after reinitailaization"+name);

}



public static void upadate(){
	
	name = "Chennai";
	
	
}
}