package Lesson01.Player;

public abstract class Animal implements Players{
    String type;
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;
    public boolean isOnDistance() {
        return  onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpDistance, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public void run(int distance){
        if (distance <=maxRunDistance){
            System.out.println(type + " " + name + " " + "кросс преодолен");
        } else {
            System.out.println(type + " " + name + " " + "кросс не преодолен");
            onDistance = false;
        }
    }
    public void jump(int height){
        if (height <=maxJumpHeight){
            System.out.println(type + " " + name + " " + "препятствие преодолено");
        } else {
            System.out.println(type + " " + name + " " + "препятствие не преодолено");
            onDistance = false;
        }
    }
    public void swim(int distance){
        if (maxSwimDistance == 0){
            System.out.println(type + " " + name + "не умеет плавать");
            onDistance = false;
            return;
        }
        if (distance <=maxSwimDistance){
            System.out.println(type + " " + name + " " + "плавание преодолено");
        } else {
            System.out.println(type + " " + name + " " + "плавание непреодолено");
            onDistance = false;
        }
    }
    public void showResult(){
        System.out.println(type + " " + name + ":" + onDistance);
    }

}
