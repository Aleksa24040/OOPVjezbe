
public class Drugizadatak {
	private String ime;
	private String prezime;
	private int godine_staza;
	private double plata;
	
	public Drugizadatak(String ime, String prezime, int godine_staza, double plata) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine_staza = godine_staza;
		this.plata = plata;
	}

	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodine_staza() {
		return godine_staza;
	}
	public void setGodine_staza(int godine_staza) {
		this.godine_staza = godine_staza;
	}
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata = plata;
	}
	
	
	
	public void uvecajplatu() {
		if (this.plata < 800 && this.godine_staza > 10) {
			this.plata = plata + plata * 0.06;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drugizadatak Zaposleni1 = new Drugizadatak ("Nikolina ", "Nikolic",7, 900);
		System.out.print(Zaposleni1);
		System.out.println(Zaposleni1.getPlata());
	}

}
