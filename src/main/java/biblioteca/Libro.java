package biblioteca;

public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Atributos de la clase Libro
     * dos String y un Integer
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Metodo que nos devuelve toda la información que tenemos en la biblioteca sobre un libro
     * (titulo, autor y año de publicación)
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * Metodo que nos devuelve el nombre de un autor
     * @return nombre del autor
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * Metodo que devuelve el año de publicación
     * @return año de publicacion
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
