package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class General extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public General(Feld position) {
		super(position);
		this.rang=RangT.GENERAL;
	}

}