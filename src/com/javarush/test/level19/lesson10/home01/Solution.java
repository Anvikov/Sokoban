package com.javarush.test.level19.lesson10.home01;
/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом
Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources
Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1
Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException{
        Map<String,Double> m=new HashMap<String, Double>();
        String s=args[0];
        BufferedReader file=new BufferedReader(new FileReader(args[0]));
        String line;
        String d="";
        Double t=0.0;
        while ((line=file.readLine())!=null)
        {
            String[] dd=line.split(" ");
            if (m.containsKey(dd[0]))
            {
                t=m.get(dd[0]);
                t+=Double.parseDouble(dd[1]);
                m.remove(dd[0]);
                m.put(dd[0],t);
            }
            else m.put(dd[0],Double.parseDouble(dd[1]));
        }
        String[] q=new String[m.size()];
        int qc=0;
        Iterator<Map.Entry<String,Double>> it=m.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String,Double> pair=it.next();
            q[qc]=pair.getKey();
            qc++;
        }
        Arrays.sort(q);
        for (int i=0;i<qc;i++)
        {
            System.out.println(q[i]+" "+m.get(q[i]));
        }
        file.close();
    }
}