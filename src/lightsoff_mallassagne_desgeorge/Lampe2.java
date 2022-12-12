/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_mallassagne_desgeorge;

/**
 *
 * @author rom
 */
public class Lampe2 {
    public Lampe2(){
        lumiere = "eteint";
    }
    String lumiere;
    
    public void changementlumiere(){
        if (lumiere == "eteint"){
            lumiere = "rouge";
        }else if(lumiere == "rouge"){
            lumiere = "bleu";
        }else{
            lumiere = "eteint";
        }
    }    
}
