package Q2;

public class Reserva {

    private String DataEntrada;
    private String DataSaida;
    private String Status;

    public void setDataEntrada(String entrada) {
        this.DataEntrada = entrada;
    }

    public void setDataSaida(String saida) {
        this.DataSaida = saida;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public String getDataEntrada() {
        return this.DataEntrada;
    }

    public String getDataSaida() {
        return this.DataSaida;
    }

    public String getStatus() {
        return this.Status;
    }
}