package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLE
		int kmHora = 0;
		double mSegundos = 0;
		
		//ENTRADA
		kmHora = lectura();
		
		//PROCESO
		mSegundos = conversion(kmHora);
		
		//SALIDA
		System.out.println(String.format(kmHora+ " km/h son %.3f m/s", mSegundos));
		
		
	}
	
	//funcion para leer por teclado
	public static int lectura(){
		Scanner sc = new Scanner(System.in);
		int velocidad = 0;
		boolean esCorrecto = false;
		String aux = "";
		
		do{
			System.out.println("Introduce la velocidad(Km/hora):" );
			aux = sc.nextLine();
			
			try{
				velocidad = Integer.parseInt(aux);
				if(velocidad < 1){
					System.out.println("ERROR. No puede ser 0 o menor.");
				}
				else{
					esCorrecto = true;
				}
			}catch(Exception e){
				System.out.println("ERROR. No has introducido un número");
			}
			
		}while(!esCorrecto);
		return velocidad;
	}
	
	//funcion de conversion de km/h a metro/s
	public static double conversion(int kmHora){
		double metrosSeg = 0;
		double kmSegundo = 0;
		
		metrosSeg = kmHora/3.6;
				
		
				
		return metrosSeg; 
	}

}
