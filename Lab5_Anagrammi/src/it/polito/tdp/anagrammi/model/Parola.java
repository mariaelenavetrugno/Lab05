package it.polito.tdp.anagrammi.model;

public class Parola {

	private String parola;
	private char lettere[];
	//private int size;
	
	public Parola(String parola) {
		this.parola = parola;
		
		for(int i=0; i<parola.length(); i++){
			char c = parola.charAt(i);
			lettere[i] = c;
		}
	}

	/**
	 * @return the parola
	 */
	public String getParola() {
		return parola;
	}

	/**
	 * @param parola the parola to set
	 */
	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
	
	
}
