public abstract class Character {

    protected Item item;

    protected float dano;

    public Personagem(float dano) {
        this.dano = dano;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setDano(float dano) {
        this.dano = dano;
    }

    public abstract float calcularDano();
}