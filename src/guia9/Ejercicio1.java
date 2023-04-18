/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Servicios.CadenaServicio;

/**
 *
 * @author Stilo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CadenaServicio cadena = new CadenaServicio();

        cadena.asignarlongitud();
        cadena.mostrarVocales();
        cadena.invertirFrase();
        cadena.vecesRepetido();
        cadena.compararLongitud();
        cadena.unirFrases();
        cadena.reemplazar();
        cadena.contiene();
        
    }

}
