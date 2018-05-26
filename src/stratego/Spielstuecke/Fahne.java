package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;

public class Fahne extends Spielstueck {

	private boolean beweglich = false;

	/**
	 * 
	 * @param position
	 */
	public Fahne(Feld position) {
		super(position);
		this.rang=RangT.FAHNE;
	}

}