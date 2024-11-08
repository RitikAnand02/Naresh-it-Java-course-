package com.test4;

public class Main {

	public static void main(String[] args) {
        BookBorrowing b1 = new BookBorrowing("", "Alice");
        DVDBorrowing d1 = new DVDBorrowing("", "Alice");
        MagazineBorrowing m1 = new MagazineBorrowing("Time", "Charlie");
        LibraryManager l1 = new LibraryManager();
        
        String bookTitle = b1.getBookTitle();
        System.out.println("Book Title: "+bookTitle);
        
        String borrowerName = b1.getBorrowerName();
        System.out.println("Borrower Name: "+borrowerName);
        System.out.println();
        
        String dvdTitle = d1.getDvdTitle();
        System.out.println("DVD Title: "+dvdTitle);
        
        String borrowerName1 = d1.getBorrowerName();
        System.out.println("Borrower Name: "+borrowerName1);
        System.out.println();
        
        String magazineTitle = m1.getMagazineTitle();
        System.out.println("Magazine Title: "+magazineTitle);
        
        
        String borrowerName2 = m1.getBorrowerName();
        System.out.println("Borrower Name: "+borrowerName2);
        System.out.println();
        l1.borrowItem(m1);
        l1.borrowItem(b1);
        l1.borrowItem(d1);

	}

}
