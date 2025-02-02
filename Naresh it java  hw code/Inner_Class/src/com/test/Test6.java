package com.test;

class Laptop 
{
    private String brand;
    private String model;
    private Motherboard motherboard;

    public Laptop(String brand, String model, String motherboardModel, String chipset) 
	{
        this.brand = brand;
        this.model = model;
        this.motherboard = new Motherboard(motherboardModel, chipset);
    }

    
    public void switchOn()
	{
        System.out.println("Turning on " + brand + " " + model);
        this.motherboard.boot();
    }

   //Motherboard inner class
   public class Motherboard 
   {
        private String model;
        private String chipset;

        
        public Motherboard(String model, String chipset) 
		{
            this.model = model;
            this.chipset = chipset;
        }

        
        public void boot() 
		{
            System.out.println("Booting " + brand + " " + model + " with " + chipset + " chipset");
        }
    }
}
public class Test6
{
    public static void main(String[] args) 
	{
        
        Laptop laptop = new Laptop("HP", "ENVY", "IRIS", "Intel");

        laptop.switchOn();
    }
}

