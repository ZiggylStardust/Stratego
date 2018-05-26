package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.RangT;
import stratego.Spielstueck;

public class Oberst extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Oberst(Feld position) {
		super(position);
		this.rang=RangT.OBERST;
	}

}