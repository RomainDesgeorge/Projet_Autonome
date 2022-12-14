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
        plateau2 = new PlateauDeJeu2();
    }
    PlateauDeJeu plateau;
    PlateauDeJeu2 plateau2;
    
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
    
    public void placerlumiere2(){
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
            if(plateau2.Luminosite(x, y) == "eteint"){
                plateau2.Changementlumiere(x, y);
                u+=1;
            }
        }
        
        
        }
    }
    public void lancerpartie(Joueur joueur1){
        while (joueur1.nbpieces >=100){
        System.out.println("Que voulez vous acheter?Vous avez "+joueur1.nbpieces+" pieces.\n1 le bonus une case(250 pieces)\n2 le bonus toutecase(100 pieces)\n3 le bonus une ligne(150 pieces)\n4 le bonus une colonne(150 pieces)\n5 quitter la boutique");
        Scanner chxxx = new Scanner (System.in);
        int choix1 = chxxx.nextInt(); 
        if (choix1 == 1){
            if (joueur1.nbpieces >= 250){
            joueur1.obtenirnbbonus_unecase();
            joueur1.nbpieces -=250;
            }else{
                System.out.println("Vous n'avez pas assez de pièces");
            }
        }
        if (choix1 == 2){
            if (joueur1.nbpieces >= 100){
            joueur1.obtenirnbbonus_toutecase();
            joueur1.nbpieces -=100;
            }else{
                System.out.println("Vous n'avez pas assez de pièces");
            }
        }
        if (choix1 == 3){
            if (joueur1.nbpieces >= 150){
            joueur1.obtenirnbbonus_uneligne();
            joueur1.nbpieces -=150;
            }else{
                System.out.println("Vous n'avez pas assez de pièces");
            }
        }
        if (choix1 == 4){
            if (joueur1.nbpieces >= 150){
            joueur1.obtenirnbbonus_unecolonne();
            joueur1.nbpieces -=150;
            }else{
                System.out.println("Vous n'avez pas assez de pièces");
            }
        }
        if (choix1==5){
            break;
        }
        }
        System.out.println("Quel niveau de difficulté voulez-vous?\nTapez 1 pour le niveau facile (une lumiere)\nTapez 2 pour le niveau difficile(2lumieres)");
        Scanner chxxxx = new Scanner (System.in);
        int choix11 = chxxxx.nextInt();        
        
        if (choix11==1){
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
                    if (joueur1.nbbonus_unecase !=0){
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
                    joueur1.utilisernbbonus_unecase();
                    }
                    else{
                        System.out.println("Mon poto t'en as pas cheh");
                    }                    
                }
                if (choix2 == 2){
                    if (joueur1.nbbonus_toutecase !=0){
                        for (int i = 4;i>-1;i--){
                            for (int j = 0;j<5;j++){
                               plateau.Changementlumiere(i, j);
                            }
                        }
                    joueur1.utilisernbbonus_toutecase();
                    }
                    else{
                        System.out.println("Mon poto t'en as pas cheh");
                    }                   
                }

                if (choix2 == 3){
                    if (joueur1.nbbonus_uneligne !=0){
                        int ligne2 = 10;
                        while (ligne2<1 || ligne2>5){
                            Scanner reponse2 = new Scanner (System.in);
                            System.out.println("Dans quelle ligne voulez vous placer votre jeton?");
                            ligne2 = reponse2.nextInt();
                        } 
                        for (int i = 0;i<5;i++){
                            plateau.Changementlumiere(ligne2-1, i);
                        }
                    joueur1.utilisernbbonus_uneligne();
                    }
                    else{
                        System.out.println("Mon poto t'en as pas cheh");
                    }                    
                }                
                if (choix2 == 4){                    
                    if (joueur1.nbbonus_unecolonne !=0){
                        int colonne2 = 10;
                        while (colonne2<1 || colonne2>5){
                        Scanner reponse2 = new Scanner (System.in);
                        System.out.println("Dans quelle ligne voulez vous placer votre jeton?");
                        colonne2 = reponse2.nextInt();
                        } 
                        for (int i = 0;i<5;i++){
                            plateau.Changementlumiere(i, colonne2-1);
                        } 
                    joueur1.utilisernbbonus_unecolonne();
                    }
                    else{
                        System.out.println("Mon poto t'en as pas cheh");
                    }
                }                    
            
                
            }
        
            
            plateau.affichergrille();
        }
        }
        if(choix11==2){
        placerlumiere2();
        plateau2.affichergrille();
        while(plateau2.etregagnant() == false){
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
                plateau2.Changementlumiere(ligne-1, colonne-1);
                if(colonne !=5){
                    plateau2.Changementlumiere(ligne-1, colonne);
                }
                if(colonne !=1){
                    plateau2.Changementlumiere(ligne-1, colonne-2);
                }
                if(ligne !=5){
                    plateau2.Changementlumiere(ligne, colonne-1);
                }
                if(ligne !=1){
                    plateau2.Changementlumiere(ligne-2, colonne-1);
                }
            }
            if (choix == 2){
                int choix2 =10;
                System.out.println("Quel bonus voulez vous faire? Tapez 1 pour le bonus une case, tapez 2 pour le bonus toute la grille, tapez 3 pour le bonus pour toute la ligne, tapez 4 pour toute la colonne");
                Scanner chx2 = new Scanner (System.in);
                choix2 = chx2.nextInt(); 
                if (choix2 == 1){
                    if (joueur1.nbbonus_unecase !=0){
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
                    plateau2.Changementlumiere(ligne-1, colonne-1);
                    joueur1.utilisernbbonus_unecase();
                    }
                    else{
                        System.out.println("Mon poto t'en as pas cheh");
                    }                    
                }
                if (choix2 == 2){
                    if (joueur1.nbbonus_toutecase !=0){
                        for (int i = 4;i>-1;i--){
                            for (int j = 0;j<5;j++){
                               plateau2.Changementlumiere(i, j);
                            }
                        }
                    joueur1.utilisernbbonus_toutecase();
                    }
                    else{
                        System.out.println("Mon poto t'en as pas cheh");
                    }                   
                }

                if (choix2 == 3){
                    if (joueur1.nbbonus_uneligne !=0){
                        int ligne2 = 10;
                        while (ligne2<1 || ligne2>5){
                            Scanner reponse2 = new Scanner (System.in);
                            System.out.println("Dans quelle ligne voulez vous placer votre jeton?");
                            ligne2 = reponse2.nextInt();
                        } 
                        for (int i = 0;i<5;i++){
                            plateau2.Changementlumiere(ligne2-1, i);
                        }
                    joueur1.utilisernbbonus_uneligne();
                    }
                    else{
                        System.out.println("Mon poto t'en as pas cheh");
                    }                    
                }                
                if (choix2 == 4){                    
                    if (joueur1.nbbonus_unecolonne !=0){
                        int colonne2 = 10;
                        while (colonne2<1 || colonne2>5){
                        Scanner reponse2 = new Scanner (System.in);
                        System.out.println("Dans quelle ligne voulez vous placer votre jeton?");
                        colonne2 = reponse2.nextInt();
                        } 
                        for (int i = 0;i<5;i++){
                            plateau2.Changementlumiere(i, colonne2-1);
                        } 
                    joueur1.utilisernbbonus_unecolonne();
                    }
                    else{
                        System.out.println("Mon poto t'en as pas cheh");
                    }
                }                    
            
                
            }
        
            
            plateau2.affichergrille();
        }
        }       
        System.out.println("Bien joue!!");
        
    }
            
}
