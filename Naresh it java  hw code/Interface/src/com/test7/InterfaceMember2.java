package com.test7;

@FunctionalInterface
interface Beta
{
	public String toString();
	
	public int hashCode();
	
	public boolean equals(Object obj);
	
	void accept(); //SAM
	
}

public class InterfaceMember2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Note : A functional interface can also contain Object class method.

