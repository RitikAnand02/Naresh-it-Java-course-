package com.test5;

class OutPut4
{
    public static void main(String s[])
    {
        int i = 2;
        B b = new B();
        b.execute();
    }
}

class A
{
    int i = 0;
    A(){}
}

class B extends A
{
    void execute()
    {
        for(; i < 6; i++)
        
            switch(i)
            {
                case 0:
                System.out.println("i is zero.");
                break;
        
                case 1:
                System.out.println("i is one.");
                break;
        
                case 2:
                System.out.println("i is two.");
                continue;
        
                case 3:
                System.out.println("i is three.");
                break;
        
                default:
                System.out.println("i is greater than three.");
            }
    }
}
