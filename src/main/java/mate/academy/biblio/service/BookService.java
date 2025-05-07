package mate.academy.biblio.service;

import java.util.List;
import mate.academy.biblio.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
