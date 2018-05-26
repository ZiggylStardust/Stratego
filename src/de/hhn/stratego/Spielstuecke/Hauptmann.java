package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class Hauptmann extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Hauptmann(Feld position) {
		super(position);
		this.rang=RangT.HAUPTMANN;
	}

}