package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveRetornarClienteNegativadoParaCreditoAutomotivo() {
        Cliente cliente = new Cliente();
        CreditoAutomotivo.getInstancia().addClienteNegativado(cliente);

        assertEquals(false, cliente.podePegarEmprestimo());
    }

    @Test
    void deveRetornarClienteNegativadoParaCreditoHabitacional() {
        Cliente cliente = new Cliente();
        CreditoHabitacional.getInstancia().addClienteNegativado(cliente);

        assertEquals(false, cliente.podePegarEmprestimo());
    }

    @Test
    void deveRetornarClienteNegativadoParaCreditoPessoal() {
        Cliente cliente = new Cliente();
        CreditoPessoal.getInstancia().addClienteNegativado(cliente);

        assertEquals(false, cliente.podePegarEmprestimo());
    }

    @Test
    void deveRetornarClienteAutorizadoParaEmprestimo() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.podePegarEmprestimo());
    }
}