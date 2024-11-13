package com.test4;

public class OopsTest1
{
    public String nit()
    {
        return "Welcome ";
    }

    public static void main(String[] args)
    {
    	OopsTest1 n = new OopsTest1();
        System.out.print(n.nit());
        OopsTest1 nit1 = new NIT1();
        System.out.print(nit1.nit());
    }
}
class NIT1 extends OopsTest1
{
	 public String nit()
	    {
	        return "to NareshIT ";
	    }
}	