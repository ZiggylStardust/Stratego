package de.hhn.stratego;

public enum RangT {
	SPION(1),
	AUFKLÄRER(2),
	MINEUR(3),
	UNTEROFFIZIER(4),
	LEUTNANT(5),
	HAUPTMANN(6),
	MAJOR(7),
	OBERST(8),
	GENERAL(9),
	FELDMARSCHALL(10),
	BOMBE(11),
	FAHNE(0);

	private final int angriffskraft;
	RangT(int angriffskraft) { this.angriffskraft = angriffskraft; }
	public int getValue() { return angriffskraft; }
}