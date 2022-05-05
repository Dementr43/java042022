package ru.gb.obalin.Homework6;

public class Animal {
    private String type;
    private int run;
    private int swims;
    private int limitedRun;
    private int limitedSwim;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwims() {
        this.swims = swims;
    }

    public void setSwims(int swims) {
        if (swims > limitedSwim) {
            System.out.println("утонул");
        }
        this.swims = swims;
    }
    public int getLimitedRun() {
        return limitedRun;
    }

    public void setLimitedRun(int limitedRun) {
        this.limitedRun = limitedRun;
    }

    public int getLimitedSwim() {
        return limitedSwim;
    }

    public void setLimitedSwim(int limitedSwim) {
        this.limitedSwim = limitedSwim;
    }
}
