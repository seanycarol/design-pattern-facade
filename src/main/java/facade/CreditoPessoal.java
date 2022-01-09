package facade;

public class CreditoPessoal extends Emprestimo {

    private static CreditoPessoal creditoEstudantil = new CreditoPessoal();

    private CreditoPessoal() {};

    public static CreditoPessoal getInstancia() {
        return creditoEstudantil;
    }
}
