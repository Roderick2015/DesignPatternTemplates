package org.roderick.observer;


/**
 * Created by Roderick on 2016/9/28.
 */
public class Client {
    public static void main (String[] args) {
        //创建任务系统对象 — 观察者
        GameSystem taskSystem = new TaskSystem();
        //创建奖励系统对象 — 观察者
        GameSystem rewardSystem = new RewardSystem();

        //创建玩家对象 — 被观察者
        Player player1 = new ZhangSan();
        //添加观察者
        player1.addObserver(taskSystem);
        player1.addObserver(rewardSystem);

        //玩家开始执行任务了
        player1.receiveTask(); //先接受任务
        player1.findMonsters(); //再找到任务怪
        player1.attack(); //开扁
    }
}
