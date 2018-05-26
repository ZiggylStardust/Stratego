package de.hhn.stratego;

public class Spieltafel {

	Spiel spiel;
	Feld[][] felder=new Feld[10][10];

	public Spieltafel() {
	for(int y=0;y<10;y++){
	    for(int x=0;x<10;x++){
	        if(!((x==4||x==5)&&(y==2||y==3||y==6||y==7))){      //Seeen
	            felder[x][y]=new Feld(x,y);
            }
        }
    }
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Feld getFeld(int x, int y) {
		return felder[x][y];
	}

}