package com.javarush.test.level38.lesson04.task02;

/* Непроверяемые исключения (unchecked exception)
Напиши реализацию метода methodThrowsClassCastException(). Он должен
всегда кидать непроверяемое исключение ClassCastException.

Напиши реализацию метода methodThrowsNullPointerException(). Он должен
всегда кидать непроверяемое исключение NullPointerException.

Кинуть исключение (throw) явно нельзя.
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Object c=new Character('*');//напишите тут ваш код
        System.out.println((Byte) c);
    }

    public void methodThrowsNullPointerException() {
        int[] ints=new int[1];//напишите тут ваш код
        ints=null;
        int i=ints.length;
    }
}
