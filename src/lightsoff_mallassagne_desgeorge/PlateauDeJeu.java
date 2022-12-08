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
    
    public boolean etregagnant(){
        boolean verif = false;
        int a = 0;
        for (int i=4;i>-1;i--){
            for (int j = 0;j<5;j++){
                if (grille[i][j].Luminosite() == false){
                    a +=1;
                }
                                  
            }
        }
        if (a == 25){
            verif = true;
        }
        return verif;
    }
    
    public boolean Luminosite(int i,int j){
        boolean verif = false;
        if (grille[i][j].Luminosite() == true){
            verif = true;
        }
        return verif;
    }
    
    public void Changementlumiere(int x, int y){
        grille[x][y].Changementlumiere();
    }
    
    public void affichergrille(){
        for (int i=4;i>-1;i--){
            for (int j = 0;j<5;j++){
                if (grille[i][j].Luminosite() == true){
                    System.out.print("[OOO]");
                }
                if (grille[i][j].Luminosite() == false){
                    System.out.print("[XXX]");
                }
                if (j==4){
                    System.out.println("\n");
                }
            }
        }
    }
}
