package DeberListaEnlazada2;

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
public class Listas2 {
    private Nodo2 primero;
    private Nodo2 ultimo;
    private int tamano;
    
    
    public Listas2(){
    this.primero=null;
    this.ultimo=null;
    this.tamano=0;
    }
    
    public boolean esVacia(){
    return (this.primero ==null);
    }
    
    public void agregarInicio(String strDescripcionProducto, int cantidad, String disposicion){
    Nodo2 nuevo = new Nodo2(strDescripcionProducto, cantidad, disposicion);
    if(esVacia()){
    primero = nuevo;
    }else{
    nuevo.setNodoDer(primero);
    primero = nuevo;
    }
    tamano++;
    
    }
    
    
    public void agregarFinal(String strDescripcionProducto, int cantidad, String disposicion){
         /**
     * Consulta si la lista esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    if(esVacia()){
    Nodo2 nuevo= new Nodo2(strDescripcionProducto, cantidad, disposicion);
    primero=nuevo;
 
    }else{
    Nodo2 nuevo = new Nodo2(strDescripcionProducto, cantidad, disposicion);
    Nodo2 aux= primero;
    while(aux.getNodoDer()!=null){
    aux = aux.getNodoDer();
    }
    aux.setNodoDer(nuevo);
    
    }
    this.tamano++;
  
    
    }
 
    
     public boolean buscar(String consulta){
        // Crea una copia de la lista.
        Nodo2 aux = primero;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        // llegar al final de la lista.
        while(aux != null && encontrado != true){
            // Consulta si el valor del nodo es igual al de referencia.
            if (consulta == aux.getDisposicion()){
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
     JOptionPane.showMessageDialog(null, "El tama�o es:\n " + this.tamano);
    
    }
    
    public void imprimirLista(){
    if(!esVacia()){
    Nodo2 aux=primero;
   /* while(aux!=null){
    	if(aux.getDisposicion()=="Listo"){
    		System.out.println(aux.getStrDescripcionProducto());
    		aux = aux.getNodoDer();
    	
    	}
    	
        
    }*/
    }
    	
    
 
    }
}
