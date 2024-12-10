package com.test;

public class CharacterToBinary 
{
	public static void main(String[] args) 
	{
		String str = "ABCDEF";
		
		//Character to binary
		byte []b =  str.getBytes();
		
		for(byte c : b)
		{
			System.out.println(c); //65 66 67 68 69 70
		}		
		
	}

}
