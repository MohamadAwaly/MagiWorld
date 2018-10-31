package com.momo.principal;

import com.momo.personnage.Gerrier;
import com.momo.personnage.Mage;
import com.momo.personnage.Personnage;
import com.momo.personnage.Rodeur;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choixPersonnage = 0;
        // boucle for pour la création des personnage
        for (int i = 1; i <= 2; i++) {
            int j = 0;
            System.out.println("Création du joueur " + i);
            System.out.println("Veuillez choisir la classe de votre personnage: (1: Guerrier, 2: Rôdeur, 3: Mage): ");
            do {// oblige le joueur a choisir une classe entre 1 et 3
                if (j > 0)
                    System.out.println("La valeur entre n'est pas une classe, Veuillez choisir une Classe entre 1 et 3 (1: Guerrier, 2: Rôdeur, 3: Mage):");
                choixPersonnage = 0;
                try {
                    choixPersonnage = sc.nextInt();
                } catch (InputMismatchException e) {
                    sc.next();
                }
                j++;
            } while (choixPersonnage != 1 && choixPersonnage != 2 && choixPersonnage != 3);
            choixPersonnage(choixPersonnage);
        }
    }
    // Choix du personnage
    public static void choixPersonnage(int choixPersonnage) {
        switch (choixPersonnage) {
            case 1:
                choixPersonnage = 1;
                Gerrier guerrier = new Gerrier();
                caracteristique(guerrier);
                break;
            case 2:
                choixPersonnage = 2;
                Rodeur rodeur = new Rodeur();
                caracteristique(rodeur);
                break;
            case 3:
                choixPersonnage = 3;
                Mage mage = new Mage();
                caracteristique(mage);
                break;
        }
    }

    // Création des caratéristiques des personnages
    public static void caracteristique(Personnage personnage) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Niveau du personnage ? ");
        personnage.setNiveau(sc.nextInt());
        System.out.println("Force du personnage ? ");
        personnage.setForce(sc.nextInt());
        System.out.println("Agilité du personnage ?");
        personnage.setAgilite(sc.nextInt());
        System.out.println("Intelligence du personnage ?");
        personnage.setIntelligence(sc.nextInt());
        personnage.setVie(personnage.getNiveau() * 5);
        System.out.println(personnage.toString());
    }

}
