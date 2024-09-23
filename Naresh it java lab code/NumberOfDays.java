public class NumberOfDays 
{
	public static void main(String[] args) 
	{
		int days = Integer.parseInt(args[0]);
		int year,month,week,day;
		 year = days/365;
		 days = days%365;
		 month = days/30;
		 days = days%30;
		 week = days/7;
		 day = days%7;
		 
		 System.out.println("Number Of Days: " + day);
		 System.out.println("Number Of Week: " + week);
		 System.out.println("Number Of Month: " + month);
		 System.out.println("Number Of Year: " + year);
		 
		 
		 
	}
}
