package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
import com.javarush.test.level27.lesson15.big01.statistic.StatisticEventManager;
import com.javarush.test.level27.lesson15.big01.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Observable implements Runnable
{
    private String name;
    private LinkedBlockingQueue<Order> queue;
    private boolean stopped = false;
    private boolean caught = false;
    public void setQueue(LinkedBlockingQueue<Order> queue)
    {
        this.queue = queue;
    }
    public Cook(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return String.valueOf(name);
    }
    public void startCookingOrder(Order order) {
        ConsoleHelper.writeMessage("Start cooking - " + order + ", cooking time " + order.getTotalCookingTime() + "min");
        StatisticEventManager.getInstance().register(new CookedOrderEventDataRow(order.getTablet().toString(), name, order.getTotalCookingTime()*60, order.getDishes()));
        try
        {
            Thread.sleep(order.getTotalCookingTime() * 10);
        }
        catch (InterruptedException e)
        {
            caught = true;
        }
        setChanged();
        notifyObservers(order);
    }
    @Override
    public void run()
    {
        while (!stopped)
        {
            try
            {
                startCookingOrder(queue.take());
            }
            catch (InterruptedException e)
            {
                caught = true;
            }
            if (caught && queue.isEmpty())
                stopped = true;
        }
    }
}