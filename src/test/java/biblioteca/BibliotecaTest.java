package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import biblioteca.Libro;
import biblioteca.Biblioteca;

import static org.junit.jupiter.api.Assertions.*;
class BibliotecaTest {
    Biblioteca biblioteca = new Biblioteca();
    Libro libro;


    @BeforeEach
    void setUp() {
        libro = new Libro("Harry Potter y la piedra Filosofal", "JK Rowling", 1995);

    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro));

    }

    @Test
    void eliminarLibro() {
        assertFalse(biblioteca.eliminarLibro(libro));
    }

    @Test
    void encuentraLibrosPorAutor() {
        Biblioteca bibliotecaExamen = new Biblioteca();
        bibliotecaExamen.agregarLibro(this.libro);

        assertNotNull(bibliotecaExamen.getLibros());
        assertEquals(bibliotecaExamen.getLibros().size(),1);
        assertTrue(bibliotecaExamen.getLibros().contains(this.libro));

    }
}