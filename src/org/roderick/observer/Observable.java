package org.roderick.observer;

/**
 * 被观察者接口
 */
public interface Observable {
    public void addObserver(Observer observer); //添加观察者

    public void deleteObserver(Observer observer); //删除观察者

    public void notifyObserver(); //通知观察者
}
