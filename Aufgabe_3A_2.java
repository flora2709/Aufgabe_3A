import java.io.*;

public class Aufgabe_3A_2 {

  public static void main(String[] args) throws IOException {

    BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));

    int arraygroesse;

    /*  eingabe arraygroesse */
    do {
      System.out.println("Wie viele Strings soll ihr Array erhalten?");
      System.out.println("Bitte eine ganze Zahl kleiner als 3 oder groesser als 7 eingeben: ");
      arraygroesse = Integer.parseInt(eingabe.readLine());
      System.out.println("Gelesene Zahl: " + arraygroesse);
    } while ((arraygroesse >= 3) & (arraygroesse <= 7));

    /*  array erzeugen */
    String[] array;
    array = new String[arraygroesse];

    /*  strings in array einlesen */
    for (int i = 0; i < arraygroesse; i++) {
      System.out.println("Geben Sie den Inhalt fuer Ihr Array ein:");
      array[i] = eingabe.readLine();
    }

    /* ausgabe der strings */
    /*for (int j = 0; j < arraygroesse; j++) {        //KONTROLLE
      System.out.print(array[j] + ", ");
    } */

    /* eingabe lg */
    int lg;
    System.out.println("Bitte eine ganze Zahl lg eingeben: ");
    lg = Integer.parseInt(eingabe.readLine());

    int lglength = String.valueOf(lg).length(); 
    //System.out.println("lglength: " + lglength);    //KONTROLLE

    int n = 0;
    int p = 0;

    for (n = 0; n < arraygroesse; n++) { // anzahl strings durchgehen
      for (p = 0; p < lglength; p++) { // zaehler wie viele strings groesser gleich lglength
      }
    }

    /* wie viele strings sind >= lg */
    int groesser = p;
    System.out.println("Anzahl der Strings im Array mit einer Laenge groesser oder gleich lg: " + groesser);

    /* wie viele strings <= lg */
    int kleiner = arraygroesse - p;
    System.out.println("Anzahl der Strings im Array mit einer Laenge kleiner als lg: " + kleiner);

    /* ausgabe verhaeltnis */
    if ( n == p){
      System.out.println("Die Anzahlen sind gleich.");
    }
    if ( n > p){
      System.out.println("Es gibt mehr lange Strings.");
    }
    if (n < p){
      System.out.println("Es gibt mehr kurze Strings.");
    }

  }

}