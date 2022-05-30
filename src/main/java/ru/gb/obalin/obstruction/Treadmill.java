package ru.gb.obalin.obstruction;


import ru.gb.obalin.participant.Participant;

public class Treadmill implements Obstruction{
    private final int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.run(distance);
    }
}