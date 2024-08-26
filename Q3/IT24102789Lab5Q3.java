import java.util.Scanner;
public class IT24102789Lab5Q3{
	public static void main(String[] args){
		double Room_Charge_Per_Day = 48000.00;
		double Discount_3_To_4_Days = 0.1; 
		double Discount_5_Or_More_Days = 0.2;

		int startDate, endDate, numberOfDaysReserved;
		double totalAmountBeforeDiscount, discountAmount, totalAmountToBePaid; 
	
		double discountRate = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Start Date (1-31): ");
		startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		endDate = input.nextInt();
		
		if(startDate<1 || startDate>31 || endDate<1 || endDate >31 ) {
			System.out.print("Error: Days must be between 1 and 31");
			return;
		}
		
		if(startDate>= endDate){
			System.out.print("Error: Start Date must be less than End Date");
		return;
		}
		
		numberOfDaysReserved = endDate-startDate;

		if(numberOfDaysReserved>=3 && numberOfDaysReserved <=4){
			discountRate = Discount_3_To_4_Days;
		}
		else if(numberOfDaysReserved>=5){
			discountRate = Discount_5_Or_More_Days;
		}
		

		totalAmountBeforeDiscount = numberOfDaysReserved*Room_Charge_Per_Day;
		discountAmount = totalAmountBeforeDiscount*discountRate;
		totalAmountToBePaid = totalAmountBeforeDiscount-discountAmount;
		
		System.out.println("");
		System.out.println("Room Charge Per Day: Rs. 48000.0/=");
		System.out.println("Number of Days Reserved: "+ numberOfDaysReserved);
		System.out.println("Total Amount to be Paid: "+ totalAmountToBePaid);
		
	}
}