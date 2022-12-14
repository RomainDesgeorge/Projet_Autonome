/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_mallassagne_desgeorge;

/**
 *
 * @author rom
 */
public class PlateauDeJeu2 {
    public PlateauDeJeu2(){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                grille[i][j] = new Cellule2();
            }
        }
    }
    Cellule2 [][] grille = new Cellule2[5][5];
    
    public boolean etregagnant(){
        boolean verif = false;
        int a = 0;
        int b = 0;
        for (int i=4;i>-1;i--){
            for (int j = 0;j<5;j++){
                if (grille[i][j].Luminosite() == "rouge"){
                    a +=1;
                }
                if (grille[i][j].Luminosite() == "bleu"){
                    b +=1;
                }                                  
            }
        }
        if (a == 25){
            verif = true;
        }
        if (b == 25){
            verif = true;
        }
        return verif;
    }
    
    public String Luminosite(int i,int j){
        String verif = "eteint";
        if (grille[i][j].Luminosite() == "rouge"){
            verif = "rouge";
        }
        if (grille[i][j].Luminosite() == "bleu"){
            verif = "bleu";
        }
        return verif;
    }
    
    public void Changementlumiere(int x, int y){
        grille[x][y].Changementlumiere();
    }
    
    public void affichergrille(){
        for (int i=4;i>-1;i--){
            for (int j = 0;j<5;j++){
                if (grille[i][j].Luminosite() == "rouge"){
                    System.out.print("[OOO]");
                }
                if (grille[i][j].Luminosite() == "eteint"){
                    System.out.print("[XXX]");
                }
                if (grille[i][j].Luminosite() == "bleu"){
                    System.out.print("[&&&]");
                }
                if (j==4){
                    System.out.println("\n");
                }
            }
        }
    }
}
