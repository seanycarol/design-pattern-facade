package facade;

public class ClienteFacade {

    public static boolean verificaAutorizacaoParaEmprestimo(Cliente cliente) {
        if (CreditoAutomotivo.getInstancia().verificarClienteNegativado(cliente)) {
            return false;
        }
        if (CreditoHabitacional.getInstancia().verificarClienteNegativado(cliente)) {
            return false;
        }
        if (CreditoPessoal.getInstancia().verificarClienteNegativado(cliente)) {
            return false;
        }
        return true;
    }
}
