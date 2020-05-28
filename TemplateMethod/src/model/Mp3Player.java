package model;

public class Mp3Player  extends Player{

	@Override
	public void play() {
		System.out.println("Tocando uma música em mp3");
		
	}

	@Override
	public void stop() {
		System.out.println("Parando a música");
		
	}

	@Override
	public void avancar() {
		System.out.println("Avançando a música ");
		
	}
	
	

}
