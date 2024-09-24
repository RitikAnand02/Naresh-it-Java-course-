class ProfitAndLossFormulas 
{
	public static void main(String[] args) 
	{
		double cp = Double.parseDouble(args[0]);
		double sp = Double.parseDouble(args[1]);
		
		double profit = sp - cp;
		double loss = cp - sp;
		
		double profitPercentage = (profit /cp) * 100;
		double lossPercentage = (loss / cp) * 100;
		
		System.out.println("Profit: " + profit);
		System.out.println("Loss: " + loss);
		System.out.println("Profit Percentage: " + profitPercentage);
		System.out.println("Loss Percentage: " + lossPercentage);
	}
}
