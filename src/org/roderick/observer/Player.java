package org.roderick.observer;

/**
 * 玩家接口
 */
public interface Player extends Observable {
    void receiveTask();
    void findMonsters();
    void attack();
}
