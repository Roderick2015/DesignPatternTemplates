package org.roderick.observer;

/**
 * Created by Roderick on 2016/9/28.
 */
public class TaskSystem implements Observer {

    public void update(Player player, Task task) {
        if (player == null || task == null) //非空验证
            throw new NullPointerException("Player or Task required not null！");

        task.increment();

        if (task.isComplete())
            System.out.println(player.getName() + "完成任务，监听结束。");

    }

}
