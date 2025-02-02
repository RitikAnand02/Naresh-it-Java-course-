package com.test;

class Person
{
    private String name;
    private int age;
    private Heart heart;

    public Person(String name, int age)
	{
        this.name = name;
        this.age = age;
        this.heart = new Heart();
    }

    public void describe() 
	{
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Heart beats per minute: " + this.heart.getBeatsPerMinute());
    }

    // Inner class representing the Heart
    private class Heart 
	{
        private int beatsPerMinute;

        public Heart() 
		{
            this.beatsPerMinute = 72; 
        }

        public int getBeatsPerMinute() 
		{
            return this.beatsPerMinute;
        }

        @SuppressWarnings("unused")
		public void setBeatsPerMinute(int beatsPerMinute) 
		{
            this.beatsPerMinute = beatsPerMinute;
        }
    }
}
public class Test7
{
    public static void main(String[] args)
	{
        Person person = new Person("Virat", 30);
        person.describe();
    }
}