package Lesson01.barriers;

import Lesson01.Player.Players;

public class Cross extends barrier {
    private int distance;
    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Players players) {
        players.run(distance);
    }
}
