package com.aluracursos.screenmatch.annotation;
import java.time.LocalDate;
import java.time.Period;

// para identidad String validar de 0 a 9 con "[0-9]" y numeros con "^[0-9]"
public class ValidarUsuario {
    public static boolean validador(Usuario usuario) {
        boolean mayorDeEdad=false;
        if(!usuario.getNombre().matches("[a-zA-Záàâãéèêíïóôõöúçñ\\s]+")){
            System.out.println("nombre "+usuario.getNombre()+" Invalido");
            return false;
        }
        if(!usuario.getIdentidad().matches("[0-9]+")){
            System.out.println("identidad "+usuario.getIdentidad()+" Invalida");
            return false;
        }
        mayorDeEdad=Period.between(usuario.getFechaNacimiento(), LocalDate.now()).getYears() >= 18;
        if (!mayorDeEdad){
            System.out.println("Usuario no es mayor de edad, fecha nacimiento "+usuario.getFechaNacimiento());
        }
        return mayorDeEdad;
    }
}
