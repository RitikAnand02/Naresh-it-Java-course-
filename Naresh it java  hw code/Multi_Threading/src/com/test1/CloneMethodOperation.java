package com.test1;

class Customer implements Cloneable
{
	private Integer customerId;
	private String customerName;
	
	public Customer(Integer customerId, String customerName)
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	@Override
	public String toString() 
	{			
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	
	public void setCustomerId(Integer customerId) 
	{
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}	
}

public class CloneMethodOperation
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
       Customer c1 = new Customer(111, "Scott");                
       Customer c2 = (Customer) c1.clone();  //Down casting
       
       System.out.println("Before Change :");
       System.out.println(c1);
       System.out.println(c2);
   
       System.out.println("After Change :");
       c2.setCustomerId(222);
       c2.setCustomerName("Smith");
       System.out.println(c1);
       System.out.println(c2);
       
       System.out.println(".............");
       System.out.println(c1.hashCode());
       System.out.println(c2.hashCode());
             
	}
}
