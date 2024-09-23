public class WholeSellerBill
{
	public static void main(String[] args) 
	{
		double amount = Double.parseDouble(args[0]);
		if(amount<5000)
		{
			double discount1 = 5.0;
			double discountBill = (amount * discount1)/100;
			double netBill = amount - discountBill;
				System.out.println("Discount Bill: " + discountBill);
		        System.out.println("Net Bill: " + netBill);
		}
		else if(amount>=5000 && amount< 10000)
		{
			double discount2 = 10.0;
			double discountBill = (amount * discount2)/100;
			double netBill = amount - discountBill;
				System.out.println("Discount Bill: " + discountBill);
		        System.out.println("Net Bill: " + netBill);
		}
		else if(amount>=10000)
		{
			double discount3 = 15.0;
			double discountBill = (amount * discount3)/100;
			double netBill = amount - discountBill;
				System.out.println("Discount Bill: " + discountBill);
		        System.out.println("Net Bill: " + netBill);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
			
	}
}
