package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class Aufklärer extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Aufklärer(Feld position) {
	    super(position);
		this.rang=RangT.AUFKLÄRER;
	}

}