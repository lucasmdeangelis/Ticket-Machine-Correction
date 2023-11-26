import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import br.calebe.ticketmachine.core.Troco;
import br.calebe.ticketmachine.core.PapelMoeda;

public class TrocoTest {

    private Troco troco;

    @Test
    public void testTrocoIterator() {
        Iterator<PapelMoeda> iterator = troco.getIterator();

        assertTrue(iterator.hasNext());
        assertEquals(100, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(50, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(20, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(10, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(5, iterator.next().getValor());

        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next().getValor());

        assertFalse(iterator.hasNext());
    }
}