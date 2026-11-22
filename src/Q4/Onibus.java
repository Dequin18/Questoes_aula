package Q4;

public class Onibus {

    private String Placa;
    private String Modelo;
    private int Capacidade;

    public void setPlaca(String placa) {
        this.Placa = placa;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public void setCapacidade(int numero) {
        if (numero >= 10) {
            this.Capacidade = numero;
        }
    }

    public String getPlaca() {
        return this.Placa;
    }

    public String getModelo() {
        return this.Modelo;
    }

    public int getCapacidade() {
        return this.Capacidade;
    }
}