/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_mallassagne_desgeorge;

/**
 *
 * @author rom
 */
public class Lampe {
    public Lampe(){
        lumiere = false;
    }
    boolean lumiere;
    
    public void changementlumiere(){
        if (lumiere == false){
            lumiere = true;
        }else{
            lumiere = false;
        }
    }
}
