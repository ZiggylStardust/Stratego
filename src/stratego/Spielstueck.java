package stratego;

public class Spielstueck {

	protected RangT rang;
	protected boolean beweglich = true;
	protected Feld position;

    /**
     *
     * @param position
     */
	public Spielstueck(Feld position) {
	    this.position=position;
    }
	public RangT getRang() {
		return this.rang;
	}

	public boolean isBeweglich() {
		return this.beweglich;
	}

	public Feld getPosition() {
		return this.position;
	}

	/**
	 * 
	 * @param feld
	 */
	public void bewegen(Feld feld) {
		if(feld!=null&&isBeweglich()) {
            if(feld.getSpielstueck()==null){
                this.position = feld;
                feld.setSpielstueck(this);
                this.setPosition(feld);
            }
            else{
                Spielstueck gewinner=angreifen(feld.getSpielstueck());
                feld.setSpielstueck(gewinner);
                if(gewinner!=null) {
                    gewinner.setPosition(feld);
                }
            }
        }
	}

	/**
	 * 
	 * @param gegner das angegriffene Spielstück
	 */
	public Spielstueck angreifen(Spielstueck gegner) {
	    if(getRang().getValue()>gegner.getRang().getValue()) return this;
	    else if(getRang().getValue()<gegner.getRang().getValue()) return gegner;
	    else return null;
	}

	/**
	 * 
	 * @param position
	 */
	public void setPosition(Feld position) {
		this.position = position;
	}




}