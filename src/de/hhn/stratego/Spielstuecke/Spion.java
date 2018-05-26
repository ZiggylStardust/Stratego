package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class Spion extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Spion(Feld position) {
		super(position);
		this.rang=RangT.SPION;
	}

}