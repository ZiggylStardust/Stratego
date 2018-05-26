package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class Leutnant extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Leutnant(Feld position) {
		super(position);
		this.rang=RangT.LEUTNANT;
	}

}