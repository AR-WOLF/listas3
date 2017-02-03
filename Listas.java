package DeberListaEnlazada;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author mjg70
 */
public class Listas {
    private Nodo primero;
    private Nodo ultimo;
    private int tamano;
    
    
    public Listas(){
    this.primero=null;
    this.ultimo=null;
    this.tamano=0;
    }
    
    public boolean esVacia(){
    return (this.primero ==null);
    }
    
    public void agregarInicio(String dato, String cedula){
    Nodo nuevo = new Nodo(dato, cedula);
    if(esVacia()){
    primero = nuevo;
    }else{
    nuevo.setNodoDer(primero);
    primero = nuevo;
    }
    tamano++;
    
    }
    
    
    public void agregarFinal(String dato, String cedula){
         /**
     * Consulta si la lista esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    if(esVacia()){
    Nodo nuevo= new Nodo(dato, cedula);
    primero=nuevo;
 
    }else{
    Nodo nuevo = new Nodo(dato, cedula);
    Nodo aux= primero;
    while(aux.getNodoDer()!=null){
    aux = aux.getNodoDer();
    }
    aux.setNodoDer(nuevo);
    
    }
    this.tamano++;
  
    
    }
    
     public boolean buscar(String consulta){
        // Crea una copia de la lista.
        Nodo aux = primero;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (consulta == aux.getCedula()){
                // Canbia el valor de la bandera.
                encontrado = true;
                
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getNodoDer();
            }
        }
        // Retorna el resultado de la bandera.
        return encontrado;
    }
    
    
    
    
    public void imprimirTamano(){
     JOptionPane.showMessageDialog(null, "El tamaño es:\n " + this.tamano);
    
    }
    
    public void imprimirLista(){
    if(!esVacia()){
    Nodo aux=primero;
    int i=0;
    while(aux!=null){
    System.out.println(aux.getDato());
    aux = aux.getNodoDer();
    i++;
    }
    }
        
    }
    
    }
