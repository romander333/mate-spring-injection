package mate.academy.biblio.repository;

import java.util.List;
import mate.academy.biblio.model.Book;

public interface BookRepository {

    Book save(Book book);

    List<Book> findAll();
}
