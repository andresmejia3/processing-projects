package users.player;

import java.util.ArrayList;

public class Player {
  private String name;
  private int id;
  private boolean alive;
  private int health;
  private int energy;
  private Weapon currentWeapon;
  private ArrayList<Weapon> weapons;
  private int damageDealt;


  //TODO: Implement weapons stuff

  private static int numOfPlayers;

  Player() {
    id = ++numOfPlayers;
    name = "users.player.Player " + id;
    alive = true;
    health = 100;
    energy = 100;
    damageDealt = 0;
  }

  Player(String name) {
    this.name = name;
    id = ++numOfPlayers;
    alive = true;
    health = 100;
    energy = 100;
    damageDealt = 0;
  }


  public void addHealth(int amount) {

    if (health+amount > 100){
      health = 100;
    }
    else{
      health+=amount;
    }

  }

  public void damageDealt(int damage) {
    damageDealt += damage;
  }






















  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }
}
