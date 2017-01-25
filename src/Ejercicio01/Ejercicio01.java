package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		int numero = 0;
		int gradosF = 0;
		
		//ENTRADA
		numero = num();
		
		//PROCESO
		gradosF = conversionFar(numero);
		
		//SALIDA
		
		System.out.println(numero+ " Grados Cent�grados son: " +gradosF+" Grados Fahrenheit");
		
	}
	
	//Esta Funci�n sirve para pedir los grados por pantalla y validarlo
	public static int num(){
		Scanner sc = new Scanner(System.in);
		String aux = "";
		int num = 0;
		boolean esCorrecto = false;
		
		do{
			System.out.print("Introduce los grados en C�: ");
			aux = sc.nextLine();
			try{
				num = Integer.parseInt(aux);
				esCorrecto = true;
			}catch(Exception e){
				System.out.println("No ha introducido un n�mero");
			}
			
		}while(!esCorrecto);
		
		return num;
	}
	
	//Esta funci�n hace la conversion de centigrados a fahrenheit
	public static int conversionFar(int numero){
		
		return  32 + ( 9 * numero / 5);
	}

	
	
}
