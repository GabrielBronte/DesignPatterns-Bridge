import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneralTest {

    @Test
    void deveRetornarDanoComPistola() {
        Item item = new Pistol();
        General general = new General(100.0f);
        general.setItem(item);
        general.setStars(2);
        assertEquals(240.0f, general.calculateDamage(), 0.01f);
    }

    @Test
    void deveRetornarDanoComSMG() {
        Item item = new SMG();
        General general = new General(100.0f);
        general.setItem(item);
        general.setStars(2);
        assertEquals(260.0f, general.calculateDamage(), 0.01f);
    }

    @Test
    void deveRetornarDanoComFuzil() {
        Item item = new Rifle();
        General general = new General(100.0f);
        general.setItem(item);
        general.setStars(2);
        assertEquals(300.0f, general.calculateDamage(), 0.01f);
    }
}