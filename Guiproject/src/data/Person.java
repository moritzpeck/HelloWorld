package data;

public class Person {
	private String vorname;
	private String nachname;
	private String plz;
	private String ort;
	public String getVorname() {
		return vorname;
		
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNachname() +", " + getVorname() +" (" + getPlz() + " " + getOrt() + ")";
	}
}
