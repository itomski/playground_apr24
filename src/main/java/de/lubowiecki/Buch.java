package de.lubowiecki;

public class Buch {

    // Instanzvariablen beschreiben die Eigenschaften eines Objektes
    // Methoden beschreiben die Fähigkeiten eines Objektes

    private String isbn; // Instanzvariablen
    private String autor;
    private String titel;
    private int erscheinungsJahr;
    private boolean ebook;
    private int seiten;

    public Buch() {
    }

    public Buch(String isbn, String autor, String titel, int erscheinungsJahr, boolean ebook, int seiten) {
        this.isbn = isbn;
        this.autor = autor;
        this.titel = titel;
        this.erscheinungsJahr = erscheinungsJahr;
        this.ebook = ebook;
        this.seiten = seiten;
    }

    public Buch(String autor, String titel) {
        this.autor = autor;
        this.titel = titel;
    }

    // Mit Gettern und Settern kann das Lesen und Schreiben kontrolliert werden

    public int getErscheinungsJahr() { // Lesen
        return erscheinungsJahr;
    }

    public void setErscheinungsJahr(int erscheinungsJahr) { // Schreiben
        if(erscheinungsJahr > 0) {
            // this.erscheinungsJahr = Instanzvariable
            // erscheinungsJahr = Lokale Variable / Parameter
            this.erscheinungsJahr = erscheinungsJahr;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public boolean isEbook() {
        return ebook;
    }

    public void setEbook(boolean ebook) {
        this.ebook = ebook;
    }

    public int getSeiten() {
        return seiten;
    }

    public void setSeiten(int seiten) {
        this.seiten = seiten;
    }
}
