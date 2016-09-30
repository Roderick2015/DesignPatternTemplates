package org.roderick.observer;

/**
 * Created by Roderick on 2016/9/28.
 */
public class TaskSystem extends Thread {
    private Task task = null;
    private Player player = null;

    public TaskSystem(Player player, Task task) {
        if (player == null || task == null) //非空验证
            throw new NullPointerException("Player or Task required not null！");

        this.player = player;
        this.task = task;

        System.out.println(player.getName() + "接受任务：" + task.getName());
        System.out.println("任务需求：" + task.getProgress());
        System.out.println("系统开始监听。");
    }

    @Override
    public void run() {
        while (!task.isComplete()) {
            if (player.isNotify()) {
                update();
                player.setNotify(false);
            }
        }

        System.out.println(this.task.getProgress() + "任务完成，监听结束。");
    }

    public void update() {
        task.increment();
        task.getProgress();
    }

}
