package stratego.Spielstuecke;

import stratego.Feld;
import stratego.RangT;
import stratego.Spielstueck;
import stratego.Feld;
import stratego.Spielstueck;

public class Spion extends Spielstueck {

	/**
	 * 
	 * @param position
	 */
	public Spion(Feld position) {
		super(position);
		this.rang=RangT.SPION;
	}

	@Override
	public Spielstueck angreifen(Spielstueck gegner) {
		if(gegner.getRang()==RangT.FELDMARSCHALL) return this;
		return super.angreifen(gegner);
	}
}