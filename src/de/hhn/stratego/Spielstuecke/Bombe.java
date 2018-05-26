package de.hhn.stratego.Spielstuecke;

import de.hhn.stratego.Feld;
import de.hhn.stratego.RangT;
import de.hhn.stratego.Spielstueck;

public class Bombe extends Spielstueck {

	private boolean beweglich = false;

	/**
	 * 
	 * @param position
	 */
	public Bombe(Feld position) {
		super(position);
		this.rang=RangT.BOMBE;
	}

}