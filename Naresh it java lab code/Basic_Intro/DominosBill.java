import java.lang.*;
import java.util.*;
 public class DominosBill 
{
	public static void main(String[] args) 
	{
		int chicken_rolls = 60;
		int vegetable_rolls = 25;
		
		int chicken = Integer.parseInt(args[0]);
		int vegetable = Integer.parseInt(args[1]);
		
		int chicken_bill = chicken * chicken_rolls;
		int vegetable_bill = vegetable * vegetable_rolls;
		
		int total_bill = chicken_bill + vegetable_bill;
		int discount = 50;
		int final_bill = total_bill - discount;
		
		System.out.println("Final Bill: " + final_bill);
		System.out.println("Chicken Bill: " + chicken_bill);
		System.out.println("Vegetable Bill: " + vegetable_bill);
		System.out.println("Total Bill: " + total_bill);
	}
}
