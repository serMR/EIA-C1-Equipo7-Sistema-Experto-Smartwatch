
import static utils.TestCaseUtils.assertResults;
import static utils.TestCaseUtils.print;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.Agenda;
import org.kie.api.runtime.rule.FactHandle;

import model.*;
import utils.KnowledgeSessionHelper;

public class SmartwatchTestCases {

	String K_SESSION_NAME = "ksession-smartwatch-tests";

	KieSession sessionStatefull;
	static KieContainer kieContainer;

	FactHandle automovilDir;
	
	@BeforeClass
	public static void beforeallTestSetup() {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
	}

	private void prepareKnowledgeSession() {
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSessionWithCallback(kieContainer, K_SESSION_NAME);
		Agenda agenda = sessionStatefull.getAgenda();
		agenda.getAgendaGroup("Prescripcion de falla de smartwatch").setFocus();
		agenda.getAgendaGroup("Diagnostico Sistema Operativo").setFocus();
		agenda.getAgendaGroup("Diagnostico Preliminar").setFocus();
		agenda.getAgendaGroup("Diagnostico Modulo Bluetooth").setFocus();
		agenda.getAgendaGroup("Diagnostico Pantalla").setFocus();
		agenda.getAgendaGroup("Diagnostico Pin de Carga").setFocus();
		agenda.getAgendaGroup("Diagnostico Cargador").setFocus();
		agenda.getAgendaGroup("Diagnostico Bateria").setFocus();
	}
	
	@Before
	public void setUp() {
		print("----------Start----------");
		print();
		this.prepareKnowledgeSession(); // Inicializa una nueva base de hechos
	}

	@After
	public void tearDown() {
		print();
		print("----------End----------");
		print();
	}
	
	@Test
	public void cargarBateriaTest() {
		
		print("Caso de prueba: Cargar Bateria");
		
		Bateria bateria = new Bateria();
		bateria.setCapacidadPorcentual(10);
		PinCarga pinCarga = new PinCarga();
		pinCarga.setDiferencialPotencialPin(4.9);
		CargadorSmartwatch cargador = new CargadorSmartwatch();
		cargador.setDiferencialPotencial(4.9);
		SistemaOperativo sistemaOp = new SistemaOperativo();
		ModuloBluetooth bluetooth = new ModuloBluetooth();
		Pantalla pantalla = new Pantalla();
		
		Smartwatch smartwatch = new Smartwatch(bateria, pinCarga, pantalla, sistemaOp, bluetooth, cargador);
		
		print(smartwatch);
		sessionStatefull.insert(smartwatch);
		sessionStatefull.fireAllRules();
		
		Recomendacion recomendacion = smartwatch.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.CargarBateria;
		assertResults(recomendacion, valorEsperado);
	}
	
	@Test
	public void cambiarCargador() {
		
		print("Caso de prueba: Cambiar Cargador");
		
		Bateria bateria = new Bateria();
		bateria.setCapacidadPorcentual(95);
		PinCarga pinCarga = new PinCarga();
		pinCarga.setDiferencialPotencialPin(4.9);
		CargadorSmartwatch cargador = new CargadorSmartwatch();
		cargador.setDiferencialPotencial(2.5);
		SistemaOperativo sistemaOp = new SistemaOperativo();
		ModuloBluetooth bluetooth = new ModuloBluetooth();
		Pantalla pantalla = new Pantalla();
		
		Smartwatch smartwatch = new Smartwatch(bateria, pinCarga, pantalla, sistemaOp, bluetooth, cargador);
		
		print(smartwatch);
		sessionStatefull.insert(smartwatch);
		sessionStatefull.fireAllRules();
		
		Recomendacion recomendacion = smartwatch.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.CambiarCargador;
		assertResults(recomendacion, valorEsperado);
	}
	
	@Test
	public void cambiarPinDeCarga() {
		
		print("Caso de prueba: Cambiar Pin de carga");
		
		Bateria bateria = new Bateria();
		bateria.setCapacidadPorcentual(95);
		PinCarga pinCarga = new PinCarga();
		pinCarga.setDiferencialPotencialPin(2.2);
		CargadorSmartwatch cargador = new CargadorSmartwatch();
		cargador.setDiferencialPotencial(4.9);
		SistemaOperativo sistemaOp = new SistemaOperativo();
		ModuloBluetooth bluetooth = new ModuloBluetooth();
		Pantalla pantalla = new Pantalla();
		
		Smartwatch smartwatch = new Smartwatch(bateria, pinCarga, pantalla, sistemaOp, bluetooth, cargador);
		
		print(smartwatch);
		sessionStatefull.insert(smartwatch);
		sessionStatefull.fireAllRules();
		
		Recomendacion recomendacion = smartwatch.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.CambiarPinCarga;
		assertResults(recomendacion, valorEsperado);
	}
	
	@Test
	public void resetSOPorBootError() {
		
		print("Caso de prueba: Resetear el SO a fabrica por error de booteo");
		
		Bateria bateria = new Bateria();
		bateria.setCapacidadPorcentual(95);
		PinCarga pinCarga = new PinCarga();
		CargadorSmartwatch cargador = new CargadorSmartwatch();
		SistemaOperativo sistemaOp = new SistemaOperativo();
		sistemaOp.setInterfaz(SOInterfaz.SinImagen);
		sistemaOp.setVelocidadRespuesta(SOVelocidadRespuesta.Normal);
		sistemaOp.setArranque(SOArranque.Normal);
		ModuloBluetooth bluetooth = new ModuloBluetooth();
		Pantalla pantalla = new Pantalla();
		
		Smartwatch smartwatch = new Smartwatch(bateria, pinCarga, pantalla, sistemaOp, bluetooth, cargador);
		
		print(smartwatch);
		sessionStatefull.insert(smartwatch);
		sessionStatefull.fireAllRules();
		
		Recomendacion recomendacion = smartwatch.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.ResetearSOFabrica;
		assertResults(recomendacion, valorEsperado);
	}

	@Test
	public void resetSOPorPerformanceError() {
		
		print("Caso de prueba: Resetear el SO a fabrica por saturacion de memoria");
		
		Bateria bateria = new Bateria();
		bateria.setCapacidadPorcentual(95);
		PinCarga pinCarga = new PinCarga();
		CargadorSmartwatch cargador = new CargadorSmartwatch();
		SistemaOperativo sistemaOp = new SistemaOperativo();
		sistemaOp.setInterfaz(SOInterfaz.ImagenNormal);
		sistemaOp.setVelocidadRespuesta(SOVelocidadRespuesta.Lenta);
		sistemaOp.setArranque(SOArranque.Normal);
		ModuloBluetooth bluetooth = new ModuloBluetooth();
		Pantalla pantalla = new Pantalla();
		
		Smartwatch smartwatch = new Smartwatch(bateria, pinCarga, pantalla, sistemaOp, bluetooth, cargador);
		
		print(smartwatch);
		sessionStatefull.insert(smartwatch);
		sessionStatefull.fireAllRules();
		
		Recomendacion recomendacion = smartwatch.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.ResetearSOFabrica;
		assertResults(recomendacion, valorEsperado);
	}

	@Test
	public void cambiarPantallaPorDanio() {
		
		print("Caso de prueba: Cambiar pantalla por daño");

		Bateria bateria = new Bateria();
		bateria.setCapacidadPorcentual(95);

		PinCarga pinCarga = new PinCarga();
		CargadorSmartwatch cargador = new CargadorSmartwatch();
		ModuloBluetooth bluetooth = new ModuloBluetooth();

		SistemaOperativo sistemaOp = new SistemaOperativo();
		sistemaOp.setInterfaz(SOInterfaz.SinRespuesta);

		Pantalla pantalla = new Pantalla();
		pantalla.setTouchscreen(PantallaTouchscreen.NoDaniado);
		pantalla.setEstado(PantallaEstado.Apagado);
		pantalla.setPresentaGolpes(true);

		Smartwatch smartwatch = new Smartwatch(bateria, pinCarga, pantalla, sistemaOp, bluetooth, cargador);

		print(smartwatch);
		sessionStatefull.insert(smartwatch);
		sessionStatefull.fireAllRules();

		Recomendacion recomendacion = smartwatch.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.CambiarPantalla;
		assertResults(recomendacion, valorEsperado);
	}
	
	@Test
	public void cambiarPantallaPorTouchScreen() {
		
		print("Caso de prueba: Cambiar pantalla por touchscreen dañado");

		Bateria bateria = new Bateria();
		bateria.setCapacidadPorcentual(95);

		PinCarga pinCarga = new PinCarga();
		CargadorSmartwatch cargador = new CargadorSmartwatch();
		ModuloBluetooth bluetooth = new ModuloBluetooth();

		SistemaOperativo sistemaOp = new SistemaOperativo();
		sistemaOp.setInterfaz(SOInterfaz.ImagenNormal);

		Pantalla pantalla = new Pantalla();
		pantalla.setTouchscreen(PantallaTouchscreen.Daniado);
		pantalla.setEstado(PantallaEstado.Prendida);
		pantalla.setPresentaGolpes(false);

		Smartwatch smartwatch = new Smartwatch(bateria, pinCarga, pantalla, sistemaOp, bluetooth, cargador);

		print(smartwatch);
		sessionStatefull.insert(smartwatch);
		sessionStatefull.fireAllRules();

		Recomendacion recomendacion = smartwatch.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.CambiarPantalla;
		assertResults(recomendacion, valorEsperado);
	}
	
	@Test
	public void cambiarModuloBluetooth() {
		
		print("Caso de prueba: Cambiar modulo bluetooth");

		Bateria bateria = new Bateria();
		bateria.setCapacidadPorcentual(95);

		PinCarga pinCarga = new PinCarga();
		Pantalla pantalla = new Pantalla();
		CargadorSmartwatch cargador = new CargadorSmartwatch();
		
		ModuloBluetooth bluetooth = new ModuloBluetooth();
		bluetooth.setPermiteEmparejamiento(false);

		SistemaOperativo sistemaOp = new SistemaOperativo();
		sistemaOp.setInterfaz(SOInterfaz.ImagenNormal);
		sistemaOp.setVelocidadRespuesta(SOVelocidadRespuesta.Normal);

		Smartwatch smartwatch = new Smartwatch(bateria, pinCarga, pantalla, sistemaOp, bluetooth, cargador);

		print(smartwatch);
		sessionStatefull.insert(smartwatch);
		sessionStatefull.fireAllRules();

		Recomendacion recomendacion = smartwatch.getRecomendacion();
		AccionRecomendada valorEsperado = AccionRecomendada.ReempleazarModBluetooth;
		assertResults(recomendacion, valorEsperado);
	}
}
