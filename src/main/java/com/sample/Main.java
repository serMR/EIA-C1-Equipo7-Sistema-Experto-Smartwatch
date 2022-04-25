package com.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import model.Bateria;
import utils.KnowledgeSessionHelper;

public class Main {

	public static void main(String[] arg) {
		KieContainer container = KnowledgeSessionHelper.createRuleBase();
		String sessionName = "ksession-smartwatch-rules";
		
		//Instancia de base de conocimientos
		KieSession session = KnowledgeSessionHelper.getStatefulKnowledgeSession(container, sessionName);
		
		ArrayList<Bateria> batteries = new ArrayList<Bateria>();
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			Bateria data = new Bateria();
			data.setCapacidadPorcentual(random.nextInt(40));
			batteries.add(data);
			session.insert(data);
		}
		
		session.fireAllRules();

		for (Bateria battery: batteries) {
			System.out.print(battery + "\n");
		}
	}
	
}
