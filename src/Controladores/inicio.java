package Controladores;

import java.util.Scanner;

import Servicios.menuImplementacion;
import Servicios.menuInterfaz;
import Servicios.operativaImplementacion;
import Servicios.operativaInterfaz;

/**
 *Clase principal de la aplicacion , el cual contendra el metodo Main
 *@author ilp-051223 
 */
public class inicio {

	 /**Metodo principal de la aplicacion por el cual se lanzara la aplicacion
	  * @param args @author csi23-ilp
	  */
	public static void main(String[] args) {
		menuInterfaz mi = new menuImplementacion();
		operativaInterfaz op = new operativaImplementacion();
		Scanner comunicacionTeclado = new Scanner(System.in);
		
		boolean cerrarMenu=true;
		
		int opcionSeleccionada;
		System.out.println("A entrado en nuestra tienda");
		System.out.println("Elija una opcion");
		
		while(cerrarMenu)
		{
			opcionSeleccionada=mi.mostrarMenuYSeleccion();
			
			switch(opcionSeleccionada)
			{
			case 0:
				System.out.println("Se cerrara el Menu");
				cerrarMenu=false;
				break;
				
			case 1:
				
				System.out.println("Se añadira una venta ");
				op.añadirVenta();
				
				break;
				
			case 2:
				System.out.println("Se añadira un gasto");
				op.añadirGasto();
				break;
				
			case 3:
				System.out.println("Se mostrara el total");
				op.mostrarTotal();
				break;
				
			
				default:
				System.out.println("Esta opcion no existe");
					break;
			}
			
		}

	}

}
