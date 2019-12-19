package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PRIMAv3 {
	public static void main(String[] args) {
		int ReduccionConductorSeguro=0;
		double FactorEdad;
		long TarifaBasica=500;
		
		 
		Scanner reader = new Scanner(System.in);
		int edad = 0;
		 boolean bandera=true;
		System.out.print("Ingrese edad: ");
		 
		do {			
		  try {
		    edad = reader.nextInt();
		    if(edad>=18 && edad<=90) {
		    	bandera=false;
		    }else {
			    System.out.println("Edad fuera de rango.");
			    System.exit(1);
		    }
		  } catch (InputMismatchException ime){
		    System.out.println("Datos ingreso no válidos.");
		    
		    reader.next();
		  }
		} while (bandera);
		
		reader = new Scanner(System.in);
		int puntos = 0;
		 bandera=true;
		System.out.print("Ingrese puntos actuales: ");
		 
		do {			
		  try {
		    puntos = reader.nextInt();
		    if(puntos>0&&puntos <=30) {
			    bandera=false;		    
		    }else {
			    System.out.println("Puntos fuera de rango.");		    	
		    }
		  } catch (InputMismatchException ime){
		    System.out.println("Datos ingreso no válidos.");
		    
		    reader.next();
		  }
		} while (bandera);
		reader.close();
		System.out.println("Edad: "+edad+" puntos: "+puntos+"\n");
		if(edad<25) {
			if(!(30-puntos>1)) {
				ReduccionConductorSeguro=50;
			}
			FactorEdad=2.8;
		}else if(edad>=25&&edad<35) {
			FactorEdad=1.8;
			if(!(30-puntos>3)) {
				ReduccionConductorSeguro=50;
			}
		}else if(edad>=35&&edad<45) {
			FactorEdad=1;
			if(!(30-puntos>5)) {
				ReduccionConductorSeguro=100;
			}
		}else if(edad>=45&&edad<65) {
			FactorEdad=0.8;
			if(!(30-puntos>7)) {
				ReduccionConductorSeguro=150;
			}
		}else {
			FactorEdad=1.5;
			if(!(30-puntos>5)) {
				ReduccionConductorSeguro=200;
			}
		}
		
		double Prima = TarifaBasica * FactorEdad - ReduccionConductorSeguro;
		System.out.println("Valor de la prima: "+Prima);
		
    }
}