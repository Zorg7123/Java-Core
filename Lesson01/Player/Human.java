package Lesson01.Player;

public class Human implements Players {
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 2000;
        this.maxJumpHeight = 2;
        this.maxSwimDistance = 100;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(name + " " + "кросс преодолен");
        } else {
            System.out.println(name + " " + "кросс не преодолен");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(name + " " + "препятствие преодолено");
        } else {
            System.out.println(name + " " + "препятствие не преодолено");
            onDistance = false;
        }
    }

    public void swim(int distance){
        if (distance <=maxSwimDistance){
            System.out.println(name + " " + "плавание преодолено");
        } else {
            System.out.println(name + " " + "плавание не преодолено");
            onDistance = false;
        }
    }

    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }
}
