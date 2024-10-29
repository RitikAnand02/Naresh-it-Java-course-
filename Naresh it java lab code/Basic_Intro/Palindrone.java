public class Palindrone 
{
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int r,rev=0;
		int temp=num1;
		while(num1!=0){
		r=num1%10;
		rev=rev*10+r;
		num1=num1/10;
	}
	if(temp==rev){
		System.out.println("the number is palindrone");
	}
	else{
		System.out.println("the number is not palindrone");
	}
}
}