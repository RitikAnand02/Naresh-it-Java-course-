package com.test;

public class Test16 {
public static void main(String[] args) {
	//Integer pooling --> Object Pooling  -> cache(pre occupied memory)
	/* (-128   to  127  = 256 (byte range))
	 * 
	 * Pool
	 * ======
	 * 1000x : value = 100    
	 * 
	 */
	Integer i1 = 100; //Integer.valueOf(100) //1000x : value = 100
	Integer i2 = 100; //Integer.valueOf(100) //1000x
	
	System.out.println("i1==i2: "+(i1==i2));  
    System.out.println(i1.equals(i2));
	
	System.out.println(System.identityHashCode(i1));
	System.out.println(System.identityHashCode(i2));
	
	Integer i3 = new Integer(100);
	Integer i4 = new Integer(100);
	
	System.out.println("i3==i4: "+(i3==i4));  //false
	System.out.println(System.identityHashCode(i3));
	System.out.println(System.identityHashCode(i4));
	
	Integer i5 = Integer.valueOf(100);
	Integer i6 = Integer.valueOf(100);
	System.out.println("i5==i6: "+(i5==i6));  //true
	System.out.println(System.identityHashCode(i5));
	System.out.println(System.identityHashCode(i6));
}
}
