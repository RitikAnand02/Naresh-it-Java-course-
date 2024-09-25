class CompoundInterest 
{
	public static void main(String[] args) 
	{
		double principle = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		
		double amount = principle*3*(1+(rate/100));
		
		System.out.println("Compound Interest: " + amount);
	}
}
