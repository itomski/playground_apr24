package de.lubowiecki.uebung2b;

import java.time.Duration;
import java.time.LocalTime;
import java.util.UUID;

public class ParkVorgang {

    private final String kennzeichen;
    private final UUID vorgangsNr;

    private LocalTime start;
    private LocalTime ende;

    public ParkVorgang(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        this.vorgangsNr = UUID.randomUUID();
        this.start = LocalTime.now(); // .now() liefert den aktuellen Zeitpunkt
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void beenden() {
        this.ende = LocalTime.now();
    }

    public long parkDauerInMinuten() {
        return Duration.between(start, ende).toMinutes(); // liefert den Abstand zwischen zwei Zeitpunkten
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParkVorgang{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", vorgangsNr=").append(vorgangsNr);
        sb.append(", start=").append(start);
        sb.append(", ende=").append(ende);
        sb.append('}');
        return sb.toString();
    }
}
