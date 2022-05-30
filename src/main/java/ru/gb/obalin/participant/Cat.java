package ru.gb.obalin.participant;

public class Cat implements Participant {


    private final String PARTICIPANT = "Кот";
    private final int maxRunDistance;
    private final int maxJumpHeight;

    public Cat(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        if (maxRunDistance >= distance) {
            System.out.println(PARTICIPANT + " пробежал " + distance + " метров" );
            return true;

        } else {
            System.out.println(PARTICIPANT + " не преодолел " + distance + " метров");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (maxJumpHeight >= height) {
            System.out.println(PARTICIPANT + " прыгнул на " + height + " метров");
            return true;
        } else {
            System.out.println(PARTICIPANT + " не прыгнул на " + height + " метров");
            return false;
        }
    }
}
