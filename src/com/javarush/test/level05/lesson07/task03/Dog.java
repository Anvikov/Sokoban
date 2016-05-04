package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    public String name;//напишите тут ваш код
    public int growth;
    public String color;

    public void initialize (String name){
        this.name=name;
    }
    public void initialize (String name, int growth){
        this.name=name;
        this.growth=growth;
    }
    public void initialize (String name, int growth, String color){
        this.name=name;
        this.growth=growth;
        this.color=color;
    }
}
