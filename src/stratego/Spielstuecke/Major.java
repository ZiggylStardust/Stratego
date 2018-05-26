package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;
import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;

public class Major extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Major(Feld position) {
		super(position);
		this.rang=RangT.MAJOR;
	}

}