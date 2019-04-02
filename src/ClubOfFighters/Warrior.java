package ClubOfFighters;

public class Warrior {

    private int hitPoint;
    private int health;

    public Warrior(int hitPoint, int health) {
        this.hitPoint = hitPoint;
        this.health = health;
    }

    public void hit(Warrior anotherWarrior) {
        anotherWarrior.health -= this.hitPoint;
        // System.out.println(new Warrior(5, 20).toString() + " megütöttelek wazze");
        System.out.println(this + " " + anotherWarrior);
    }

    @Override
    public String toString() {
        return "Iam a warrior, " +
                "ekkorát csapok: " + hitPoint +
                ", ennyit üssé': " + health;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
