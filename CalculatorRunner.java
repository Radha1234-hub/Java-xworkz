class CalculatorRunner{

public static void main(String[] args) {
	
		System.out.println("Main started");
		
        //invoke addition 
		int sum = Calculator.addition(1002, 156);
		System.out.println("The Addition is: " + sum);
		
		//invoke subraction
        int difference = Calculator.subraction(178, 90);
		System.out.println("The Subtraction is : " + difference);
		
		//invoke multipication
        int product = Calculator.multiplication(556, 10000);
		System.out.println("The Multiplication is : " + product);
		
		//invoke division
        int quotient = Calculator.division(10098, 155);
		System.out.println("The Division is: " + quotient);
		
		//invoke modulus
        int remainder = Calculator.modulus(100, 50q                );
		System.out.println("Modulus: " + remainder);
        
		System.out.println("Main ended");
		
		
    }
}