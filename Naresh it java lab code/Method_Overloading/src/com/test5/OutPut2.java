package com.test5;

class OutPut2
{
    public static void main(String [] args)
    {
        Count4 count = new Count4();
        count.count3();
    }
}

class Count3 extends Count4
{
    Count3()
    {

    }
}
class Count4
{
    void count3()
    {
        int i = 5;
        System.out.print("Output = ");

        for (int x = 0; x <= (i % 7); x += 1)
        {
            System.out.print(" " + x);
        }
    }
}