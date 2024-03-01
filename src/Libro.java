public class Libro extends Publicacion implements Prestable {
    private boolean prestado;
    public Libro(String isbn, String titulo, int anio) {
        super(isbn, titulo, anio);
    }

    @Override
    public void presta() {
        this.prestado=true;
    }

    @Override
    public void devuelve() {
        this.prestado=false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }
}
