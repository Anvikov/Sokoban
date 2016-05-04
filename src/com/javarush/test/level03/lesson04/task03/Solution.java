package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg Diablo_1= new Zerg();
        Diablo_1.name= "Peter";
        Zerg Diablo_2= new Zerg();
        Diablo_2.name= "Perer_2";
        Zerg Diablo_3= new Zerg();
        Diablo_3.name= "Perer_3";
        Zerg Diablo_4= new Zerg();
        Diablo_4.name= "Perer_4";
        Zerg Diablo_5= new Zerg();
        Diablo_5.name= "Perer_5";
        Zerg Diablo_6= new Zerg();
        Diablo_6.name= "Perer_6";
        Zerg Diablo_7= new Zerg();
        Diablo_7.name= "Perer_7";
        Zerg Diablo_8= new Zerg();
        Diablo_8.name= "Perer_8";
        Zerg Diablo_9= new Zerg();
        Diablo_9.name= "Perer_9";
        Zerg Diablo_10= new Zerg();
        Diablo_10.name= "Perer_10";

        Protos Prot1=new Protos();
        Prot1.name="Prot1";
        Protos Prot2=new Protos();
        Prot2.name="Prot2";
        Protos Prot3=new Protos();
        Prot3.name="Prot3";
        Protos Prot4=new Protos();
        Prot4.name="Prot4";
        Protos Prot5=new Protos();
        Prot5.name="Prot5";

        Terran Terran1=new Terran();
        Terran1.name="Terran1";
        Terran Terran2=new Terran();
        Terran2.name="Terran2";
        Terran Terran3=new Terran();
        Terran3.name="Terran3";
        Terran Terran4=new Terran();
        Terran4.name="Terran4";
        Terran Terran5=new Terran();
        Terran5.name="Terran5";
        Terran Terran6=new Terran();
        Terran6.name="Terran6";
        Terran Terran7=new Terran();
        Terran7.name="Terran7";
        Terran Terran8=new Terran();
        Terran8.name="Terran8";
        Terran Terran9=new Terran();
        Terran9.name="Terran9";
        Terran Terran10=new Terran();
        Terran10.name="Terran10";
        Terran Terran11=new Terran();
        Terran11.name="Terran11";
        Terran Terran12=new Terran();
        Terran12.name="Terran12";

        //напишите тут ваш код


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}