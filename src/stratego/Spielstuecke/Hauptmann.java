package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;
import stratego.Spielstueck;

public class Hauptmann extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Hauptmann(Feld position) {
		super(position);
		this.rang=RangT.HAUPTMANN;
	}

}