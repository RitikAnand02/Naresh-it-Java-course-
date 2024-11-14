package com.test5;

class FourWheeler
{
    public static void main(String[] args)
    {
        new Car(0);
    }
}

class Vehicle
{
    int i;
    int j;

    Vehicle(int i)
    {
        this.i = i;
        j = i;
    }

    Vehicle(int i, int j)
    {
        this.i = i;
        this.j = j;
    }
}

class Bus extends Vehicle
{
    double j;

    Bus(double j)
    {
        this.j = j;
    }
}

class Car extends Vehicle
{
    Car(int i)
    {
        super(i);
        System.out.print("Executed Successfully");
    }
}
