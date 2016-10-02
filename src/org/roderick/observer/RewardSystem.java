package org.roderick.observer;

/**
 * 奖励系统
 */
public class RewardSystem implements Observer, GameSystem {
    public void update(ZhangSan player, TaskInfo task) {
        if (player == null || task == null) //非空验证
            throw new NullPointerException("ZhangSan or TaskInfo required not null！");

        if (task.isComplete()) //判断任务是否完成
            System.out.println("奖励系统：" + player.getName() + "获得奖励247金币");
    }
}
