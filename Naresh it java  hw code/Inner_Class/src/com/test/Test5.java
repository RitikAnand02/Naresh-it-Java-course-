package com.test;

class Car 
{    
    private String name;
    private String model;
    private Engine engine; 

   public Car(String name, String model, int horsePower) 
   {
        this.name = name;
        this.model = model;
        this.engine = new Engine(horsePower);
    }

   //Inner class
   private class Engine 
   {
      private int horsePower;

       public Engine(int horsePower)
	   {
            this.horsePower = horsePower;
       }

        public void start() 
		{
            System.out.println("Engine started! Horsepower: " + horsePower);
        }

        public void stop() 
	    {
            System.out.println("Engine stopped.");
        }
    }

    public void startCar() 
	{
        System.out.println("Starting " + name + " " + model);
        this.engine.start();
    }

    public void stopCar() 
	{
        System.out.println("Stopping " + name + " " + model);
        this.engine.stop();
    }
}
public class Test5
{

    public static void main(String[] args) {
        
        Car myCar = new Car("Swift", "Desire", 1200);

        myCar.startCar();

        myCar.stopCar();
    }
}
