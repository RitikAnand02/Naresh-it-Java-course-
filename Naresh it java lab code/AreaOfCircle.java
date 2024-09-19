/*
 Write a program to find out the area of circle by taking the value
    from Command line arguments
*/

class  AreaOfCircle
{
	public static void main(String[] args) 
	{
		double r = Double.parseDouble(args[0]);
		final double pi = 3.14;
		double Area = pi*r*r;
		System.out.println("Area of Circle: " + Area);
	}
}
