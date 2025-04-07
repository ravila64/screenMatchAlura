import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.model.Persona;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre("Encanto");
        pelicula.setFechaLanzamiento(2021);
        pelicula.setDuracionEnMinutos(120);
        pelicula.setIncluidoEnPlan(true);
        pelicula.sumarEvaluaciones(7.8);
        pelicula.sumarEvaluaciones(10.0);
        pelicula.muestraFichaTecnica();
        System.out.println("Media de "+pelicula.getNombre()+ " es: "+pelicula.mediaEvaluaciones());

        Pelicula pelicula1 = new Pelicula();
        pelicula1.setNombre("Matrix");
        pelicula1.setFechaLanzamiento(1998);
        pelicula1.setDuracionEnMinutos(180);
        pelicula1.sumarEvaluaciones(8.9);
        pelicula1.sumarEvaluaciones(9.5);
        pelicula1.sumarEvaluaciones(10);
        pelicula1.muestraFichaTecnica();
        System.out.println("Media de "+pelicula1.getNombre()+ " es: "+pelicula1.mediaEvaluaciones());

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(25);
        System.out.println(persona.toString());
        persona.cumplirAnios();
        System.out.println(persona.toString());
        persona.setEdad(40);
        System.out.println("Nombre "+persona.getNombre());
        System.out.println("Edad   "+persona.getEdad());

        Persona persona2 = new Persona();
        persona2.setNombre("Carlos");
        persona2.setEdad(30);
        System.out.println(persona2.toString());
        persona2.cumplirAnios();
        System.out.println(persona2.toString());
        persona2.setEdad(35);
        System.out.println("Nombre-2 "+persona2.getNombre());
        System.out.println("Edad-2   "+persona2.getEdad());


    }
}
