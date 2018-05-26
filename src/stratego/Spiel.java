package stratego;

import java.awt.*;

public class Spiel {

	Spieltafel spieltafel=new Spieltafel();
	Spieler[] teilnehmer={
			new Spieler("rot"),new Spieler("blau")
	};

	public Spiel() {
		teilnehmer[1].spiel=this;
		teilnehmer[1].armee=new Armee(Color.RED);
		teilnehmer[2].spiel=this;
		teilnehmer[2].armee=new Armee(Color.BLUE);
	}

}