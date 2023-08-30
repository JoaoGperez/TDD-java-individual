package test.java.com.exemplo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RelogioTest {
	@Test
	public void testHora() {
		Relogio relogio = new Relogio();
		String result = relogio.setHora("5");
		assertEquals("5", result);
	}

}


