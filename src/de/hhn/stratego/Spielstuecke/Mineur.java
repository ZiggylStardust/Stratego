package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class Mineur extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Mineur(Feld position) {
		super(position);
		this.rang=RangT.MINEUR;
	}

}