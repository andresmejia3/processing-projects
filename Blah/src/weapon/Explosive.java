package weapon;

public class Explosive extends Weapon implements Reloadable{
  private int numFired;
  private double timeDelay;
  private double radius;

  @Override
  public void reload(int ammo) {
    this.currentAmmo += ammo;
  }

  public Explosive(String name, int damage, int ammo, int numFired, double timeDelay, double radius) {
    super(name, damage, ammo);
    this.numFired = numFired;
    this.timeDelay = timeDelay;
    this.radius = radius;

  }


}
