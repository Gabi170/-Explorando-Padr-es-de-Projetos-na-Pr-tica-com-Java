package one.digitalInovation.gof;

import one.digitalInovation.gof.facade.Facade;
import one.digitalInovation.gof.singleton.SingontonLazy;
import one.digitalInovation.gof.singleton.SingotonEager;
import one.digitalInovation.gof.singleton.SingotonLazyHolder;
import one.digitalInovation.gof.startegy.Comportamento;
import one.digitalInovation.gof.startegy.ComportamentoAgressivo;
import one.digitalInovation.gof.startegy.ComportamentoDefensivo;
import one.digitalInovation.gof.startegy.ComportamentoNormal;
import one.digitalInovation.gof.startegy.Robo;

public class teste {
	
	public static void main(String[] args) {
		 
		//Singoton
		SingontonLazy lazy = SingontonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingontonLazy.getInstancia();
		System.out.println(lazy);
		
		SingotonEager eager =SingotonEager.getInstancia();
		System.out.println(eager);
		eager = SingotonEager.getInstancia();
		System.out.println(eager);
		
		SingotonLazyHolder lazyHolder = SingotonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingotonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
		
		//Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		((Facade) facade).migrarCliente("Gabriele", "12345678971");
	}

}

