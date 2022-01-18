public class Soldier extends Character{

    public Soldier(float dano) {
        super(dano + 20);
    }
    public float calculateDamage() {
        return this.dano;
    }
}