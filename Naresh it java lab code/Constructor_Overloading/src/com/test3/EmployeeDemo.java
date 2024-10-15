package com.test3;

public class EmployeeDemo {

	public static void main(String[] args) {
       Employee e1 = new Employee("ritik",50,"developer",20000,"good");
       Employee e2 = new Employee("aman",60,"tester",10000,"average");
       Employee e3 = new Employee("roushan",55,"software",25000,null);
       
       e1.updateSalary();
       e2.updateSalary();
       e3.updateSalary();
       
       System.out.println(e1);
       System.out.println(e2);
       System.out.println(e3);
	}

}
