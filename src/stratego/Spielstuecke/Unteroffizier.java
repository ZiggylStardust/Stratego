package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;
import stratego.Feld;

public class Unteroffizier extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Unteroffizier(Feld position) {
		super(position);
		this.rang=RangT.UNTEROFFIZIER;
	}

}