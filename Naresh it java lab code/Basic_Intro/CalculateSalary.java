public class CalculateSalary 
{
	public static void main(String[] args) 
	{
		double salary=Double.parseDouble(args[0]);
		double hra=salary*0.15;
		double conveyance=salary*0.15;
		double entertainment_allowence=salary*0.10;

		double total_salary=hra+conveyance+entertainment_allowence;

		System.out.println("the salary is"+salary);
		System.out.println("the hra of the salary"+hra);
		System.out.println("the conveyance of salary is"+conveyance);
		System.out.println("the entertainment allowance is"+entertainment_allowence);
		System.out.println("the total salary is "+total_salary);
	}
}