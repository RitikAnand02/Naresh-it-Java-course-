class CalculateProfit
{
	public static void main(String[] args) 
	{
		double cp = 32500;
		double profitPercent = 27.0;
		double servicePercent = 3.87;
		double vatPercent = 12.7;
		
		double profit = (profitPercent/100)*cp;
		double sp = cp + profit;
		double serviceCharge = (servicePercent/100)*sp;
		double vatCharge = (vatPercent/100)*sp;
		
		double totalCost = sp+serviceCharge+vatCharge;
		
		System.out.println("Cost Price" + cp);
		System.out.println("Profit: " + profit);
		System.out.println("Selling Price: " +sp);
		System.out.println("Service Charge: " + serviceCharge);
		System.out.println("Vat Charge: " +vatCharge);
		System.out.println("Total Cost: " + totalCost);
	}
}
