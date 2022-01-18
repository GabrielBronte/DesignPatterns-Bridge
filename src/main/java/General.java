public class General extends Character{
    private int stars;

    public General(float dano) {
        super(dano);
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public float calculateDamage() {
        return this.dano * this.stars * (1 + this.item.extraDamage());
    }
}
