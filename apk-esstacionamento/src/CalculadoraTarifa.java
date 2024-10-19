public class CalculadoraTarifa {
    private static final double TARIFA_HORA = 5.0;

    public static double calcularTarifa(long tempoEstacionadoMillis) {
        long horas = (tempoEstacionadoMillis / (1000 * 60 * 60)) + 1; // Arredondando para cima
        return horas * TARIFA_HORA;
    }
}
