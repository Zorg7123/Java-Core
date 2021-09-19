package Lesson01;

import Lesson01.Player.*;
import Lesson01.barriers.*;

public class Main {
        public static void main(String[] args) {
        Players[] player = {new Human("Джек"), new Cat("Барсик"), new Dog("Шарик")};
        barrier[] barriers = {new Cross(3000), new Wall(2), new Water(10)};

    Team team = new Team(" Winners", player);

    System.out.println("===========create new team=============");
    System.out.println(team.getTeamName());

    System.out.println("======greeting team membera=========");
    team.showResults();

    Course course = new Course(barriers);

    System.out.println("=====team goes to course======");
    course.doIt(team);

    System.out.println("======show team results=========");
    team.showResults();

    System.out.println("=======team members finihed=====");
    team.showMembersFinishedCourse();
    }
}
