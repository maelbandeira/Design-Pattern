package view;

import model.MkvPlayer;
import model.Mp3Player;
import model.Player;

public class Teste {

	public static void main(String[] args) {
	
		Player reprodutor = new Mp3Player();
		reprodutor.executar();
		System.out.println();
		
		reprodutor =new MkvPlayer();
		reprodutor.executar();
	}

}
