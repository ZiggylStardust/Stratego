package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class Feldmarschall extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Feldmarschall(Feld position) {
		super(position);
        this.rang=RangT.FELDMARSCHALL;
	}

}