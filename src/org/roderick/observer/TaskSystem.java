package org.roderick.observer;

/**
 * 任务系统
 */
public class TaskSystem implements Observer, GameSystem {
    public void update(ZhangSan player, TaskInfo task) {
        if (player == null || task == null) //非空验证
            throw new NullPointerException("ZhangSan or TaskInfo required not null！");

        //更新任务进度
        task.increment();

        if (task.isComplete()) //判断任务是否完成
            System.out.println("任务系统：" + player.getName() + "完成任务 " + task.getName());
    }
}
