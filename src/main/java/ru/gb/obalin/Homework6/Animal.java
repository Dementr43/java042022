package ru.gb.obalin.Homework6;

public class Animal {
    private String type;
    private int swims;
    private int run;
    private int limitedRun;
    private int limitedSwim;

    public Animal (String type, int swims, int run, int limitedRun, int limitedSwim) {
        this.type = type;
        this.swims = swims;
        this.run = run;
        this.limitedRun = limitedRun;
        this.limitedSwim = limitedSwim;
    }

    public Animal() {
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getSwims() {
        return swims;
    }
    public void setSwims(int swims) {
        this.swims = swims;
    }
    public int getRun() {
        return run;
    }
    public void setRun(int run) {
        this.run = run;
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

    protected void run(int limitedRun) {
        if (run >= limitedRun) {
            System.out.println(this.type + " пробежал(а) " + limitedRun + "м.");
        } else {
            System.out.println(this.type + " устал(а).");
        }
    }

    protected void swim(int limitedSwim) {
        if (swims >= limitedSwim) {
            System.out.println(this.type + " проплыл(а)" + limitedSwim + "м.");
        } else {
            System.out.println(this.type + " утонул(а).");
        }
    }


}
