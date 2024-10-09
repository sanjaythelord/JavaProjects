package sam;

import java.util.ArrayList;

public class ListBooks {
public static void main(String[] args) {
BookDAO b=new ImpBook();
ArrayList<Books> c= (ArrayList<Books>) b.getAllBooks();
for(Books x:c) {
	//for(Books x:b.getAllBooks())
System.out.println("ISBN: "+x.getIsbn()+" BookNmae: "+x.getBookname());
}
//getBookId(int isbn)
System.out.println("..............Displaying indexed value............");
Books y=b.getBooksById(2);
System.out.println(y.getIsbn() +"------>"+ y.getBookname());
//adding book
Books bs=new Books();
bs.setIsbn(4);
bs.setBookname("Dot net");
b.SaveBook(bs);
b.getAllBooks();
for(Books x:c) {
	//for(Books x:b.getAllBooks())
System.out.println("ISBN: "+x.getIsbn()+" BookNmae: "+x.getBookname());
}
//deleting books
System.out.println(".......After deleting........");
Books b3=b.getBooksById(2);
b.deleteBook(b3);
for(Books x:c) {
	//for(Books x:b.getAllBooks())
System.out.println("ISBN: "+x.getIsbn()+" BookNmae: "+x.getBookname());
}
}
}
