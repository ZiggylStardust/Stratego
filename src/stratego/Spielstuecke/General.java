package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;

public class General extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public General(Feld position) {
		super(position);
		this.rang=RangT.GENERAL;
	}

}