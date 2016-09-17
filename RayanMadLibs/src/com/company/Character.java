package com.company;

public class Character { //class for setting up character
   public int basicdmg;
    public int specialdmg;
   public  int health;
    public String master = null;
   public  String weapon = null;   //character datatypes
    public String basic = null;
   public  String special = null;
   public String name = null;
    public  Character(int bd, int sd, int helth, String nam, String mast, String wep, String b, String s){ //character constructor

        basicdmg = bd;
        specialdmg = sd;
        health = helth;
        master = mast;  //character datatypes getting their values
        weapon = wep;
        basic = b;
        special = s;
         name = nam;


    }


}
