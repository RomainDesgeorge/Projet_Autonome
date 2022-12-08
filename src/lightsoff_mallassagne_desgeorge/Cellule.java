package lightsoff_mallassagne_desgeorge;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rom
 */
public class Cellule {
    public Cellule(){
        lumi = lumi;
    }
    Lampe lumi = new Lampe();
    
    public boolean Luminosite(){
        boolean verif = false;
        if (lumi.lumiere == true){
            verif = true;
        }
        return verif;
    }
    public void Changementlumiere(){
        lumi.changementlumiere();
    }
}
