package ArbolCadena;

import Arbol.Nodo;

public class NodoCadena {
    protected String dato;
    protected NodoCadena izq;
    protected NodoCadena der;

    public NodoCadena(String valor) {
        dato = valor;
        izq = null;

    }

    public NodoCadena (NodoCadena ramaIzdo, String valor, NodoCadena ramaDcho) {
        dato = valor;
        izq = ramaIzdo;
        der = ramaDcho;
    }

    //operadores de acceso
    public String valorNodo() {
        return dato;
    }
    public NodoCadena subarbolIzdo() {
        return izq;
    }
    public NodoCadena subarbolDcho() {
        return der;
    }

    public void nuevoValor(String d) {
        dato = d;
    }
    public void setRamaIzdo(NodoCadena n) {
        izq = n;
    }
    public void setRamaDcho(NodoCadena n) {
        der = n;
    }


    public void imprimirDato(){
        System.out.println(this.valorNodo());
    }
}
