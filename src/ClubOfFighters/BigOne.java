package ClubOfFighters;

public class BigOne extends Warrior {

    private int stamina;

    public BigOne(int hitPoint, int health, int stamina) {
        super(hitPoint, health);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public int getHealth() {
        return super.getHealth() + this.getStamina();
    }

    @Override
    public String toString() {
        return "BigOne{" +
                "stamina=" + stamina +
                "} " + super.toString() +
                "Imma BigOne " + this.stamina;
    }
}
