package biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase biblioteca con una coleccion de libros.
 * Entre sus métodos tenemos busqueda por autor, por titulo y también una funcion
 * para añadir libros.
 * @see Libro
 * @author David Gómez Moreno
 * @version 04.03.2025
 */

public class Biblioteca {
    // TODO: Documentar estos atributos
    /**
     * Este atributo corresponde a una lista de libros llamada "libros"
     */
    private final List<Libro> libros;
    // TODO: Documentar este método

    /**
     * Este metodo es un constructor por defecto de la clase libros, pero vacío
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }
    // TODO: Documentar este método.
// Test: NO HAY QUE TESTEAR ESTE METODO

    /**
     * Corresponde a la incialización de la lista de libros
     * @param libros
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }
    // TODO: Testear este metodo.
// Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }
    // TODO: Testear este metodo.
// Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }
    // TODO: Documentar este método

    /**
     * Devuelve la lista de los libros que tengamos en la biblioteca
     * @return lista de libros
     */
    public List<Libro> getLibros() {
        return libros;
    }
    // TODO: Documentar este método.
// Test 01: buscar libro existente y comprobar que lo localiza.
// Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Este metodo busca el titulo de un libro y lo devuelve en caso de que exista
     * @param titulo
     * @return libro si existe y null si no existe
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
    // TODO: Documentar este metodo.
// No testearlo
// Este metodo está obsoleto. Hay que documentarlo como tal.
// Recuerda: las anotaciones @deprecated y @link a la nueva
// versión mejorada encuentraLibrosPorAutor(...)
// En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * @deprecated Este metodo está obsoleto, se recomienda usar {@link #encuentraLibrosPorAutor(String)}
     * Sirve para buscar libros de un autor.
     * @param autor
     * @return devuelve un solo libro del autor introducido
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }
    // TODO: Documentar este metodo
// Este metodo sustituye al metodo anterior. Está disponible desde la
// versión 2.0. Hay que documentarlo teniéndolo en cuenta.
// TODO: Testear este metodo.
// Test: Comprobar la lista de libros que devuelve para un autor existentes.
// Test: Comprobar la lista de libros que devuelve para un autor No existente.

    /**
     * Este metodo es la version actualizada de {@link #encuentaLibroPorAutor(String)}
     * Busca todos los libros del autor introducido
     * @param autor
     * @return devuelve una lista de libros del autor introducidos
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
