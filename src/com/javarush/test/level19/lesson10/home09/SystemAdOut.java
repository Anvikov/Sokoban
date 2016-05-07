package com.javarush.test.level19.lesson10.home09;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by User on 007 2016.05.07..
 */
public class SystemAdOut extends PrintStream
{

    private int lineCounter=0;

    public PrintStream getOldPrintStream()
    {
        return oldPrintStream;
    }

    private PrintStream oldPrintStream;
    public SystemAdOut(PrintStream oldPrintStream)
    {
        super(new ByteArrayOutputStream());
        this.oldPrintStream=oldPrintStream;
    }

    @Override
    public void println(String x) {
        oldPrintStream.println(x);
        lineCounter++;
        if (lineCounter%2==0)
            oldPrintStream.println("JavaRush - курсы Java онлайн");
    }

}