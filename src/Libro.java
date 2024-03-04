public class Libro extends Publicacion implements Prestable {
    public boolean prestado;
    public Libro(String isbn, String titulo, int anio, boolean prestado) {
        super(isbn, titulo, anio);
        this.prestado = prestado;
    }

    @Override
    public void presta() {
        if (this.prestado){
            System.out.println("El libro ya está prestado");
        }else {
            this.prestado=true;
        }
    }

    @Override
    public void devuelve() {
        if (this.prestado){
            this.prestado=false;
        }else {
            System.out.println("El libro no estaba prestado");
        }
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }
}
