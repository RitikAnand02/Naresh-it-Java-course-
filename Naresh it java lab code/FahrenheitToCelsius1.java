class FahrenheitToCelsius1 
{
	public static void main(String[] args) 
	{
		double fahrenheit = Double.parseDouble(args[0]);
		
	    double celusis = (fahrenheit-32)*5/9;
		
		System.out.println("Fahrenheit To Celsius: " + celusis);
	}
}
