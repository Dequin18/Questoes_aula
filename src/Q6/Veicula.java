package Q6;

public class Veiculo {

    private String Modelo;
    private String Marca;
    private double Valor;

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.Valor = valor;
        }
    }

    public String getModelo() {
        return this.Modelo;
    }

    public String getMarca() {
        return this.Marca;
    }

    public double getValor() {
        return this.Valor;
    }
}