package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class Oberst extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Oberst(Feld position) {
		super(position);
		this.rang=RangT.OBERST;
	}

}