package com.momo.personnage;

public abstract class Personnage {

    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;
    private static int nbrJoueur;

    //Constructeur vide
    public Personnage() {
        nbrJoueur++;
    }

    // Constructeur avec des paramètre
    public Personnage(int niveau, int vie, int force, int agilite, int intelligence) {
        System.out.println("Nouveau personnage");
        this.niveau = niveau;
        this.vie = vie;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        nbrJoueur++;
    }

    public abstract void attaqueBasic();

    public abstract void attaqueSpeciale();

    public int getNiveau() {
        return niveau;
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setNiveau(int niveau) {

        this.niveau = niveau;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "Joueur " + nbrJoueur +
                ", niveau " + niveau +
                " je possède " + vie + " de vitalité, " +
                force + " de force " +
                agilite + " d'agilite " +
                "et " + intelligence + " d'intelligence ";
    }
}
