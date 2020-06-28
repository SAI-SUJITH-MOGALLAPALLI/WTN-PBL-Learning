package OopsAndInheritence.EncapsulationAndAbstraction.EncapsulationAndAbstraction1;

public class EncapsulationAndAbstraction1 {
	public static void main(String[] args) {
		Book book=new Book("BookName",new Author("AuthorName","author@email",'m'), 1000, 2);
		System.out.println("Name of the Book:"+book.getName());
		System.out.println("Author:"+book.getAuthor().name);
		System.out.println("Author email:"+book.getAuthor().email);
		System.out.println("Author gender:"+(book.getAuthor().gender=='m'?"Male":"Female"));
		System.out.println("Book Price:"+book.price);
		System.out.println("Quantity:"+book.qtyInStock);
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