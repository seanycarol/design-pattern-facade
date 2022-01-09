package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Emprestimo {
    private List<Cliente> clientesNegativados = new ArrayList<>();

    public void addClienteNegativado(Cliente cliente) {
        this.clientesNegativados.add(cliente);
    }

    public boolean verificarClienteNegativado(Cliente cliente) {
        return this.clientesNegativados.contains(cliente);
    }
}
