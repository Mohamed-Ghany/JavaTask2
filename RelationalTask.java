import java.util.Scanner;
/*create program that take two numbers and print the following relation:
 *Number one is < number 2 : true|false *Number one is =< number 2 : true|false 
 *Number one is > number 2 : true|false *Number one is => number 2 : true|false
 *Number one is == number 2 : true|false *Number one is != number 2 : true|false
 */
public class RelationalTask {
	
		public static void main(String[] args) { //main method
			
			int numOne;
			int numTwo;
			
			System.out.println("Hello Customer..Please follow the below steps to get the Relational Result ");
			
			Scanner relation =new Scanner(System.in); // create object from Scanner written only one time , its name"relation"
			
			System.out.println("Enter the 1st number :");
			numOne =relation.nextInt();
			
			System.out.println("Enter the 2nd number :");
			numTwo =relation.nextInt();
			
			System.out.println("The numbers You've entered are :"+numOne+" & "+numTwo);
		
			 boolean result = numOne > numTwo; //means make comparison: Is num1 > num 2 ?

				System.out.println("\nNumber one is > number 2 result is : "+result);
				//----
				 result = numOne >= numTwo; // will not write boolean again as already "Result" was declared before in the same method
				System.out.println("Number one is >= number 2 result is :" +result);
				//====

				result = numOne < numTwo; 
				System.out.println("Number one is < number 2 result is :" +result);
				//----
				result = numOne <= numTwo; 
				System.out.println("Number one is <= number 2 result is :" +result);
				//====

				result = numOne == numTwo;
				System.out.println("Number one is == number 2 result is :" +result);
				//----
				result = numOne != numTwo; 
				System.out.println("Number one is != number 2 result is :" +result);
				//====
				
		}
			

}
