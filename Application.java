package calculator;
// import a scanner so we can use in the program 
import java.util.Scanner; 



public class Application { 
	public static void main (String [] args ) {
		
		double num1, num2, result; 
		char operator; 
		
		Scanner input = new Scanner(System.in);
		
		
		// use a scanner to ask the user to input an expression 
		
		System.out.println("Enter in the first number ");
		num1 = input.nextDouble();
		
		
		System.out.println("Enter the operator  ");
		operator = input.next().charAt(0);
		
		
		System.out.println("Enter in the second number ");
		num2 = input.nextDouble();

		
		switch (operator) {
		
		case '+':
		result = num1 + num2 ; 
		System.out.println(num1 + " + " + num2 + " = " + result);
		break;
		
		case '-':
		result = num1 - num2 ; 
		System.out.println(num1 + " - " + num2 + " = " + result);
		break;
		
		case '*':
		result = num1 * num2 ; 
		System.out.println(num1 + " * " + num2 + " = " + result);
		break;
		
		case '/':
		result = num1 / num2 ; 
		System.out.println(num1 + " / " + num2 + " = " + result);
		break;
		
		
	
		}




		

		
	

	}

}
