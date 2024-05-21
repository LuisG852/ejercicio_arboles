package ArbolCadena;


import Arbol.Nodo;



public class ArbolCadenas {
    //nodo raiz del arbol
    private NodoCadena raiz;

    //constructor de la clase arbol
    public ArbolCadenas(){
        raiz = null;
    }

    //insertar un nodo con el valor dato, di el arbol esta vacio se crea un nodo
    public void insertar(String dato) {
        if (this.raiz == null) {
            this.raiz = new NodoCadena(dato);
        } else {
            this.insertar(this.raiz, dato);
        }

    }
    //si no tiene valor nulo, se inserta en un orden
    public void insertar(NodoCadena padre, String dato){
        if(dato.compareTo(dato)>0){
            if(padre.subarbolIzdo() == null){
                padre.setRamaIzdo(new NodoCadena(dato));
            }else{
                insertar(padre.subarbolIzdo(), dato);
            }
        }else
        if(padre.subarbolDcho()==null){
            padre.setRamaDcho(new NodoCadena(dato));

        }else{
            insertar(padre.subarbolDcho(), dato);
        }
    }
}

