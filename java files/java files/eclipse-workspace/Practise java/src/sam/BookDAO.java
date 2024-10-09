package sam;

import java.util.List;

public interface BookDAO {
void SaveBook(Books book);
public List<Books>getAllBooks();
Books getBooksById(int isbn);
void deleteBook(Books book);
}
