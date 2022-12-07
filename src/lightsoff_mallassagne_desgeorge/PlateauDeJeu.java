/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_mallassagne_desgeorge;

/**
 *
 * @author rom
 */
public class PlateauDeJeu {
    public PlateauDeJeu(){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                grille[i][j] = new Cellule();
            }
        }
    }
    Cellule [][] grille = new Cellule[5][5];
    
    public void affichergrille(){
        for (int i=4;i>-1;i--){
            for (int j = 0;j<5;j++){
                if (grille[i][j].Luminosite() == true){
                    System.out.print("[OOO]");
                }
                if (grille[i][j].Luminosite() == false){
                    System.out.print("[XXX]");
                }
                if (i==4){
                    System.out.println("\n");
                }
            }
        }
    }
}
