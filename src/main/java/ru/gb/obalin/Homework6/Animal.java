package ru.gb.obalin.Homework6;

public class Animal {
    private String type;
    private int run;
    private int swims;
    private int limitedRun;
    private int limitedSwim;

    public Animal(String type, int run, int swims, int limitedRun, int limitedSwim) {
        this.type = type;
        setRun(run);
        setSwims(swims);
        this.limitedRun = limitedRun;
        this.limitedSwim = limitedSwim;
    }

    public void printInfo() {
        System.out.print(type + " " + run + " " + swims);
    }

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
        if (run > limitedRun) {
            System.out.println("устал. ");
        }
        this.run = run;
    }

    public int getSwims() {
        return swims;
    }

    public void setSwims(int swims) {
        if (swims > limitedSwim) {
            System.out.println("утонул. ");
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
