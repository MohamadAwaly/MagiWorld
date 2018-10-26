package com.momo.personnage;

public class Rodeur extends  Personnage {
    public Rodeur(int niveau, int vie, int force, int agilite, int intelligence) {
        super(niveau, vie, force, agilite, intelligence);
        System.out.println("Nouveau Rodeur");
    }

    @Override
    public void attaqueBasic() {
        System.out.println("Tir à l’Arc");
    }

    @Override
    public void attaqueSpeciale() {
        System.out.println("Concentration");
    }
}
