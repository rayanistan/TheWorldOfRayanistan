package com.company;

/**
 * Created by Rayanistan on 9/13/16.
 */
public class Enemy {
//my enemy class
    //enemy datatypes
    //hail godzilla
    public String enemy;
    public int enemydmg;
    public int enemyhealth;
    public String name;
    public int health2;
    public String basic;
    public String special;
    public int sd;
    public int bd;
//enemy constructor
    public Enemy(String enmy, int dmg, int health, int hhealth, String nm, String bs, String sp, int spd, int bsd) {

        enemy = enmy;
        enemydmg = dmg;
        enemyhealth = health;
        name = nm;
        health2 = hhealth;
        basic = bs;
        special = sp;
        sd = spd;
        bd = bsd;

    }
//enemy function for battle
    public void Battle() {
        String dmgin; //input
        int bttle = 1; //for loop
        System.out.println(enemy + " " + name + " has challenged you, FIGHT!"); //dialogue
        System.out.println("");
        while (bttle == 1) { //loop to continue battle
            System.out.println("Choose a move (type in) If misssspel1ed you dmg yourself!");
            dmgin = TextIO.getlnString();

            if (dmgin.equals(basic)) { //what happens if you use your basic attack

                enemyhealth -= bd; //enemy losing health
                System.out.println("You used " + basic + " on " + name + " and he now has " + enemyhealth + " health left");
                if (enemyhealth < 1) {
                    System.out.println("You win!");
                    bttle = 2;
                } else {
                    health2 -= enemydmg;
                    System.out.println(enemy + " " + name + " attacked you and dealt" + enemydmg + " damage, you now have " + health2 + " health left");

                }
            } else if (dmgin.equals(special)) { //what happens if you use your special attack

                enemyhealth -= sd; //enemy losing health from special attack
                System.out.println("You used " + special + " on " + name + " and he now has " + enemyhealth + " health left");
                if (enemyhealth < 1) { //what happens if you kill enemy
                    System.out.println("You win!");
                    bttle = 2; //ending loop
                } else {  //if you dont kill enemy, enemy attacks you
                    health2 -= enemydmg; //you lose health
                    System.out.println(enemy + " " + name + " attacked you and dealt" + enemydmg + " damage, you now have " + health2 + " health left");

                }

            } else { //what happens if you misspell

                health2 -= 1; //you lose health as punishment for failing english
                System.out.println("You can't spell and dealt 1 dmg to yourself you have " + health2 + " health left");
                health2 -= enemydmg;
                System.out.println("Then " + name + " attacked you and dealt" + enemydmg + " damage, you now have " + health2 + " health left");
                if (health2 < 1) { //what happens if you die
                    System.out.println("YOU DIED CUZ UR TRASH");
                    bttle = 2; //leaving loop
                    break; //leaving game (just in case)

                }
            }

        }


    }


}
