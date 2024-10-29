class SurfaceAreaOfCylinder 
{
	public static void main(String[] args) 
	{
		double r = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		
		final double pi = 3.14;
	     
		double area = 2*pi*r*r*h;
		
		System.out.println("Surface Area Of Cylinder: " + area);
	}
}
