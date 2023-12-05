package Servicios;

import java.util.Scanner;

/**
 *Clase Implementacion la cual contiene la logica de los metodos que se encargan de la operativa de la aplicacion
 *@author ilp-051223 
 */
public class operativaImplementacion implements operativaInterfaz {

	Scanner comunicacionTeclado = new Scanner(System.in);
	int cantidadTotal;
	
	public int añadirVenta() {
		
		
		
		int cantidadSeleccionada;
		
		System.out.println("Inserte el importe de la nueva venta ");
		cantidadSeleccionada=comunicacionTeclado.nextInt();
		
		cantidadTotal=cantidadTotal+cantidadSeleccionada;
		
		
		return cantidadTotal;
		
		
	}

	@Override
	public int añadirGasto() {
		
		int cantidadSeleccionada;
		System.out.println("Inserte el importe del nuevo gasto ");
		cantidadSeleccionada=comunicacionTeclado.nextInt();
		
		cantidadTotal=cantidadTotal-cantidadSeleccionada;
		
		
		if (cantidadTotal==0) {
			
			System.out.println("La cantidad total ha llegado a 0");	
		} else if(cantidadTotal<0) {
			
			System.out.println("Debe dinero");	
		}
		
	
		return cantidadTotal;
	}

	@Override
	public int mostrarTotal() {
		
		System.out.println(cantidadTotal);
		
		if (cantidadTotal==0)
		{
			System.out.println("Vamos Mal");
			
		}else if(cantidadTotal<0) 
		{
			System.out.println("Vamos Muy Mal");	
		}
		
		
		
		return cantidadTotal;
	}
}
