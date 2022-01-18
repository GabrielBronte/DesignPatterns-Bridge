public class Capitain extends Character{

    public Capitain(float dano) {
        super(dano + 50);
    }
    public float calculateDamage() {
        return this.dano * (1 + this.item.extraDamage());
    }
}