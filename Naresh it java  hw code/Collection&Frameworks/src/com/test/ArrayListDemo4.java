package com.test;

//Serialization and De-serialization on ArrayList Object

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo4
{ 
public static void main(String[] args) throws IOException 
{
	ArrayList<String> listOfIceCream = new ArrayList<>();
	listOfIceCream.add("Vanila");
	listOfIceCream.add("Strwbarry");
	listOfIceCream.add("Butter Scotch");
	
	 //Serialization Operation
   var fos = new FileOutputStream("D:\\new\\IceCream.txt"); 	
	 var oos = new ObjectOutputStream(fos);
	 
	 try(fos ; oos)
	 {
		 oos.writeObject(listOfIceCream);
		 System.out.println("Data Stored in the file");
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
   
	 //De-Serialization
	 var fin = new FileInputStream("D:\\new\\IceCream.txt");
	 var ois = new ObjectInputStream(fin);
	 
	 try(fin ; ois)
	 {
		ArrayList<String> list = (ArrayList<String>) ois.readObject();
		System.out.println(list);
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }	   
		
}       
}         
