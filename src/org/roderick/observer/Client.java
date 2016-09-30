package org.roderick.observer;

/**
 * Created by Roderick on 2016/9/28.
 */
public class Client {

    public static void main (String[] args) throws InterruptedException {
        //初始化任务对象
        Task task = new Task();
        task.setName("危险：阿拉韦斯特"); //任务名称
        task.setDescription("消灭阿拉韦斯特"); //这个任务具体要做的事情
        task.setTotal(1); //要揍几只怪物

        //初始化怪物对象
        Monster monster = new Monster();
        monster.setName("阿拉韦斯特");
        monster.setBlood(3);

        //初始化玩家对象
        Player player = new Player();
        TaskSystem system = new TaskSystem(player, task);

        //任务系统启动线程开始监听
        system.start();

        //玩家开始执行任务了
        player.searchMonsters(monster);
        player.attack();
    }

}
