import model.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        pelicula.nombre = "Encanto";
        pelicula.fechaLanzamiento = 2021;
        pelicula.duracionEnMinutos = 120;
        pelicula.sumarEvaluaciones(7.8);
        pelicula.sumarEvaluaciones(10.0);
        pelicula.muestraFichaTecnica();
        System.out.println(pelicula.mediaEvaluaciones());

        Pelicula pelicula1 = new Pelicula();
        pelicula1.nombre = "Matrix";
        pelicula1.fechaLanzamiento = 1998;
        pelicula1.duracionEnMinutos = 180;
        pelicula1.sumarEvaluaciones(8.9);
        pelicula1.sumarEvaluaciones(9.5);
        pelicula1.sumarEvaluaciones(10);
        pelicula1.muestraFichaTecnica();
        System.out.println(pelicula1.mediaEvaluaciones());
    }
}
