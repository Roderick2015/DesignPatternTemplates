package org.roderick.template;

/**
 * 搬砖工B
 */
public class HimmaB extends AbsHimma {
    private String task = "";

    @Override
    public void sign() { System.out.println("HimmaB来签到"); }

    @Override
    protected void receiveTask(String task) {
        this.task = task;
        System.out.println("HimmaB接受任务:" + task);
    }

    @Override
    protected void doWork() { System.out.println("HimmaB跑去搬" + task); }

    @Override
    protected boolean hasEmotion() {
        if (this.money < 500)
            return true; //低于行价，我有话要说
        else
            return false;
    }

    @Override
    protected void releaseEmotion() {
        if (this.money == 0)
            System.out.println("由于拖欠工资，HimmaB与包工头大战了三百回合！");
        else
            System.out.println("HimmaB吃了亏，很生气，明天找老王理论!");
    }
}
