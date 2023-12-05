package Servicios;

/**
 *Interfaz la cual contiene las cabeceras de los metodos que se encargan de la operativa de la aplicacion 
 *@author ilp-051223 
 */
public interface operativaInterfaz {
	
	/**
	 *Metodo el por el cual el usuario añade una venta a la cantidad total
	 *@author ilp-051223 
	 */
	public int añadirVenta();
	
	/**
	 *Metodo el por el cual el usuario hace un  gasto a la cantidad total
	 *@author ilp-051223 
	 */
	
	public int añadirGasto();
	/**
	 *Metodo el por el cual se muestra toda la cantidad que se tiene como cantidad total
	 *@author ilp-051223 
	 */
	
	public int mostrarTotal();
}

