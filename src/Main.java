import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libro libro1=new Libro("jkjsdka", "El Quijote", 1600, false);
        Revista revista1 = new Revista("sss", "Cuerpo y mente", 2023, 1);
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Prestar libro");
            System.out.println("2. Devolver");
            System.out.println("3. Comprobar si está prestado");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    libro1.presta();
                    break;
                case 2:
                    libro1.devuelve();
                    break;
                case 3:
                    if (libro1.estaPrestado()){
                        System.out.println("El libro está prestadp");
                    }else {
                        System.out.println("El libro NO está prestado");
                    }
                            break;
            }
        }while (opcion!=0);

    }
}