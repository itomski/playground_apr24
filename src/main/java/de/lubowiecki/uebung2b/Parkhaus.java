package de.lubowiecki.uebung2b;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Parkhaus {

    public final int GROESSE;

    private List<ParkVorgang> vorgangsListe = new ArrayList<>();

    public Parkhaus(int groesse) {
        this.GROESSE = groesse;
    }

    public int einparken(String kennzeichen) {
        ParkVorgang vorgang = new ParkVorgang(kennzeichen);
        vorgangsListe.add(vorgang);
        return vorgangsListe.size(); // Erster Index der Liste ist 0
    }

    public void ausparken(int parplatzNr) {
        ParkVorgang vorgang = vorgangsListe.remove(parplatzNr - 1); // Erster Index der Liste ist 0
        vorgang.beenden();
        System.out.println("Parkdauer: " + vorgang.parkDauerInMinuten() + " Minuten");
    }

    public void ausparken(UUID vorgangsNr) {
        // TODO: ausprogrammieren
        throw new UnsupportedOperationException("Muss noch eingebaut werden");
    }

    public void ausparken(String kennzeichen) {
        int nr = vorgangsSuche(kennzeichen);
        if(nr >= 0) {
            ausparken(nr + 1);
        }
        else {
            System.out.println("Kennzeichen nicht bekannt");
        }
    }

    private int vorgangsSuche(String kennzeichen) {
        for (int i = 0; i < vorgangsListe.size() ; i++) {
            ParkVorgang vorgang = vorgangsListe.get(i);
            if(vorgang.getKennzeichen().equals(kennzeichen)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parkhaus{");
        sb.append("GROESSE=").append(GROESSE);
        sb.append(", vorgangsListe=").append(vorgangsListe);
        sb.append('}');
        return sb.toString();
    }
}
