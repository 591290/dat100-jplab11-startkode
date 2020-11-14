package no.hvl.dat100.jplab11.oppgave3;


import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

    // TODO: objektvariable 
    private Innlegg[] innleggtabell;
    private int nesteledig;

    public Blogg() {
        innleggtabell = new Innlegg[20];

    }

    public Blogg(int lengde) {
        innleggtabell = new Innlegg[lengde];
        nesteledig = 0;
    }

    public int getAntall() {
        return nesteledig;
    }

    public Innlegg[] getSamling() {
        return innleggtabell;

    }

    public int finnInnlegg(Innlegg innlegg) {

        int funnet = -1;
        for (int i = 0; i < nesteledig; i++) {

            if (innleggtabell[i].erLik(innlegg)) {

                funnet = i;
            }
        }
        return funnet;
    }

    public boolean finnes(Innlegg innlegg) {

        return (finnInnlegg(innlegg) != -1);
    }

    public boolean ledigPlass() {
        return nesteledig < innleggtabell.length;
    }

    public boolean leggTil(Innlegg innlegg) {

        if (ledigPlass() && !finnes(innlegg)) {
            innleggtabell[nesteledig] = innlegg;

            nesteledig++;
            return true;
        }
        return false;
    }

    public String toString() {
        String streng = "" + nesteledig + "\n";
        for (int i = 0; i < nesteledig; i++) {
            streng += innleggtabell[i].toString();
        }
        return streng;
   }
}