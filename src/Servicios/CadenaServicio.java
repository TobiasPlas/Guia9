package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in);
    Cadena cadena1 = new Cadena();
    Cadena cadena2 = new Cadena();

    public void asignarlongitud() {
        System.out.println("Ingrese una frase");
        cadena1.setFrase(leer.nextLine());
        cadena1.setLargo(cadena1.getFrase().length());
    }

    public void mostrarVocales() {

        int contador = 0;

        for (int i = 0; i < cadena1.getLargo(); i++) {
            if (cadena1.getFrase().substring(i, i + 1).equalsIgnoreCase("a")
                    || cadena1.getFrase().substring(i, i + 1).equalsIgnoreCase("e")
                    || cadena1.getFrase().substring(i, i + 1).equalsIgnoreCase("i")
                    || cadena1.getFrase().substring(i, i + 1).equalsIgnoreCase("o")
                    || cadena1.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales son: " + contador);
    }

    public void invertirFrase() {
       
        for (int i = cadena1.getLargo() - 1; i >= 0; i--) {

            System.out.print(cadena1.getFrase().substring(i, i + 1));
        }
        System.out.println(" ");
    }

    public void vecesRepetido() {
        int contador = 0;
        System.out.println("Ingrese la letra que desee contabilizar en la frase");
        String letra = leer.next();
        for (int i = 0; i < cadena1.getLargo(); i++) {
            if (cadena1.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        System.out.println("La cantidad de veces que aparece " + letra + " en la frase es " + contador);
     
    }

    public void compararLongitud() {
              
        System.out.println("Ingrese una nueva frase");
        
        leer.nextLine();
       cadena2.setFrase(leer.nextLine());
       cadena2.setLargo(cadena2.getFrase().length());
        if (cadena1.getLargo() > cadena2.getLargo()) {
            System.out.println("La primera frase es mas larga que la primera por " + (cadena1.getLargo() - cadena2.getLargo()) + " digitos");
        } else {
            System.out.println("La segunda frase es mas larga por " + (cadena2.getLargo() - cadena1.getLargo()) + " digitos");
        }
        System.out.println(cadena2.getFrase());
    }

    public void unirFrases() {
     
        System.out.println(cadena1.getFrase().concat(" "+cadena2.getFrase()));
    }

    public void reemplazar() {
        System.out.println("Ingrese el caracter que desee cambiar en la frase por la letra a");
        System.out.println(cadena1.getFrase().replace("a", leer.next()));
    }

    public void contiene() {
        System.out.println("Ingrese una etra para buscar en la frase");
        String letra=leer.next();
        boolean respuesta=false;
        for (int i = 0; i < cadena1.getLargo(); i++) {
            if (letra.equalsIgnoreCase(cadena1.getFrase().substring(i, i+1))){
                respuesta =true;
                break;
            }
                
        }
        System.out.println("La respuesta a si la frase contiene la letra "+letra+" es: "+respuesta);
    }

}
