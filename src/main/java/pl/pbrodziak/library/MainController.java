package pl.pbrodziak.library;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class MainController {
    private BookRepository bookRepository;

    public MainController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public ResponseEntity<?> getHomePage() {
        List<Book> bookList = bookRepository.findAll();
        return new ResponseEntity<>(bookList, HttpStatus.ACCEPTED);
    }


}
