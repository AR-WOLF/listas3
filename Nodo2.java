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
public class Nodo2 {
    
    Nodo2 nodoDer;
    String strDescripcionProducto;
    int cantidad;
    String disposicion;
    
    public Nodo2(String strDescripcionProducto,int cantidad, String disposicion){
    this.strDescripcionProducto=strDescripcionProducto;
    this.nodoDer=null;
    this.disposicion=disposicion;
    
    }

	public Nodo2 getNodoDer() {
		return nodoDer;
	}

	public void setNodoDer(Nodo2 nodoDer) {
		this.nodoDer = nodoDer;
	}

	public String getStrDescripcionProducto() {
		return strDescripcionProducto;
	}

	public void setStrDescripcionProducto(String strDescripcionProducto) {
		this.strDescripcionProducto = strDescripcionProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDisposicion() {
		return disposicion;
	}

	public void setDisposicion(String disposicion) {
		this.disposicion = disposicion;
	}

	@Override
	public String toString() {
		return "Nodo [nodoDer=" + nodoDer + ", strDescripcionProducto=" + strDescripcionProducto + ", cantidad="
				+ cantidad + ", disposicion=" + disposicion + "]";
	}

    


    
}
