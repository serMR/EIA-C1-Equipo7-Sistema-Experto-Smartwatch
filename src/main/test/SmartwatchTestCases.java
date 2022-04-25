
//public class SmartwatchTestCases {
//}


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

	// Buscar archivo kmodule.xml. El nombre de la sesion debe ser igual al
	// configurado en ese archivo
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
		// En primer lugar, se tiene la ultima fase de reglas a ejecutar
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

}
