import java.util.Scanner;
public class  IT24102789Lab5Q1{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first integer: ");
	int firstInteger = input.nextInt();

	System.out.print("Enter the second integer: ");
	int secondInteger = input.nextInt();

	System.out.print("Enter the third integer: ");
	int thirdInteger = input.nextInt();

	int smallest = firstInteger;
	int largest = firstInteger;

	if(secondInteger<smallest){
		smallest = secondInteger;
	}	
	if(secondInteger>largest){
		largest = secondInteger;
	}	
	if(thirdInteger<smallest){
		smallest = thirdInteger;
	}
	if(thirdInteger>largest){
		largest = thirdInteger;
	}	
	System.out.println("");
	System.out.println("User enterd numbers are : "+firstInteger+" "+secondInteger+" "+thirdInteger+" " );
	System.out.println("The Smallest number is: "+smallest);
	System.out.println("The Largest nuber is: "+largest);
	}
}