package com.test5;

class OutPut
{
    public static void main(String[] args)
    {
        new Alpha();
        new Base();
    }
}
class Alpha extends Base
{
    Alpha()
    {
        System.out.print("Base");
    }
}
class Base
{  
    Base()
    {
        System.out.println("Base");
    }
}
