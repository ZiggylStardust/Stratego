package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;
import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;

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