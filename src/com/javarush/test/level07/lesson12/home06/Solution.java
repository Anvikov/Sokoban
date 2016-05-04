package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1=new Human("Ded1",true,70,null,null);
        Human ded2=new Human("Ded2",true,75,null,null);
        Human babka1=new Human("Babka1",false,65,null,null);
        Human babka2=new Human("Babka2",false,68,null,null);
        Human Father=new Human("Father",true,40,ded1,babka1);
        Human mother=new Human("Mother",false,35,ded2,babka2);
        Human son1=new Human("Son1",true,18,Father,mother);
        Human son2=new Human("Son2",true,16,Father,mother);
        Human daughter=new Human("Daughter",false,19,Father,mother);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(babka1);
        System.out.println(babka2);
        System.out.println(Father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);
    }

    public static class Human
    {
       String name;//напишите тут ваш код
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name,boolean sex,int age,Human father, Human mother){this.name=name;this.sex=sex;this.age=age;this.father=father;this.mother=mother;}
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
