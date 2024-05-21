package Arbol;

public class Arbol {
    //nodo raiz del arbol
    private Nodo raiz;

    //constructor de la clase arbol
    public Arbol(){
        raiz = null;
    }

    //insertar un nodo con el valor dato, di el arbol esta vacio se crea un nodo
    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }

    }
    //si no tiene valor nulo, se inserta en un orden
    public void insertar(Nodo padre, int dato){
        if(dato < padre.valorNodo()){
            if(padre.subarbolIzdo() == null){
                Nodo nuevo = new Nodo(dato);
                padre.setRamaIzdo(nuevo);
            }else{
                insertar(padre.subarbolIzdo(), dato);
            }
        }else if(dato > padre.valorNodo()){
            if(padre.subarbolDcho() == null){
                Nodo nuevo = new Nodo(dato);
                padre.setRamaDcho(nuevo);
            }else{
                insertar(padre.subarbolDcho(), dato);
            }
        }
    }
}

