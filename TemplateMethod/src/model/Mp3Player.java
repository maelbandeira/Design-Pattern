package model;

public class Mp3Player  extends Player{

	@Override
	public void play() {
		System.out.println("Tocando uma m�sica em mp3");
		
	}

	@Override
	public void stop() {
		System.out.println("Parando a m�sica");
		
	}

	@Override
	public void avancar() {
		System.out.println("Avan�ando a m�sica ");
		
	}
	
	

}
