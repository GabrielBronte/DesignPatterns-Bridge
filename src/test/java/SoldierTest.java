import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {

    @Test
    void deveRetornarDanoComPistola() {
        Item item = new Pistol();
        Soldier soldier = new Soldier(100.0f);
        soldier.setItem(item);
        assertEquals(120.0f, soldier.calculateDamage(), 0.01f);
    }

    @Test
    void deveRetornarDanoComSMG() {
        Item item = new SMG();
        Soldier soldier = new Soldier(100.0f);
        soldier.setItem(item);
        assertEquals(120.0f, soldier.calculateDamage(), 0.01f);
    }

    @Test
    void deveRetornarDanoComFuzil() {
        Item item = new Rifle();
        Soldier soldier = new Soldier(100.0f);
        soldier.setItem(item);
        assertEquals(120.0f, soldier.calculateDamage(), 0.01f);
    }

}