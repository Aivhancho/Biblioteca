public class Publicacion {
    String isbn;
    String titulo;
    int anio;

    public Publicacion(String isbn, String titulo, int anio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
    }
    @Override
    public String toString() {
        return "Publicacion{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
