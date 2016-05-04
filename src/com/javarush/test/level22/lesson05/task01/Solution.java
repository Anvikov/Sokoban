package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        String[] stroka;
        if (string!=null){stroka=string.split(" ");}else {throw new TooShortStringException();}
        String result = "";
        if (stroka.length<5||string==null){
                throw new TooShortStringException();
        }else {result=stroka[1]+" "+stroka[2]+" "+stroka[3]+" "+stroka[4];}
        return result;
    }

    public static class TooShortStringException extends Throwable {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString(null));
    }
}
