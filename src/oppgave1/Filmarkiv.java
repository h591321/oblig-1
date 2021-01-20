package oppgave1;

public class Filmarkiv implements FilmarkivADT {
	private Film[] filmSamling;
	private int antall;
	
	public Filmarkiv(int storrelse) {
		this.antall=0;
		this.filmSamling=new Film[storrelse];
	}
	@Override
	public Film[] hentFilmTabell() {
		return filmSamling;
	}
	@Override
	public void leggTil(Film film) { //syntes metoden kan endres på. den gjentar seg selv unødvendig
		if(!finnes(film)) {
			if(tabellPlass()) {
				filmSamling[antall]=film;
				antall++;
			}else {
				utvidFilmSamling();
				filmSamling[antall]=film;
				antall++;
			}
		}
	}

	@Override
	public boolean slettFilm(int filmNr) {
		for(Film film:filmSamling) {
			if(film.getFilmNr()==filmNr) {
				filmSamling[tabellIndex(film)]=filmSamling[antall-1];
				antall--;
				return true;
				}
		}
		return false;
	}
	@Override
	public Film[] soekTittel(String delNavnFilm) {
		// TODO
		return null;
	}
	
	@Override
	public Film[] soekProdusent(String delNavnFilm) {
		// TODO 
		return null;
	}
	@Override
	public int antallSjanger(Sjanger sjanger) {
		int teller=0;
		for(Film a:filmSamling){
			if(a.getSjanger()==sjanger) {
				teller++;
			}
		}
		return teller;
	}
	@Override
	public int antallFilmer() {
		return antall;
	}
	
	//hjelpemetoder under her****************************************************************
	
	
	//hjelpemetode som skjekker om en gitt film finnes i filmsamling tabellen
	public boolean finnes(Film film) { 
		for(Film a:filmSamling) {
			if(a.equals(film)) {
				return true;
			}
		}
		return false;
	}
	//ser om det er plass i filmSamling
	public boolean tabellPlass() {
		if(filmSamling.length<=antall) {
			return false;
		}
		return true;
	}
	//metoden returnerer hva tabellindexen til filmen er. -1 hvis den ikke finnes.
	public int tabellIndex(Film film) {
	for(int i=0;i<antall;i++) {
		if(filmSamling[i].equals(film)) {return i;}
	}
	return -1;
	}
	public void utvidFilmSamling() {
		//TODO - utvidertabellen med 10%
	}

}
