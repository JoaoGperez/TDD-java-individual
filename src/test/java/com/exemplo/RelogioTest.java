package test.java.com.exemplo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.exemplo.Relogio;

public class RelogioTest {
 private Relogio relogio;

    @BeforeEach
    public void setUp() {
        relogio = new Relogio();
    }

    @Test
    public void testHoraMinutoSegundo() {
        assertEquals("00:00:00", relogio.getHora());
    }

    @Test
    public void testReiniciarMeiaNoite() {
        relogio.reiniciarMeiaNoite();
        assertEquals("00:00:00", relogio.getHora());
    }

    @Test
    public void testMarcarIntervalo() {
        relogio.marcarInicioIntervalo();
        // Simule o tempo passando (pode variar dependendo do mecanismo de simulação de tempo usado)
        // relogio.simularTempoPassando(); 
        relogio.marcarFimIntervalo();
        assertEquals("00:00:10", relogio.tempoDecorrido());
    }

    @Test
    public void testFormatoHora24Horas() {
        relogio.setFormato24Horas(true);
        assertEquals("00:00:00", relogio.getHora());
    }

    @Test
    public void testFormatoAMPM() {
        relogio.setFormato24Horas(false);
        assertEquals("12:00:00 AM", relogio.getHora());
    }

}


