package com.momo.personnage;

public class Mage extends Personnage {

    public Mage() {
        System.out.println("Nouveau mage");
    }

    public Mage(int niveau, int vie, int force, int agilite, int intelligence) {
        super(niveau, vie, force, agilite, intelligence);
        System.out.println("Nouveau Mage");
    }

    @Override
    public void attaqueBasic() {
        System.out.println("Boule de Feu");
    }

    @Override
    public void attaqueSpeciale() {
        System.out.println("Soin ");
    }

    @Override
    public String toString() {
        return "Abracadbra je suis le Mage " + super.toString();
    }
}
