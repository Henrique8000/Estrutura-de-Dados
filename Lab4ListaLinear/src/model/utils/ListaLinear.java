package model.utils;

import java.util.ArrayList;
import java.util.List;

import model.entities.Gamer;

public class ListaLinear {

	private List<Gamer> gamers;

	public ListaLinear() {
		gamers = new ArrayList<>();
	}

	public void adicionarJogador(Gamer gamer) {
		
		if (gamers.isEmpty()) {
			gamers.add(gamer);
		}
		else {
			for (int i=0; i<gamers.size(); i++) {
				if (gamer.getScore() > gamers.get(i).getScore()) {
					
					
					
				}
			}
		}
		
		
	}

	public void listarScore() {

		for (Gamer g : gamers) {
			System.out.println(g.getScore());
		}

	}

}
