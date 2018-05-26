package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;

public class Mineur extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Mineur(Feld position) {
		super(position);
		this.rang=RangT.MINEUR;
	}
	@Override
	public Spielstueck angreifen(Spielstueck gegner) {
		if(gegner.getRang()==RangT.BOMBE) return this;
		return super.angreifen(gegner);
	}
}