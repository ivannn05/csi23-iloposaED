package Servicios;

import java.util.Scanner;

/*
 *Clase Implementacion la cual contiene la logica de los metodos que se encargan del menu principal 
 *<author>ilp-051223 
 */
public class menuImplementacion implements menuInterfaz {

	@Override
	public int mostrarMenuYSeleccion() {
		Scanner comunicacionTeclado = new Scanner(System.in);
		
		int opcionSeleccionada ;
		
		
		
		System.out.println("-----------------------------");
		System.out.println("0.Cerrar Menu");
		System.out.println("1.Añadir Venta");
		System.out.println("2.Añadir Gasto");
		System.out.println("3.Mostrar Total");
		System.out.println("-----------------------------");
		opcionSeleccionada=comunicacionTeclado.nextInt();		
		return opcionSeleccionada;
	}

}
