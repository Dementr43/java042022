package ru.gb.obalin.obstruction;


import ru.gb.obalin.participant.Participant;

public class Wall implements Obstruction {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.jump(height);
    }
}
