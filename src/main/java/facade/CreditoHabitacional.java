package facade;

public class CreditoHabitacional extends Emprestimo {

    private static CreditoHabitacional creditoHabitacional = new CreditoHabitacional();

    private CreditoHabitacional() {};

    public static CreditoHabitacional getInstancia() {
        return creditoHabitacional;
    }
}
