import java.io.*;

public class Aufgabe_3A_1{

    public static int methode (int input){

        String binary = Integer.toString(input, 2); // eingabe des users wird als string gespeichert

        int anzahlStellen = binary.length(); //anzahl der zeichen in string wird ermittelt
        return anzahlStellen; // anzahl der zeichen wird an variable int input weitergegeben
    }

    public static void main(String[] args) throws IOException {
    
        BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
        int zahl; // eingabe user
        int binarylength; // ergebnis
        do {
            System.out.println("Bitte ganze Zahl groesser als 1 eingeben: ");
            zahl = Integer.parseInt(eingabe.readLine());
            System.out.println("Gelesene Zahl: " + zahl);
            
        }
        while (zahl <= 1); //solange zahl <=1 ist, soll die frage wiederholt werden. wenn zahl > 1, soll beendet werden

        binarylength = methode(zahl); // zugriff auf methode, wert aus methode auf zahl überschreiben

        System.out.println("Anzahl der Binaerstellen von " + zahl + ": " + binarylength );
    }
}