/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_mallassagne_desgeorge;

import java.util.Scanner;

/**
 *
 * @author rom
 */
public class Partie {
    public Partie(){
        plateau = new PlateauDeJeu();
    }
    PlateauDeJeu plateau;
    
    public void placerlumiere(){
        int a =0;
        int u=0;
        while (a==0){
        a =(int) (Math.random() * (26));
        
        /**
         * while(a!=0){
            for (int i=0;i<5;i++){
                for (int j=0;j<5;j++){
                    if(plateau.Luminosite(i, j) == false){
                        
                    }
                }
                
            }
            * */
        while (u<a){
            int x ;
            x= (int) (Math.random() * (5));
            int y = (int) (Math.random() * (5));
            if(plateau.Luminosite(x, y) == false){
                plateau.Changementlumiere(x, y);
                u+=1;
            }
        }
        
        
        }
    }
    public void lancerpartie(){
        placerlumiere();
        plateau.affichergrille();
        while(plateau.etregagnant() == false){
            int choix =10;
            System.out.println("Que voulez vous faire? Tapez 1 pour placer un jeton, tapez 2 pour utiliser un bonus");
            Scanner chx = new Scanner (System.in);
            choix = chx.nextInt();
            if (choix == 1){
                int colonne = 0;
                int ligne = 0;
                while (ligne<1 || ligne>5){
                Scanner reponse2 = new Scanner (System.in);
                System.out.println("Dans quelle ligne voulez vous placer votre jeton?");
                ligne = reponse2.nextInt();
                }
                while (colonne<1 || colonne>5){
                Scanner reponse1 = new Scanner (System.in);
                System.out.println("Dans quelle colonne voulez vous placer votre jeton?");
                colonne = reponse1.nextInt();
                }            
                plateau.Changementlumiere(ligne-1, colonne-1);
                if(colonne !=5){
                    plateau.Changementlumiere(ligne-1, colonne);
                }
                if(colonne !=1){
                    plateau.Changementlumiere(ligne-1, colonne-2);
                }
                if(ligne !=5){
                    plateau.Changementlumiere(ligne, colonne-1);
                }
                if(ligne !=1){
                    plateau.Changementlumiere(ligne-2, colonne-1);
                }
            }
            if (choix == 2){
                int choix2 =10;
                System.out.println("Quel bonus voulez vous faire? Tapez 1 pour le bonus une case, tapez 2 pour le bonus toute la grille, tapez 3 pour le bonus pour toute la ligne, tapez 4 pour toute la colonne");
                Scanner chx2 = new Scanner (System.in);
                choix2 = chx2.nextInt(); 
                if (choix2 == 1){
                    int colonne = 0;
                    int ligne = 0;
                    while (ligne<1 || ligne>5){
                    Scanner reponse2 = new Scanner (System.in);
                    System.out.println("Dans quelle ligne voulez vous placer votre jeton?");
                    ligne = reponse2.nextInt();
                    }
                    while (colonne<1 || colonne>5){
                    Scanner reponse1 = new Scanner (System.in);
                    System.out.println("Dans quelle colonne voulez vous placer votre jeton?");
                    colonne = reponse1.nextInt();                    
                    plateau.Changementlumiere(ligne-1, colonne-1);
                }
                if (choix2 == 2){
                   for (int i = 4;i>-1;i--){
                       for (int j = 0;j<5;j++){
                           plateau.Changementlumiere(i, j);
                       }
                   }
                }

                if (choix2 == 3){
                    int ligne2 = 10;
                    while (ligne2<1 || ligne2>5){
                    Scanner reponse2 = new Scanner (System.in);
                    System.out.println("Dans quelle ligne voulez vous placer votre jeton?");
                    ligne2 = reponse2.nextInt();
                    } 
                    for (int i = 0;i<5;i++){
                        plateau.Changementlumiere(ligne2-1, i);
                    } 
                }
                if (choix2 == 4){
                    int colonne2 = 10;
                    while (colonne2<1 || colonne2>5){
                    Scanner reponse2 = new Scanner (System.in);
                    System.out.println("Dans quelle ligne voulez vous placer votre jeton?");
                    colonne2 = reponse2.nextInt();
                    } 
                    for (int i = 0;i<5;i++){
                        plateau.Changementlumiere(i, colonne2-1);
                    } 
                }                    
                }
                
            }
            
            plateau.affichergrille();
        }
        System.out.println("Bien joue!!");
        
    }
            
}
