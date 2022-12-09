/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_mallassagne_desgeorge;

import java.util.ArrayList;

/**
 *
 * @author rom
 */
public class Joueur {
    public Joueur(){
        nbpieces = 500; 
        nbcoups = 0;
    }
    int nbpieces;
    int nbcoups;
    ArrayList <Bonus> nbBonus = new ArrayList<>();
}
