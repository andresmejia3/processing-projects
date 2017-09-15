package users.team;

import java.util.ArrayList;
import users.player.Player;

public class TeamManager {
  private ArrayList<Team> teams;

  public TeamManager() {
    teams = new ArrayList<>();
  }

  public boolean sameTeam(Player player1, Player player2) {
    for (Team team : teams)
      if (team.contains(player1))
        return team.contains(player2);
    return false;
  }

  public void addTeam(Team team) {
    teams.add(team);
  }
}
