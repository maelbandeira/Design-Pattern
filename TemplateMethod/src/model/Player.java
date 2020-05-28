package model;

public abstract class Player {
	
	public abstract void play();
	public abstract void stop();
	public abstract void avancar();
	
	public final void executar() {
		//Inicia com play
		play();
		//Avan�a
		avancar();
		//Chama Stop
		stop();
		
	}
	
}
