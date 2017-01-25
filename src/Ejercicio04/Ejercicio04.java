package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		float cateto1 = 0;
		float cateto2 = 0;
		float hipotenusa = 0;
		int cont = 1;
		//ENTRADA
		 cateto1 = lectura(cont);
		 cont++;
		 cateto2 = lectura(cont);
		 
		//PROCESO
		hipotenusa = calcHipo(cateto1, cateto2);
		//SALIDA
		
		System.out.println("La hipotesuna de un triangulo con catetos "+cateto1+" y "+cateto2+" es: ");
		System.out.print(String.format("%.2f",hipotenusa));
		}
	
	//funcion de lectura y validacion
	public static float lectura(int cont){
		Scanner sc = new Scanner(System.in);
		boolean esCorrecto = false;
		String aux = "";
		float numero = 0.0f;
		
		do{
			System.out.println("Introduce un número para el cateto" +cont+": ");
			aux = sc.nextLine();
			
			try{
				numero = Float.parseFloat(aux);
				if(numero < 1){
					System.out.println("ERROR. No puede ser 0 o menor");
				}
				else{
					esCorrecto = true;
				}
			}catch(Exception e){
				System.out.println("ERORR. No ha introducido un número");
			}
		}while(!esCorrecto);
		
		cont +=1;
		return numero;
	}
	
	//funcion calculo hipotenusa
	public static float calcHipo(float cateto1, float cateto2){
		
		return cateto1*cateto1 + cateto2*cateto2;
	}
	

}
