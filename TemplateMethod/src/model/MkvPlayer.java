package model;

public class MkvPlayer extends Player{

	@Override
	public void play() {
		System.out.println("Tocando um video em mkv");
		
	}

	@Override
	public void stop() {
		System.out.println("Parando um video em mkv");
		
	}

	@Override
	public void avancar() {
		System.out.println("Avan�ando um video em mkv");
		
	}

}
