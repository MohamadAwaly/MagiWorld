package com.momo.personnage;

public class Rodeur extends  Personnage {

    public Rodeur() {
        System.out.println("Nouveau Rodeur");
    }

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

    @Override
    public String toString() {
        return "Ohhh je suis le Rodeur " + super.toString();
    }
}
