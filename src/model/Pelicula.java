package model;

public class Pelicula {
    public String nombre;
    public int fechaLanzamiento;
    public int duracionEnMinutos;
    public boolean incluidoEnPlan;
    public double sumaEvaluaciones;
    public int numeroEvaluaciones;

    public void muestraFichaTecnica() {
        System.out.println("Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", duracion En Minutos=" + duracionEnMinutos +
                ", fecha de Lanzamiento=" + fechaLanzamiento +
                ", incluido En Plan=" + incluidoEnPlan +
                ", suma Evaluaciones=" + sumaEvaluaciones +
                ", numero Evaluaciones=" + numeroEvaluaciones +
                '}');
    }

    public void sumarEvaluaciones(double nota) {
        sumaEvaluaciones = sumaEvaluaciones + nota;
        numeroEvaluaciones++;
    }

    public double mediaEvaluaciones(){
        return (sumaEvaluaciones/numeroEvaluaciones);
    }

}
