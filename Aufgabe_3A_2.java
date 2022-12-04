import java.io.*;

public class Aufgabe_3A_2{
    
    public static void main(String[] args) throws IOException {

    BufferedReader eingabe = new BufferedReader(new InputStreamReader(System.in));
    int arraygroesse;
   
    // Abfrage Arraygroesse
    do {
        System.out.println("Wie viele Strings soll ihr Array erhalten?");
        System.out.println("Bitte eine ganze Zahl kleiner als 3 oder groesser als 7 eingeben: ");
        arraygroesse = Integer.parseInt(eingabe.readLine());
        System.out.println("Gelesene Zahl: " + arraygroesse);        
    }
    while ((arraygroesse >=3) & (arraygroesse <=7));
  
    //array erzeugen
  String[] array;
  array = new String[arraygroesse];
  
  System.out.println("Geben Sie den Inhalt für Ihr Array ein:");
  //strings in array einlesen
  for(int i=0; i < arraygroesse; i++)
    array[i]= eingabe.readLine();
    
  int lg;
  System.out.println("Bitte eine ganze Zahl eingeben: ");
        lg = Integer.parseInt(eingabe.readLine());
        
}
}