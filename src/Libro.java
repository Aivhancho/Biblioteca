public class Libro extends Publicacion implements Prestable {

    public Libro(String isbn, String titulo, int anio) {
        super(isbn, titulo, anio);
    }

    @Override
    public void presta() {

    }

    @Override
    public void devuelve() {

    }

    @Override
    public void estaPrestado() {

    }
}
