package DeberListaEnlazada;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mjg70
 */
public class Nodo {
    
    Nodo nodoDer;
    String dato;
    String cedula;
    
    public Nodo(String dato, String cedula){
    this.dato=dato;
    this.nodoDer=null;
    this.cedula=cedula;
    
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }

    public void setNodoDer(Nodo nodoDer) {
        this.nodoDer = nodoDer;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Nodo{" + "nodoDer=" + nodoDer + ", dato=" + dato + ", cedula=" + cedula + '}';
    }

  


    
}
