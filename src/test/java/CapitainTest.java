import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitainTest {

    @Test
    void deveRetornarDanoComPistola() {
        Item item = new Pistol();
        Capitain capitain = new Capitain(100.0f);
        capitain.setItem(item);
        assertEquals(180.0f, capitain.calculateDamage(), 0.01f);
    }

    @Test
    void deveRetornarDanoComSMG() {
        Item item = new SMG();
        Capitain capitain = new Capitain(100.0f);
        capitain.setItem(item);
        assertEquals(195.0f, capitain.calculateDamage(), 0.01f);
    }

    @Test
    void deveRetornarDanoComFuzil() {
        Item item = new Rifle();
        Capitain capitain = new Capitain(100.0f);
        capitain.setItem(item);
        assertEquals(225.0f, capitain.calculateDamage(), 0.01f);
    }
}