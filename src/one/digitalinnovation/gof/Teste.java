package one.digitalinnovation.gof;

import one.digitalinnovation.face.Facade;
import one.digitalinnovation.singleton.SingletonEager;
import one.digitalinnovation.singleton.SingletonLazy;
import one.digitalinnovation.singleton.SingletonLazyHolder;
import one.digitalinnovation.strategy.Comportamento;
import one.digitalinnovation.strategy.ComportamentoAgressivo;
import one.digitalinnovation.strategy.ComportamentoDefensivo;
import one.digitalinnovation.strategy.ComportamentoNormal;
import one.digitalinnovation.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		//Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder= SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		
		//Strategy
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Cassiano", "21230190");
	}

}
