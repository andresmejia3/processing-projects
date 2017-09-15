package weapon;

public abstract class Weapon {
  String name;
  int damage;
  int startingAmmo;
  int currentAmmo;

  public Weapon(String name, int damage, int startingAmmo) {
    this.name = name;
    this.damage = damage;
    this.startingAmmo = startingAmmo;
  }

  //MELEE
  //RANGE
  //EXPLOSIVE


}
