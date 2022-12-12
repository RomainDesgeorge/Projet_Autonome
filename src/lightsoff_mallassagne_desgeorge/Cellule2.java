/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_mallassagne_desgeorge;

/**
 *
 * @author rom
 */
public class Cellule2 {
    public Cellule2(){
        lumi = lumi;
    }
    Lampe2 lumi = new Lampe2();
    
    public boolean Luminosite(){
        boolean verif = false;
        if (lumi.lumiere == "eteint"){
            verif = true;
        }
        return verif;
    }
    public void Changementlumiere(){
        lumi.changementlumiere();
    }    
}
