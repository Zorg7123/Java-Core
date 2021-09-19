package Lesson01.Player;

public interface Players {
    void run(int distance);
    void swim(int distance);
    void jump(int height);
    boolean isOnDistance();
    void showResult();
}
