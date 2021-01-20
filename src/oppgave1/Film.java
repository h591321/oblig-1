package oppgave1;

public class Film {
	private int filmNr;
	private String produsent;
	private String tittel;
	private int aar;
	private Sjanger sjanger;
	private String selskap;
	
	public Film(int filmNr, String produsent, String tittel, int aar, Sjanger sjanger, String selskap){
		this.filmNr=filmNr;
		this.produsent=produsent;
		this.tittel=tittel;
		this.aar=aar;
		this.sjanger=sjanger;
		this.selskap=selskap;
	}
	public Film() {
		
	}
	public int getFilmNr() {
		return filmNr;
	}
	public void setFilmNr(int filmNr) {
		this.filmNr = filmNr;
	}
	public String getProdusent() {
		return produsent;
	}
	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}
	public String getTittel() {
		return tittel;
	}
	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
	public int getAar() {
		return aar;
	}
	public void setAar(int aar) {
		this.aar = aar;
	}
	public Sjanger getSjanger() {
		return sjanger;
	}
	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}
	public String getSelskap() {
		return selskap;
	}
	public void setSelskap(String selskap) {
		this.selskap = selskap;
	}
	@Override
	public String toString() {
		return "Film [filmNr=" + filmNr + ", produsent=" + produsent + ", tittel=" + tittel + ", aar=" + aar
				+ ", sjanger=" + sjanger + ", selskap=" + selskap + "]";
	}
}
