
import java.util.InputMismatchException;
import java.util.Scanner;

public class PRIMAV4 {
	public static void main(String[] args) {
		PRIMAV4 prima=new PRIMAV4();
//		prima.main();
		prima.calcular(18,30);
		
    }
	
	public static boolean evaluarEdad(int edad ) {
		if(edad>=18 && edad<=90) {
	    	return true;
	    }else {
		    System.out.println("Edad fuera de rango.");
		    return false;
	    }
		
	}
	
	public static boolean evaluarPuntaje(int puntos) {
		if(puntos>0&&puntos <=30) {
			return true;
	    }else {
		    System.out.println("Puntos fuera de rango.");
		    return false;
	    }
		
	}
	
	public static void main() {
		int edad=0;
		int puntos=0;
		double Prima=0;
		boolean bandera=true;
		System.out.print("Ingrese edad: ");
		Scanner reader = new Scanner(System.in);
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
		if(edad!=0||puntos!=0) {
			Prima=calcular(edad, puntos);
			System.out.println("Valor de la prima: "+Prima);	
		}else {
			System.out.println("Datos ingreso no válidos.");
		}
		
	}
	
	public static double calcular(int edad, int puntos) {
		boolean puntosValidacion=false;
		boolean edadValidacion=false;
		puntosValidacion=evaluarPuntaje(puntos);
		if(!puntosValidacion) {
			return 0;
		}
		edadValidacion=evaluarEdad(edad);
		if(!edadValidacion) {
			return 0;
		}
		int ReduccionConductorSeguro=0;
		double FactorEdad;
		long TarifaBasica=500;
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
		System.out.println("Edad: "+edad);
		System.out.println("Puntos: "+puntos);
		System.out.println("Prima: "+Prima);
		return Prima;
	}
}
