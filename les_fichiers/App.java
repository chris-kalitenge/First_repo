
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner lire = new Scanner(System.in);

         try {
            // Écriture dans le fichier
            BufferedWriter writer = new BufferedWriter(new FileWriter("voiture.txt"));
            Voiture v1 = new Voiture("toyota", 4, 4, 999, 5);
            writer.write(v1.toFileFormat()); 
            writer.newLine(); // Nouvelle ligne pour le prochain enregistrement
            writer.close();

            // Lecture depuis le fichier
            BufferedReader reader = new BufferedReader(new FileReader("voiture.txt"));
            String line;
            System.out.println("My cars here");
            System.out.println("*****************");
            while ((line = reader.readLine()) != null) {
                Voiture voitureLue = Voiture.fromFileFormat(line);
                System.out.println(voitureLue.description());
                System.out.println("*****************");
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        lire.close();
    }
}