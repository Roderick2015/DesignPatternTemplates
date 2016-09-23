package org.roderick.template;

/**
 * 搬砖工A
 */
public class HimmaA extends AbsHimma {
    private String task = "";

    @Override
    public void sign() { System.out.println("HimmaA来签到"); }

    @Override
    protected void receiveTask(String task) {
        this.task = task;
        System.out.println("HimmaA接受任务:" + task);
    }

    @Override
    protected void doWork() { System.out.println("HimmaA跑去搬" + task); }
}
