package facade;

public class CreditoAutomotivo extends Emprestimo {

    private static CreditoAutomotivo creditoAutomotivo = new CreditoAutomotivo();

    private CreditoAutomotivo() {};

    public static CreditoAutomotivo getInstancia() {
        return creditoAutomotivo;
    }
}
