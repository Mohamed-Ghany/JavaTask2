import java.util.Scanner;

public class ArithmeticTask {
//create a program that take two numbers from user and show the following operation on it (+, - * , /, %) 	
	public static void main(String[] args) {
						
		int numOne;
		int numTwo;
		
		System.out.println("Hello Customer..Please follow the below steps to get the Arithmetic Result ");
		
		Scanner arithmetic =new Scanner(System.in); // create object from Scanner written only one time , its name"arithmetic"
		
		System.out.println("Enter the 1st number :");
		numOne =arithmetic.nextInt();
		
		System.out.println("Enter the 2nd number :");
		numTwo =arithmetic.nextInt();
		
		System.out.println("The numbers You've entered are :"+numOne+" & "+numTwo);
				
		int addition = numOne + numTwo;
		int subtraction =numOne - numTwo;
		int multiplying =numOne * numTwo;
		double devision = (float)numOne / (float)numTwo;  //used double as devision result will be decimial
		int moduls = numOne % numTwo ;			
			
		System.out.println("\nResult of \"Addition\" is ="+addition);
		System.out.println("\nResult of \"Subtraction\" is ="+subtraction);
		System.out.println("\nResult of \"Multiply\" is ="+multiplying);
		System.out.println("\nResult of \"Division\" is ="+devision);
		System.out.println("\nResult of \"Moduls\" is ="+moduls);
			
			}
	}
		
		

