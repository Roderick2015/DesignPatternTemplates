package org.roderick.observer;

/**
 * 被观察者接口
 */
public interface Observable {
    void addObserver(Observer observer); //添加观察者

    void deleteObserver(Observer observer); //删除观察者

    void notifyObserver(); //通知观察者
}
