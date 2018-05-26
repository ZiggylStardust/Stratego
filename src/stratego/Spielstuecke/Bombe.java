package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;

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