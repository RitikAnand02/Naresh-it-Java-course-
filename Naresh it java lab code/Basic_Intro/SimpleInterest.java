public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		double principal = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		double time = Double.parseDouble(args[2]);
		
		double simpleInterest = (principal*rate*time)/100;
		double amount = simpleInterest+principal;
		
		System.out.println("Amount: " + amount);
		System.out.println("Simple Interest: " + simpleInterest);
	}
}
