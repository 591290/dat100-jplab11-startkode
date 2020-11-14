package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	public int id;
	public int likes;
	public String bruker;
	public String dato;
	
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		this.likes = likes+1;
		
	}
	
	public boolean erLik(Innlegg innlegg) {
		if(innlegg.getId()== this.getId()) {
			return true;
		}
			return false;
	}
	
	@Override
	public String toString() {
		String streng = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		return streng;		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
