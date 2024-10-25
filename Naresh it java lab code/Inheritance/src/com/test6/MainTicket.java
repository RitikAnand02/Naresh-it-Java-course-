package com.test6;

public class MainTicket {
	public static void main(String[] args) {
		Ticket t1 = new Ticket("concert",101,50.0);
		String eventName = t1.getEventName();
		System.out.println("Event Name: "+eventName);
		double price = t1.getPrice();
		System.out.println("Event Price: "+"$"+price);
		int seatNumber = t1.getSeatNumber();
		System.out.println("Event Seat Number: "+seatNumber);
		System.out.println();
		
		VIPTicket v1 = new VIPTicket("concert", 7, 100, "Backstage Access");
		String eventName1 = v1.getEventName();
		System.out.println("Event Name: "+eventName1);
		double price1 = v1.getPrice();
		System.out.println("Event Price: "+"$"+price1);
		int seatNumber1 = v1.getSeatNumber();
		System.out.println("Event Seat Number: "+seatNumber1);
		String specialAccess = v1.getSpecialAccess();
		System.out.println("Secial Accesses: "+specialAccess);
		System.out.println();
		
		StudentTicket s1 = new StudentTicket("Student Event", 301, 30, true);
		String eventName11 = s1.getEventName();
		System.out.println("Event Name: "+eventName11);
		double price11 = s1.getPrice();
		System.out.println("Event Price: "+"$"+price11);
		int seatNumber11 = s1.getSeatNumber();
		System.out.println("Event Seat Number: "+seatNumber11);
		boolean studentDiscount = s1.isStudentDiscount();	
		System.out.println("Student Discount: "+studentDiscount);
		
		
	}

}
