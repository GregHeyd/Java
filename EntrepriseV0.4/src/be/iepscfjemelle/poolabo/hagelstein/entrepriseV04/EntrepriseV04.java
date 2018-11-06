/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.iepscfjemelle.poolabo.hagelstein.entrepriseV04;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author greg
 * Dans la v04 : 
 *               - Correction de la sortie de menu d encodage 
 *               - Creation de class map pour cle ( nombre ) valeur ( fonction ) et utilisation de ceux-ci dans les menus
 *               - Utilisation de l iterateur pour l affichage des menus
 *               - Correction de la lecture du fichier ( remplacement de de datainputstram par objetinputstream ET Ajout de Serializable dans les class )
 *               - Utilisation d un hashset dans le but de la verification de presence ou nom d un nom utilisé utilisant le methode equals (Class Personnel)
 *               - Ajout de la IO.FILE dans le but de verifier la presence du fichier et de retourner un message si l encodage n a pas encore ete effectue
 * 
 * 
 *               -Prochaine version utilisation du code Class.forName dans le but de reduire le code 
 */
public class EntrepriseV04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
       Menu obj = new Menu ();
       obj.menu();
    }

}
    

