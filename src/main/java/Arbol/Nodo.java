package Arbol;

public class Nodo {

    protected int dato;
    protected Nodo izq;
    protected Nodo der;

    public Nodo(int valor) {
        dato = valor;
        izq = null;

    }

    public Nodo (Nodo ramaIzdo, int valor, Nodo ramaDcho) {
        dato = valor;
        izq = ramaIzdo;
        der = ramaDcho;
    }

    //operadores de acceso
    public int valorNodo() {
        return dato;
    }
    public Nodo subarbolIzdo() {
        return izq;
    }
    public Nodo subarbolDcho() {
        return der;
    }

    public void nuevoValor(int d) {
        dato = d;
    }
    public void setRamaIzdo(Nodo n) {
        izq = n;
    }
    public void setRamaDcho(Nodo n) {
        der = n;
    }


    public void imprimirDato(){
        System.out.println(this.valorNodo());
    }


}
