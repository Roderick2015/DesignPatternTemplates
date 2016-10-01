package org.roderick.observer;

/**
 * Created by Roderick on 2016/9/28.
 */
public class Client {

    public static void main (String[] args) {
        //创建任务系统对象 — 观察者
        TaskSystem system = new TaskSystem();

        //创建玩家对象 — 被观察者
        Player player = new Player();
        //添加观察者
        player.addObserver(system);

        //玩家开始执行任务了
        player.receiveTask(); //先接受任务
        player.searchMonsters(); //再找到任务怪
        player.attack(); //开扁
    }

}
