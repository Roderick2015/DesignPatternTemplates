package org.roderick.template;

/**
 * 抽象模板类
 */
public abstract class AbsHimma implements Himma {
    protected double money = 0;
    private boolean payFlag = true;

    protected abstract void sign();

    protected abstract void receiveTask(String task);

    protected void doWork() {
        throw new UnsupportedOperationException();
    }

    protected void getPay(double money) { System.out.println("活干完了，拿到工钱" + money + "元"); }

    protected boolean hasEmotion() { return false; }

    protected void releaseEmotion() { } //需要发牢骚的请覆写该方法

    @Override
    final public void moveBricks(String task) {
        sign();
        receiveTask(task);
        doWork();
        if (this.payFlag) getPay(this.money);
        if (hasEmotion()) releaseEmotion();
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void isPay(boolean payFlag) {
        this.payFlag = payFlag;
        if (!payFlag) this.money = 0;
    }
}
