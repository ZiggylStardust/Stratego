package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;
import stratego.RangT;

public class Feldmarschall extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Feldmarschall(Feld position) {
		super(position);
        this.rang=RangT.FELDMARSCHALL;
	}

}