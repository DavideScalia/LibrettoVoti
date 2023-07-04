package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	// Gestirà un elenco di voti
	// farà quindi una lista di voti
	private List<Voto> voti;

	public Libretto() {
		this.voti = new ArrayList<Voto>();

	}

	/**
	 * Aggiungi un nuovo voto al libretto (per ora non fa nessun controllo)
	 * 
	 * @param v il Voto da aggiungere
	 * @return true
	 */
	// creo un metodo add per il caricamneto degli esami
	public boolean add(Voto v) {
		return this.voti.add(v);
	}

	public void stampa() {
		for (Voto v : this.voti) {
			System.out.println(v);
		}
	}

	//Metodo1
	//esami con voto = a 25
	public void stampa25 () {
		for (Voto v : this.voti) {
			if (v.getPunti() == 25)
				System.out.println(v);
		}
	}
	//metodo 2 stampa punti uguale ad un certo valore
	public void stampaPuntiUguali (int valore) {
		for (Voto v : this.voti) {
			if (v.getPunti() == 25)
				System.out.println(v);
		}
	}
}
