package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        double betrag = 100.1;
        boolean istMitglied = false;
        boolean hatGutschein = true;

        String ergebniss = berechneEndpreis(betrag, istMitglied, hatGutschein);

        System.out.println(ergebniss);

    }

    public static String berechneEndpreis(double warenwert, boolean istMitglied, boolean hatGutschein) {
        String ergebniss;
        double preis;

        if (warenwert > 100 && istMitglied) {
            preis = berechnung(warenwert, 20);
            ergebniss = "20% Rabatt, Endpreis: " + preis;
        } else if (warenwert > 200 || hatGutschein) {
            preis = berechnung(warenwert, 10);
            ergebniss = "10% Rabatt, Endpreis " + preis;
        } else {
            ergebniss = "Kein Rabatt, Endpreis: " + warenwert;
        }

        return ergebniss;
    }

    static double berechnung (double preis, int prozent){
        double reduktion = preis / 100 * prozent;

        return preis - reduktion;
    }

}

