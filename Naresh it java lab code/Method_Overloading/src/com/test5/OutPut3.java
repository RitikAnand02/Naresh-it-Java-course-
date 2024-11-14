package com.test5;

class OutPut3
{
    public static void main(String [] args)
    {
        Count6 count = new Count6();
        count.count5();
    }
}

class Count5 extends Count6
{
    Count5()
    {

    }
}
class Count6
{
    void count5()
    {
        int i = 5;
        System.out.print("Output = ");

        for (int x = 0; x <= (i % 7); x += 1)
        {
            System.out.print(" " + x);
            i++;
        }
    }
}