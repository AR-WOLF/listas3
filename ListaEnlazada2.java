package DeberListaEnlazada2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mjg70
 */
public class ListaEnlazada2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Listas lista = new Listas();
   
        lista.agregarInicio("Mario Giler", "1723128318");
        lista.agregarInicio("Alvaro Rodriguez", "1302207228");
        
        if(lista.buscar("1723128318")==true){
        	
        	System.out.println("Hay repetido");
        }else{
        	
        	lista.agregarInicio("", "");
        }
        */
        
    	Listas2 lista = new Listas2();
    	
    lista.agregarInicio("Leche", 3, "Listo");
    lista.agregarInicio("Atun", 6, "Listo");
    lista.agregarInicio("Salchichas", 7, "Listo");
    lista.agregarInicio("Empanadas", 2, " ");
    lista.imprimirLista();
    	
    	
    	
        
        
        
    }
    
}
