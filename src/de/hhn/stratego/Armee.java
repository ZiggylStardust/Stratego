package de.hhn.stratego;

import de.hhn.stratego.Spielstuecke.Bombe;

public class Armee {

	Spieler kommandeur;
	Spielstueck[] einheiten=new Spielstueck[40];
	private java.awt.Color farbe;

	public java.awt.Color getFarbe() {
		return this.farbe;
	}

	/**
	 * 
	 * @param farbe
	 */
	public Armee(java.awt.Color farbe) {
		this.farbe=farbe;

	}


}