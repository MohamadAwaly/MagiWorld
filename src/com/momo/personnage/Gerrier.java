package com.momo.personnage;

public class Gerrier extends Personnage {

    public Gerrier(int niveau, int vie, int force, int agilite, int intelligence) {
        super(niveau, vie, force, agilite, intelligence);
        System.out.println("Noveau Guerrier");
    }

    @Override
    public void attaqueBasic() {
        System.out.println("Coup d’Épée");

    }

    @Override
    public void attaqueSpeciale() {
        System.out.println("Coup de Rage");
    }
}
