package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		double longitud = 0.0f;
		double area = 0.0f;
		double radio = 0.0f;
		
		//ENTRADA
		radio = lectura();
		
		//PROCESO
		longitud = calculoLong(radio);
		area = calculoArea(radio);
		
		//SALIDA
		System.out.println("Radio: " +radio);
		System.out.println(String.format("Longitud: %.2f" ,longitud));
		System.out.println(String.format("Área: %.2f" ,area));
		
	}
	
	//funcion para lectura 
	public static double lectura(){
		Scanner sc = new Scanner(System.in);
		String aux = "";
		boolean esCorrecto = false;
		double numero =0.0f;
		
		do{
			System.out.println("Introduce el radio de la circunferencia: ");
			aux = sc.nextLine();
			
			try{
				numero = Double.parseDouble(aux);
				
				if(numero < 1){
					System.out.println("ERROR. El raido no puede ser 0 o negativo");
				}
				else{
					esCorrecto = true;
				}
			}catch(Exception e){
				System.out.println("ERROR. No has introducido un número");
			}
			
		}while(!esCorrecto);
		
		return numero;
	}

	//funcion de calculo de la longitud de la circunferencia
	public static double calculoLong(double radio){
		
		return  2 * 3.14 * radio;
	}
	
	//funcion de calculo de area
	public static double calculoArea(double radio){
		
		return 3.14 * radio * radio;
	}
	
	
}
