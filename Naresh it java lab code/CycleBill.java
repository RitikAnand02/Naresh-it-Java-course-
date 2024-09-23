class CycleBill 
{
	public static void main(String[] args) 
	{
		int oldCyclePrice = 1200;
		int repairCost = 250;
		int colorCost = 350;
		int accessoriesCost = 500;
		int profit = 1500;
		
		int totalCost = oldCyclePrice +repairCost + colorCost + accessoriesCost;
		int sellingPrice = totalCost + profit;
		
		System.out.println("Total Cost : " + totalCost);
		System.out.println("Selling Price: " + sellingPrice);
	}
}
