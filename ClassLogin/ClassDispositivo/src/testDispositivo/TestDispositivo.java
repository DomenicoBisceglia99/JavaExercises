package testDispositivo;

import classDispositivo.Dispositivo;

public class TestDispositivo {
	public static void main(String[]args) {
		Dispositivo dispositivo = new Dispositivo();
		dispositivo.descrizione = "bla bla";
		dispositivo.altezza = 12.1;
		dispositivo.lunghezza = 1.1;
		dispositivo.larghezza = 7.3;
		dispositivo.marca = "Apple";
		
		
		dispositivo.printInfo();
		dispositivo.printDescDim();
		dispositivo.printAverageDim();
		dispositivo.printGreaterDim();
		
	}
}
