
public class Notruf {

	int nummer;
	int prio;
	int stunde;
	int minute;
	int sekunde;
	String beschreibung;
	
	public Notruf(int nummer, int prio, int stunde, int minute, int sekunde, String beschreibung) {
		this.nummer = nummer;
		this.prio =prio;
		this.stunde =stunde;
		this.minute =minute;
		this.sekunde =sekunde;
		this.beschreibung = beschreibung;
	}
	
	public void anzeigen() {
		System.out.println("Notruf:"+nummer+" Prio:"+prio+" "+stunde+":"+minute+":"+sekunde+ "  "+ beschreibung);
	}
}
