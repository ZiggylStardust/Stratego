package stratego;

public class Feld {

	private int posX;
	private int posY;
	private Spielstueck spielstueck;

	public int getPosX() {
		return this.posX;
	}

	public int getPosY() {
		return this.posY;
	}

	/**
	 * 
	 * @param posX
	 * @param posY
	 */
	public Feld(int posX, int posY) {
		this.posX=posX;
		this.posY=posY;
	}

    public Spielstueck getSpielstueck() {
        return spielstueck;
    }

    public void setSpielstueck(Spielstueck spielstueck) {
        this.spielstueck = spielstueck;
    }
}