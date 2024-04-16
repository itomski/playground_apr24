package de.lubowiecki.uebung3b;

// Position und Bewegung des Roboters
public class Robot {

    private String name;

    private char kennung = '@';

    private int x;
    private int y;

    public static final String[] RICHTUNGEN = {"Osten", "Süden", "Westen", "Norden"};

    private int richtung;

    public Robot(String name) {
        this.name = name;
    }

    public Robot(String name, char kennung) {
        this.name = name;
        this.kennung = kennung;
    }

    public Robot(String name, int x, int y) {
        this.name = name;
        this.kennung = kennung;
        this.x = x;
        this.y = y;
    }

    public Robot(String name, char kennung, int x, int y) {
        this.name = name;
        this.kennung = kennung;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getKennung() {
        return kennung;
    }

    public void vorwaerts() {

        // TODO: In eine gemeinsame Methode auslagern

        switch(richtung) {
            case 0:
                x++;
                break;

            case 1:
                y++;
                break;

            case 2:
                x--;
                break;

            case 3:
                y--;
                break;
        }
    }

    public void rueckwaerts() {

        // TODO: In eine gemeinsame Methode auslagern

        switch(richtung) {
            case 0:
                x--;
                break;

            case 1:
                y--;
                break;

            case 2:
                x++;
                break;

            case 3:
                y++;
                break;
        }
    }

    public void rechtsDrehen() {
        // 0 = Osten, 1 = Süden, 2 = Westen, 3 = Norden
        richtung = ++richtung % 4;
    }

    public void linksDrehen() {
        richtung = (richtung + 3) % 4;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Robot{");
        sb.append("name='").append(name).append('\'');
        sb.append(", kennung=").append(kennung);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", richtung=").append(RICHTUNGEN[richtung]);
        sb.append('}');
        return sb.toString();
    }
}
