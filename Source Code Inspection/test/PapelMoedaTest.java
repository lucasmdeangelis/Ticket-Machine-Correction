import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import br.calebe.ticketmachine.core.PapelMoeda;

public class PapelMoedaTest {

    @Test
    public void getValorTest() {
        PapelMoeda papelMoeda = new PapelMoeda(10, 5);
        int result = papelMoeda.getValor();
        assertEquals(10, result);
    }

    @Test
    public void getQuantidadeTest() {
        PapelMoeda papelMoeda = new PapelMoeda(5, 8);
        assertEquals(8, papelMoeda.getQuantidade());
    }
}
