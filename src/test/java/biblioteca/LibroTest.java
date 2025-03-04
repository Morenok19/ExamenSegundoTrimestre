package biblioteca;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    Libro libro;
    @BeforeEach

    void setUp() {
        new Libro("Harry Potter y la piedra Filosofal", "JK Rowling", 1995);


    }
}