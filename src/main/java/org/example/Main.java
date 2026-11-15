package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
int Betrag = 100;

        boolean istMitglied = true;
        boolean hatGutschein = false;

            if(Betrag>100 && istMitglied){
                System.out.println("20% Rabatt");
            }
            else if(Betrag>200 && hatGutschein){
                System.out.println("10% Rabatt");
            }
            else {
                System.out.println("0% Rabatt");
            }

        }
    }

