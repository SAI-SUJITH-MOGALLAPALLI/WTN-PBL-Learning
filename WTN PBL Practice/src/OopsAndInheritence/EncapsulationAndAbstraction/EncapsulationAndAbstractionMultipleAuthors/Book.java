package OopsAndInheritence.EncapsulationAndAbstraction.EncapsulationAndAbstractionMultipleAuthors;

public class Book {
	String name;
	Author author;
	double price;
	int qtyInStock;
	Book(String name,Author author,double price,int qtyInStock){
		this.author=author;
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
}
