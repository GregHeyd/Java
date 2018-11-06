/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.iepscfjemelle.poolabo.hagelstein.entrepriseV04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author greg
 *
 */
public class Menu {

    int choix;

    public void menu() throws IOException, FileNotFoundException, ClassNotFoundException {
        
        HashMap <String,String> menuMap = new HashMap <>();
        
                menuMap.put("1","Encodage du personnel de l' entreprise.");
                menuMap.put("2","Affichage du peronnel en mode console.");
                menuMap.put("3","Lecture du personnel dans un fichier texte.");
                menuMap.put("4","Quitter le programme.");
                
        System.out.println("\t\t***********************************");
        System.out.println("\t\t*Entreprise v0.4 Menu de démarrage*");
        System.out.println("\t\t***********************************\n\n");
     Set<Map.Entry<String, String>> menu = menuMap.entrySet();
        // Création d'un itérateur
        Iterator<Map.Entry<String, String>> iter = menu.iterator();
        // Parcours de la liste du menu par l'itérateur
        while (iter.hasNext()) {
            Map.Entry<String, String> entree = iter.next();
            String valeur = entree.getValue();
            System.out.println(entree.getKey() + " - " + entree.getValue());

        }
        System.out.println("\n\n\t Entrez votre choix: ");

        choix = Clavier.lireInt();

        switch (choix) {
            case 1:
                GestionMenu entrees = new Entrees();
                entrees.start(this);
                break;
            case 2:
                GestionMenu readconsole = new ReadConsole();
                readconsole.start(this);
                break;
            case 3:
                GestionMenu totext = new Totext();
                totext.start(this);
                break;
            case 4:
                System.out.println("Merci et à bientôt!!!");
                System.exit(0);
                break;
            default :
                System.out.println("Choix entré incorrect");
                this.menu();
                break;

        }

    }
}
