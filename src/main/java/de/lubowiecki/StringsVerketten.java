package de.lubowiecki;

public class StringsVerketten {

    public static void main(String[] args) {

        String text = "";
        text = text + "...";
        text += "..."; // text = text + "..."
        text += "...";
        text += "...";
        text += "...";
        text += "...";
        System.out.println(text);
    }

}
