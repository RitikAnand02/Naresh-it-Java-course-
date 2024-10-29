class CelsiusToFahrenheit 
{
	public static void main(String[] args) 
	{
		double celsius = Double.parseDouble(args[0]);
		
	    double fahrenheit = ((9*celsius)/5)+32;
		
		System.out.println(" Celsius To Fahrenheit: " + fahrenheit);
	}
}
