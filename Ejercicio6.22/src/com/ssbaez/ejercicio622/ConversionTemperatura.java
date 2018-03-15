package com.ssbaez.ejercicio622;

import java.util.Scanner;

public class ConversionTemperatura {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Aplicacion que convierte grados centigrados a fahrenheit y viceversa");
		
		while(true) {
			
			System.out.printf("Seleccione una equivalencia %n%s%n%s%n%s%n%s", 
							  " 1) Celsius a Fahrenheit",
							  " 2) Fahrenheit a Celsius",
							  " 3) Terminar",
							  " ----> ");
			int selec = input.nextInt();
			
			if(selec == 1) {
				System.out.printf("Ingrese la temperatura a convertir a Fahrenheit %n%s",
								  "----> ");
				int temp = input.nextInt();
				System.out.printf("Temperatura en Fahrenheit: %.2f°%n", obtFahrenheit(temp));
			}
			else if(selec == 2) {
				System.out.printf("Ingrese la temperatura a convertir a Fahrenheit %n%s",
						  "----> ");
				int temp = input.nextInt();
				System.out.printf("Temperatura en Celsius: %.2f°%n", obtCelsius(temp));
			}
			else if(selec == 3) {
				System.out.println("PROGRAMA TERMINADO");
				break;
			}
			else
				System.out.println("***DATO ERRONEO***\n");
		}
		
	}
	
	public static double obtFahrenheit(double temp) {
		
		double fahrenheit = 0;
		
		fahrenheit = 9.0 / 5.0 * temp + 32;
		
		return fahrenheit;
		
	}
	
	public static double obtCelsius(double temp) {
		
		double celsius = 0;
		
		celsius = 5.0 / 9.0 * (temp - 32);
		
		return celsius;
		
	}

}
