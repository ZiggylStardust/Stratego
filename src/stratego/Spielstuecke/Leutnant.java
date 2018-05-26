package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;
import stratego.Feld;

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