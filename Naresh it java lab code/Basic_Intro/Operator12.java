public class Operator12
{
public static void main(String[] args)
{
	int a = 20, b=10;

   if((a<b) && (++b < 20))
	{
	   System.out.println("Logical AND ");
	}
	else
	{
		System.out.println("b value is : "+b);
	}
}
}