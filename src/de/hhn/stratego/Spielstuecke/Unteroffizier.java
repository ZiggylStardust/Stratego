package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class Unteroffizier extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Unteroffizier(Feld position) {
		super(position);
		this.rang=RangT.UNTEROFFIZIER;
	}

}