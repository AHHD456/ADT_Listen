
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

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}

	public int getStunde() {
		return stunde;
	}

	public void setStunde(int stunde) {
		this.stunde = stunde;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSekunde() {
		return sekunde;
	}

	public void setSekunde(int sekunde) {
		this.sekunde = sekunde;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
}
