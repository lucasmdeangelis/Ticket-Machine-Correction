import org.junit.Before;
import org.junit.Test;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

import static org.junit.Assert.*;

public class TestTicketMachine {

    private TicketMachine ticketMachine;

    @Test
    public void testConstructor() {
        TicketMachine machine = new TicketMachine(50);
        assertEquals(0, machine.getSaldo());
    }

    @Test
    public void testSaldoAposInsercaoCorreta() {
        try {
            ticketMachine.inserir(30);
            assertEquals(45, ticketMachine.getSaldo());
        } catch (PapelMoedaInvalidaException e) {
            //
        }
    }

}