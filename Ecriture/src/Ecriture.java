import java.io.*;
//Ecriture - Création : fichier texte
class Ecriture
{
public static void main(String[] args)
{
try
{
BufferedWriter t=new BufferedWriter(new FileWriter("Treillis.txt"));
t.write("1 10 12.5 1 12 15");
t.newLine();
t.write("2 11 13.5 0 3.45 8.73");
t.newLine();
t.write("3 18 24.75 2 12.45 9.25");
t.close();
}
catch (IOException err)
{System.out.println("Erreur :\n"+err);}
} // Fin main()
} // Fin classe
