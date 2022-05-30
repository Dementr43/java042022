package ru.gb.obalin;


import ru.gb.obalin.obstruction.Obstruction;
import ru.gb.obalin.obstruction.Treadmill;
import ru.gb.obalin.obstruction.Wall;
import ru.gb.obalin.participant.Cat;
import ru.gb.obalin.participant.Human;
import ru.gb.obalin.participant.Participant;
import ru.gb.obalin.participant.Robot;

import java.util.Random;

public class Executor {

    public static void main(String[] args) {

        Random random = new Random();
        Participant[] participants = {
                new Human(random.nextInt(500), random.nextInt(3)),
                new Robot(random.nextInt(500), random.nextInt(3)),
                new Cat(random.nextInt(500), random.nextInt(3))
        };

        Obstruction[] obstructions = {
                new Wall(random.nextInt(3)),
                new Treadmill(random.nextInt(500))
        };

        for (Participant participant : participants) {
            for (Obstruction obstruction : obstructions) {
                if (!obstruction.overcome(participant)) {
                    break;
                }
            }
        }
    }
}
