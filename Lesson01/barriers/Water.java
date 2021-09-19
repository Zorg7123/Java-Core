package Lesson01.barriers;

import Lesson01.Player.Players;

public class Water extends barrier {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Players players) {
        players.swim(distance);
    }
}
