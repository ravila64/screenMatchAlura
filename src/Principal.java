import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.model.Episodio;
import com.aluracursos.screenmatch.model.Pelicula;
import com.aluracursos.screenmatch.examples.Persona;
import com.aluracursos.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();
        pelicula.setNombre("Encanto");
        pelicula.setFechaLanzamiento(2021);
        pelicula.setDuracionEnMinutos(120);
        pelicula.setIncluidoEnPlan(true);
        pelicula.sumarEvaluaciones(7.8);
        pelicula.sumarEvaluaciones(10.0);
        pelicula.muestraFichaTecnica("Pelicula");
        System.out.println("Media de "+pelicula.getNombre()+ " es: "+pelicula.calculaMediaEvaluaciones());

        Pelicula pelicula1 = new Pelicula();
        pelicula1.setNombre("Matrix");
        pelicula1.setFechaLanzamiento(1998);
        pelicula1.setDuracionEnMinutos(180);
        pelicula1.sumarEvaluaciones(8.9);
        pelicula1.sumarEvaluaciones(9.5);
        pelicula1.sumarEvaluaciones(10);
        pelicula1.muestraFichaTecnica("Pelicula");
        System.out.println("Media de "+pelicula1.getNombre()+ " es: "+pelicula1.calculaMediaEvaluaciones());

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

        Serie casaDragon = new Serie();
        casaDragon.setNombre("la casa del dragón");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpidisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println("Muestra Ficha Tecnica");
        casaDragon.muestraFichaTecnica("Serie");
        // ahi esta llamando el metodo de la serie @Override
        System.out.println(casaDragon.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadoraDeTiempo=new CalculadoraDeTiempo();
        calculadoraDeTiempo.incluye(pelicula);
//      System.out.println("Tiempo Total pelicula "+calculadoraDeTiempo.getTiempoTotal()+" min");
        calculadoraDeTiempo.incluye(casaDragon);
//      System.out.println("Tiempo Total serie "+calculadoraDeTiempo.getTiempoTotal()+" min");
        calculadoraDeTiempo.incluye(pelicula1);
        System.out.println("Tiempo Total peliculas+series "+calculadoraDeTiempo.getTiempoTotal()+" min");

        // filtro
        FiltroRecomendacion filtroRecomendacion= new FiltroRecomendacion();
        filtroRecomendacion.filtra(pelicula);

        // Episodio
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);

        //hacer el llamado de interfazContable

    }
}
