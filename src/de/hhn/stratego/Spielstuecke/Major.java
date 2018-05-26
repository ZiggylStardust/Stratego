package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class Major extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Major(Feld position) {
		super(position);
		this.rang=RangT.MAJOR;
	}

}