package mate.academy.biblio;

import mate.academy.biblio.model.Book;
import mate.academy.biblio.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBookApplication {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBookApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book irrationalThink = new Book();
            irrationalThink.setTitle("Irrational Think");
            irrationalThink.setAuthor("Den Ariel");

            bookService.save(irrationalThink);

            System.out.println(bookService.findAll());
        };
    }
}
