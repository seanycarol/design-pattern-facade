package facade;

public class Cliente {
    public boolean podePegarEmprestimo() {
        return ClienteFacade.verificaAutorizacaoParaEmprestimo(this);
    }
}
