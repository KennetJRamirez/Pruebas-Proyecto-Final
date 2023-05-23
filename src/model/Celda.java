package model;

public class Celda {
    //Atributos de la Clase
    private Object dato;
    private Celda izquierda;
    private Celda arriba;
    private Celda abajo;
    private Celda derecha;

    /**
     * Constructor con parametros
     * @param dato Es lo que ingresa en la celda
     */
    public Celda(Object dato) {
        this.dato = dato;
        this.izquierda = izquierda;
        this.arriba = arriba;
        this.abajo = abajo;
        this.derecha = derecha;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Celda getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Celda izquierda) {
        this.izquierda = izquierda;
    }

    public Celda getArriba() {
        return arriba;
    }

    public void setArriba(Celda arriba) {
        this.arriba = arriba;
    }

    public Celda getAbajo() {
        return abajo;
    }

    public void setAbajo(Celda abajo) {
        this.abajo = abajo;
    }

    public Celda getDerecha() {
        return derecha;
    }

    public void setDerecha(Celda derecha) {
        this.derecha = derecha;
    }
    
}
