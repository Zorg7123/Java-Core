package Lesson01.barriers;

import Lesson01.Player.Players;

public class Wall extends barrier{
    private int height;
    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Players players) {
        players.jump(height);
    }
}
