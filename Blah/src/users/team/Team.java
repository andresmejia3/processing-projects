package users.team;

import java.util.ArrayList;
import users.player.Player;

public class Team {
  private ArrayList<Player> members;
  private int id;
  private static int numOfTeams;

  public Team() {
    id = ++numOfTeams;
    members = new ArrayList<>();
  }

  public void addMember(Player player) {
    members.add(player);
  }

  public void removeMember(Player player) {
    members.remove(player);
  }

  public boolean contains(Player player) {
    return members.contains(player);
  }

  public int getId() {
    return id;
  }
}
