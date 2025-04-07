package model;

public class Persona {
    public String nombre;
    public int edad;
    public void cumplirAnios(){
        edad++;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

