public class Pagamento {
    private double valorPago;

    public Pagamento(double valorPago) {
        this.valorPago = valorPago;
    }

    public boolean validarPagamento(double tarifa) {
        return valorPago >= tarifa;
    }
}

