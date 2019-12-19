package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PRIMAv1 {
	public static void main(String[] args) {
		int ReducciónConductorSeguro=0;
		double FactorEdad;
		long TarifaBásica=500;
		
		 
		Scanner reader = new Scanner(System.in);
		int edad = 0;
		 boolean bandera=true;
		System.out.print("Ingrese edad: ");
		 
		do {			
		  try {
		    edad = reader.nextInt();
		    if(edad>0) {
			    bandera=false;		
		    }else {
			    System.out.println("Ingrese edad mayor a 0.");		    	
		    }
		  } catch (InputMismatchException ime){
		    System.out.println("Solo puedes ingresar números.");
		    
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
			    System.out.println("Ingrese puntos mayor a 0 y menor a 30.");		    	
		    }
		  } catch (InputMismatchException ime){
		    System.out.println("Solo puedes ingresar números.");
		    
		    reader.next();
		  }
		} while (bandera);
		reader.close();
		System.out.println("Edad: "+edad+" puntos: "+puntos+"\n");
		if(edad<25) {
			if(!(30-puntos>1)) {
				ReducciónConductorSeguro=50;
			}
			FactorEdad=2.8;
		}else if(edad>=25&&edad<35) {
			FactorEdad=1.8;
			if(!(30-puntos>3)) {
				ReducciónConductorSeguro=50;
			}
		}else if(edad>=35&&edad<45) {
			FactorEdad=1;
			if(!(30-puntos>5)) {
				ReducciónConductorSeguro=50;
			}
		}else if(edad>=45&&edad<65) {
			FactorEdad=0.8;
			if(!(30-puntos>7)) {
				ReducciónConductorSeguro=50;
			}
		}else {
			FactorEdad=1.5;
			if(!(30-puntos>5)) {
				ReducciónConductorSeguro=50;
			}
		}
		
		double Prima = TarifaBásica * FactorEdad - ReducciónConductorSeguro;
		System.out.println("Valor de la prima: "+Prima);
		
    }
}
