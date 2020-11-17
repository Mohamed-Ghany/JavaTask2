import java.util.Scanner;

public class AssignmentTask {
//Repeat task number one but only by using assignment operators 

	public static void main(String[] args) { //main method
		
		double numOne;
		int numTwo;
		System.out.println("Hello Customer..Please follow the below Steps to get Assignment Results:");
		
		Scanner assignment = new Scanner(System.in);	
	
		System.out.println("For \"+=\" Enter 1st number: ");
		numOne=assignment.nextInt();
		System.out.println("Then Enter 2nd number: ");
		numTwo=assignment.nextInt();
	
		numOne+=numTwo; 
		System.out.println("Num1+Num2 = "+numOne);
//=========================
		System.out.println("\nFor \"-=\" Enter 1st numberEnter 1st number: ");
		numOne=assignment.nextInt();
		System.out.println("Then enter 2nd number: ");
		numTwo=assignment.nextInt();
	
		numOne-=numTwo; //
		System.out.println("Num1-Num2 = "+numOne);
//========================
		System.out.println("\nFor \"*=\" Enter 1st number: ");
		numOne=assignment.nextInt();
		System.out.println("Then enter 2nd number: ");
		numTwo=assignment.nextInt();
	
		numOne*=numTwo; //
		System.out.println("Num1*Num2 = "+numOne);
//========================
		System.out.println("\nFor \"/=\" Enter 1st number: ");
		numOne=assignment.nextInt();
		System.out.println("Then enter 2nd number: ");
		numTwo=assignment.nextInt();
	
		numOne/=numTwo;
		System.out.println("Num1/Num2 = "+numOne);
//========================
		System.out.println("\nFor \"%=\" Enter 1st number: ");
		numOne=assignment.nextInt();
		System.out.println("Then Enter 2nd number: ");
		numTwo=assignment.nextInt();
	
		numOne%=numTwo; //
		System.out.println("Num1%Num2 = "+numOne);
//========================
assignment.close();
	
}
}
