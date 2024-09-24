class MultiplyTwoFloat 
{
	public static void main(String[] args) 
	{
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		
		float result = (float)num1 *(float) num2;
		
		System.out.println("Result: "+ result);
	}
}
