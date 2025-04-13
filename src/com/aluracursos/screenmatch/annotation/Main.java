package com.aluracursos.screenmatch.annotation;

import java.time.LocalDate;
import java.time.Month;
import static com.aluracursos.screenmatch.annotation.ValidarUsuario.validador;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(LocalDate.of(1995, Month.MARCH, 14), "42198284863", "Maria");
        if (validador(usuario)) {
            System.out.println("Datos correctos de usuario");
        } else {
            System.out.println("Usuario con datos invalidos");
        }
        Usuario usuario2 = new Usuario(LocalDate.of(2010, Month.APRIL, 01), "1234567890", "Jose");
        if (validador(usuario2)) {
            System.out.println("Datos correctos de usuario2 " + usuario2.getNombre());
        } else {
            System.out.println("Usuario con datos invalidos " + usuario2.getNombre());
        }
    }
}