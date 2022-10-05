package aBituaufgabe.B2.T1.j2023;

public class Listenknoten <T>{

	public T daten;
	public Listenknoten<T> nachfolger;
	
	public Listenknoten(T daten, Listenknoten nachfolger) {
		
		this.daten = daten;
		this.nachfolger =nachfolger;
			
	}
}
