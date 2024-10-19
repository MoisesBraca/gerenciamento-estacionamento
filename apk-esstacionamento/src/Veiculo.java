public class Veiculo {
    private String placa;
    private long horaEntrada;
    private long horaSaida;

    public Veiculo(String placa) {
        this.placa = placa;
        this.horaEntrada = System.currentTimeMillis();
    }

    public void registrarSaida() {
        this.horaSaida = System.currentTimeMillis();
    }

    public long getTempoEstacionado() {
        return horaSaida - horaEntrada;
    }

    public String getPlaca() {
        return placa;
    }
}

