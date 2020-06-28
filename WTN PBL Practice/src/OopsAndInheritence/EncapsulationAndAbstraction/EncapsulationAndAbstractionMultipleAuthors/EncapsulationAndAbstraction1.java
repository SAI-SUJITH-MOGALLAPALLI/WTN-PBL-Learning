package OopsAndInheritence.EncapsulationAndAbstraction.EncapsulationAndAbstractionMultipleAuthors;

public class EncapsulationAndAbstraction1 {
	public static void main(String[] args) {
		Book[] book=new Book[5];
		for(int i=0;i<5;i++) {
			book[i]=new Book("BookName"+Integer.toString(i+1),new Author("AuthorName"+Integer.toString(i+1),"author"+Integer.toString(i+1)+"@email",'m'), 1000+(i*1000), 2+i);
		}
		for(int i=0;i<5;i++) {
			System.out.println("Name of the Book:"+book[i].getName());
			System.out.println("Author:"+book[i].getAuthor().name);
			System.out.println("Author email:"+book[i].getAuthor().email);
			System.out.println("Author gender:"+(book[i].getAuthor().gender=='m'?"Male":"Female"));
			System.out.println("Book Price:"+book[i].price);
			System.out.println("Quantity:"+book[i].qtyInStock);
		}
	}
}
/*
Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details)

*/