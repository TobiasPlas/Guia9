
package Entidades;


public class Cadena {
    
    private String frase;
    private int largo;

    public Cadena(String frase) {
        this.frase = frase;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public int getLargo() {
        return largo;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
   
}
