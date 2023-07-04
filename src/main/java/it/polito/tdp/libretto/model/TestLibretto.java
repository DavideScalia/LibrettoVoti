package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libretto lib = new Libretto() ;
		
		lib.add(new Voto("Analisi 1", 29, LocalDate.of(2021, 2, 15))) ;
		lib.add(new Voto("Fisica 2", 21, LocalDate.of(2022, 6, 30))) ;
		lib.add(new Voto("Fisica 1", 25, LocalDate.of(2023, 6, 30))) ;
	
		//Per stampare tutti i voti 
		//lib.stampa();
		//per stampare i voti = 25
		//lib.stampa25();
		
		
		//stampa voti con valore uguale al parametro che dichiaro 
		lib.stampaPuntiUguali(25);
	}
	
	
}
