package users;

import adt.CircularLinkedList;
import users.player.Player;

public class TurnManager {

  private CircularLinkedList<Player> roster;

  public TurnManager() {
    roster = new CircularLinkedList<>();
  }

  public void add(Player player) {
    roster.add(player);
  }

  public Player next() {
    try {
      return roster.next();
    } catch (NullPointerException e) {
      System.out.println("\n\nAdd a player to the roster first.\n\n");
    }
    return null;
  }

  public Player find(int id) {

  }
}
