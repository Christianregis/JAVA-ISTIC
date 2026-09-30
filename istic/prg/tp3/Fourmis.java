package fr.istic.prg.tp3;

public class Fourmis {

    public static String next(String ui) {
        int compteur = 0;
        StringBuilder result = new StringBuilder();
        String elt = ui.substring(0, 1);
        for (int i = 0; i < ui.length(); i++) {
            if (elt.equals(ui.substring(i, i + 1))) {
                compteur++;
            } else {
                result.append("" + compteur);
                result.append(ui.charAt(i - 1));
                compteur = 1;
                elt = ui.substring(i, i + 1);
            }
        }
        result.append("" + compteur);
        result.append(ui.charAt(ui.length() - 1));
        return result.toString();
    }

    public static void main(String[] args) {
        String value = "1";
        for (int i = 1; i <= 9; i++) {
            value = Fourmis.next(value);
            System.out.println("U" + i + " = " + value);
        }
    }
}