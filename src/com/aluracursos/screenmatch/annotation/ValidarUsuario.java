package com.aluracursos.screenmatch.annotation;
import java.time.LocalDate;
import java.time.Period;

// para identidad String validar de 0 a 9 con "[0-9]" y numeros con "^[0-9]"
// tambien puedo validar letra y numeros para un nombre
public class ValidarUsuario {
    public static boolean validador(Usuario usuario) {
        boolean mayorDeEdad=false, nombreCorrecto=false, identidadCorrecta=false;
        if(!usuario.getNombre().matches("[a-zA-Z0-9áàâãéèêíïóôõöúçñ\\s]+")){
            System.out.println("nombre "+usuario.getNombre()+" Invalido");
            return false;
        }
        nombreCorrecto=true;
        if(!usuario.getIdentidad().matches("[0-9]+")){
            System.out.println("identidad "+usuario.getIdentidad()+" Invalida");
            return false;
        }
        identidadCorrecta=true;
        mayorDeEdad=Period.between(usuario.getFechaNacimiento(), LocalDate.now()).getYears() >= 18;
        if (!mayorDeEdad){
            System.out.println("Usuario no es mayor de edad, fecha nacimiento "+usuario.getFechaNacimiento());
        }
        return (mayorDeEdad && nombreCorrecto && identidadCorrecta);
    }
}
