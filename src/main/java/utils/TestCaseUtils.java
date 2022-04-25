package utils;

import model.Bateria;
import model.CargadorSmartwatch;
import model.ModuloBluetooth;
import model.Pantalla;
import model.PinCarga;
import model.Recomendacion;
import model.AccionRecomendada;
import model.ResultadoDiagnosticoPreliminar;
import model.SistemaOperativo;
import model.Smartwatch;


public class TestCaseUtils {

	////////////////TEST CASES UTILS ////////////////

	public static void print(String title) {
		System.out.println(title);
	}

	public static void print() {
		print("");
	}

	public static void print(Smartwatch smartwatch) {
		Bateria bateria = smartwatch.getBateria();
		PinCarga pinCarga = smartwatch.getPinCarga();
		Pantalla pantalla = smartwatch.getPantalla();
		SistemaOperativo sistemaOperativo = smartwatch.getSistemaOperativo();
		CargadorSmartwatch cargador = smartwatch.getCargador();
		ModuloBluetooth moduloBluetooth = smartwatch.getModuloBluetooth();
		
		print();
		print("Smartwatch");
		print("Cargador: " + cargador);
		print("Bateria: " + bateria);
		print("Pin de carga: " + pinCarga);
		print("Sistema Operativo: " + sistemaOperativo);
		print("Pantalla: " + pantalla);
		print("Modulo bluetooth: " + moduloBluetooth);
		print();
	}

	public static void assertResults(Recomendacion recomendacion, AccionRecomendada valorEsperado) {
		AccionRecomendada accion = recomendacion.getAccion();
		printResults(accion.toString(), valorEsperado.toString());
		assert(accion.isa(valorEsperado));
	}

	private static void printResults(String result,String expected) {
		print("Resultados");
		print("Esperaba: " + expected);
		print("Recibi: " + result);
		Boolean isOk = result.equals(expected);
		String condition = isOk ? "Ok" : "Fallo";
		print("Caso de prueba: "+ condition);
	}
}
