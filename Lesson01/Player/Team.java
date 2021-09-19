package Lesson01.Player;

public class Team {
    String teamName;
    Players[] teamMembers = new Players[4];

    public Team(String teamName, Players[] teamMembers){
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){
        return "Team name:" + teamName;
    }
    public Players[] getMembers(){
        return teamMembers;
    }
    public void showResults(){
        for(Players c: teamMembers){
            c.showResult();
        }
    }
    public void  showMembersFinishedCourse() {
        for (Players c : teamMembers) {
            if (c.isOnDistance())
                c.showResult();
        }
    }
}
