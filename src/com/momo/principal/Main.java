package com.momo.principal;

import com.momo.personnage.Gerrier;
import com.momo.personnage.Rodeur;

public class Main {
    public static void main(String[] args) {
        Gerrier joueur1 = new Gerrier(10,10,20,0,30);
        Rodeur joueur2 = new Rodeur(15,10,30,40,50);

        joueur1.attaqueSpeciale();
    }




}
