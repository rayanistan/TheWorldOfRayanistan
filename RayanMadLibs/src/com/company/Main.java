package com.company;

public class Main {
//start of program
    public static void main(String[] args) throws InterruptedException {
        //The next lines are all datatypes
        String character;
        String input;
        String gun = "  ̿ ̿ ̿ ̿'\\";
        String sword = "<====|--";
        String staff = "*═════";
        String weapon = "";
        int helth = 0;
        int bd = 0;
        int sd = 0;
        String master = "";
        String basic = "";
        String special = "";
        int cont = 1;
        //end of datatypes

        while(cont == 1){ //while loop for restarting
        System.out.println("Narrator: Welcome to the world of Rayanistan...pls type in how you look and your name");
//dialogue
        character = TextIO.getlnString();  //taking input from textIO
        String[] strings = character.split(", "); //taking in two datatypes
        System.out.println("Wow " + strings[1] + " you're ugl-COUGH COUGH I mean beautiful");
        System.out.println("Now pls choose a weapon: \n   ̿ ̿ ̿ ̿\\ A gun \n  <====|-- A sword \n  *═════  A staff \n (type in without letter A)");
        input = TextIO.getlnString();
        if (input.equals("gun")) {  //if statement for class s
            weapon = gun;
            basic = "pew pew";
            special = "shooterino";
            master = "gunsmith";
            bd = 14;
            sd = 18;
            helth = 15;
            System.out.println("Hmmm this? " + weapon + " Good choice, let's go to the gunsmith");
            System.out.println("");
        } else if (input.equals("sword")) { //another if but else if

            weapon = sword;
            basic = "cut";
            special = "slice and dice";
            master = "sword dude";
            bd = 8;
            sd = 16;
            helth = 25;
            System.out.println("Hmmm this? " + weapon + " Good choice, let's go to the sword dude");
            System.out.println("");
        } else if (input.equals("staff")) { //another if
            weapon = staff;
            basic = "abracadabra";
            special = "magic boom boom";
            master = "woozard";
            bd = 10;
            sd = 22;
            helth = 20;
            System.out.println("Hmmm this? " + weapon + " Good choice, let's go to the woozard");
            System.out.println("");

        } else if(input.equals("Rayanistan feat. onepunch")){ //another if
            weapon = "";
            basic = "easy punch";
            special = "normal punch";
            master = "yourself";
            bd = 10000;
            sd = 1000000;
            helth = 20000;
            System.out.println("I BOW DOWN TO YOU RAYANISTAN, PRAISE THEE RAYANISTAN I AM SORRY FOR ANYTHING I SAID, I THOUGHT YOU WERE MAKING UP THE NAME BEFORE");
            System.out.println("");


        }

        //using my functions to setup battle
        Character poopyman = new Character(bd, sd, helth, strings[1], master, weapon, basic, special);
        Enemy jacob = new Enemy("[CENSORED]", 1, 5, poopyman.health, "Jacob Satorious", poopyman.basic, poopyman.special, poopyman.basicdmg, poopyman.specialdmg );
        Enemy weeaboo = new Enemy("(ノಠ益ಠ)ノ KAWAII", 3, 20, poopyman.health, "Weeaboo", poopyman.basic, poopyman.special, poopyman.basicdmg, poopyman.specialdmg );
        Enemy evjen = new Enemy("(ಠ╭╮ಠ)", 6, 25, poopyman.health, "Mr. Evjen", poopyman.basic, poopyman.special, poopyman.basicdmg, poopyman.specialdmg );

        Thread.sleep(1000); //pause function
        System.out.println("*walking to " +poopyman.master); //more dialogue
        Thread.sleep(2000);
        System.out.println("( ͡° ͜ʖ ͡°): Hello, I am the " + poopyman.master + " I will teach u 2 moves right now so you don't die");
        System.out.println("");
        Thread.sleep(3000);

        if (weapon == gun) { //more dialogue explaining moves to player
            System.out.println("The first move is pew pew, your basic attack and the second is shooterino your special attack (may use this only 3 times per battle) \n let's do a practice battle with a weak monster");

            System.out.println("");
        } else if (weapon == sword) {
            System.out.println("The first move is cut, your basic attack and the second is slice and dice your special attack (may use this only 3 times per battle) \n let's do a practice battle with a weak monster");
            System.out.println("");
        } else if (weapon == staff) {
            System.out.println("The first move is abracadabra, your basic attack and the second is magic boom boom your special attack (may use this only 3 times per battle) \n let's do a practice battle with a weak monster");
            System.out.println("");
        }
        System.out.println(""); //spacing
        Thread.sleep(3000);
        jacob.Battle(); //function for battle
            if (jacob.health2 < 1){ //for death of player
                return;

            } //more dialogue below
        System.out.println("( ͡° ͜ʖ ͡°): GOOD JOB " + poopyman.name + " you got rid of my pest infestation...FOR FREE!");
        Thread.sleep(3000);
        System.out.println("");
        System.out.println("( ͡° ͜ʖ ͡°): Hey look....someone is coming this way");
        Thread.sleep(3000);
        System.out.println("");
        System.out.println("(ಥ﹏ಥ): HELP HELP, THERE IS A WEEABO RUNNING RAMPANT IN MY FARM!!!! OH NO HERE HE COMES CYA!");
        Thread.sleep(3000);
        System.out.println("");
        System.out.println("");
        Thread.sleep(1000);
        weeaboo.Battle();
        if (weeaboo.health2 < 1){ //death of player
            return;

        }
        Thread.sleep(1000);
        System.out.println("( ͡° ͜ʖ ͡°): Wow " +poopyman.name +" You're a natural I think you are almost ready to start your journey alone into Rayanistan");
        Thread.sleep(1000);
        System.out.println("( ͡° ͜ʖ ͡°): Now for our final battle you will fight paparambe conjurer of the f-boys and opposer of the memborne AKA: Mr. Evjen");

        Thread.sleep(3000);
        System.out.println("(ಠ╭╮ಠ): what the heck am i doing here...");
        evjen.Battle();
        Thread.sleep(1000);
            if(poopyman.name.equals("Rayanistan")){ //secret stuffz
                System.out.println("(ಠ╭╮ಠ): Oh hi rayan, you made a beautiful game so you get an A+++++");
                return;
            }
        System.out.println("(ಠ╭╮ಠ): ENOUGH! Go outside!"); //more dialogue
        Thread.sleep(1000);
        System.out.println("You cannot fight your teachers...THE END");
        Thread.sleep(1000);
        System.out.println("Retry in 3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Now choose either 1 to restart or 2 to end"); //asking to restart
        input = TextIO.getlnString();
        if (input.equals("1")){
            cont = 1;
        }
         else{ //ending
            cont = 2; //stopping while loop
            return; //just to be fancy
        }



    }
}
}

