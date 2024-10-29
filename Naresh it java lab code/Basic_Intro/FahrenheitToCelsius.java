public class FahrenheitToCelsius 
{
	public static void main(String[] args) 
	{
		int fahrenheit=Integer.parseInt(args[0]);
		double celsius=((fahrenheit-32)*5)/9;
		System.out.println("the celsius is "+celsius);
	}
}