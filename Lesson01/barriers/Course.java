package Lesson01.barriers;

import Lesson01.Player.Players;
import Lesson01.Player.Team;

public class Course {
    barrier[] barriers;
    public Course(barrier[] barriers) {
        this.barriers = barriers;
    }
    public void doIt(Team team) {
        Players[] teamMembers = team.getMembers();
        if(teamMembers.length > 0) {
            for (Players c: teamMembers) {
                for (barrier o: barriers) {
                    o.doIt(c);
                    if (!c.isOnDistance()) break;
                }
            }
        }  else {
            System.out.println("В команде нет игроков!");
        }
    }
}
