package sam;

import java.util.ArrayList;
import java.util.List;
//ImpBook is an implementing class for interface BookDAO.
public class ImpBook implements BookDAO {
List<Books> books;
public ImpBook() {
	books=new ArrayList<Books>();
	books.add(new Books(1,"Java"));
	books.add(new Books(2,"Python"));
	books.add(new Books(3,"Php"));
	
}
	@Override
	public void SaveBook(Books b) {
		
		books.add(b);//Books is our database.
		}

	@Override
	public List<Books> getAllBooks() {
		
		return books;//getting books list from ArrayList books.
	}

	@Override
	public Books getBooksById(int isbn) {
		
		Books b=books.get(isbn);
		return b;
	}

	@Override
	public void deleteBook(Books b) {
		books.remove(b);
		
	}

}
