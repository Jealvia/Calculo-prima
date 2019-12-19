package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import main.PRIMAV4;

class PRIMATEST {//PRIMAV4

	@Test
	public void testCalcularPRIMAV4() {
		int edad=18;
		int puntos=0;
		PRIMAV4.calcular(edad, puntos);
		edad =18;
		puntos=24;
		PRIMAV4.calcular(edad, puntos);
		edad =18;
		puntos=30;
		PRIMAV4.calcular(edad, puntos);
		edad =28;
		puntos=30;
		PRIMAV4.calcular(edad, puntos);
		edad =26;
		puntos=10;
		PRIMAV4.calcular(edad, puntos);
		edad =36;
		puntos=28;
		PRIMAV4.calcular(edad, puntos);
		edad =37;
		puntos=24;
		PRIMAV4.calcular(edad, puntos);
		edad =80;
		puntos=20;
		PRIMAV4.calcular(edad, puntos);
		edad =70;
		puntos=26;
		PRIMAV4.calcular(edad, puntos);
		edad =50;
		puntos=10;
		PRIMAV4.calcular(edad, puntos);
		edad =55;
		puntos=29;
		PRIMAV4.calcular(edad, puntos);
		edad =25;
		puntos=36;
		PRIMAV4.calcular(edad, puntos);
		edad =16;
		puntos=30;
		PRIMAV4.calcular(edad, puntos);
	}

	
}
